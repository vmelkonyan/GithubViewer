package com.lilas.githubviewer.service;

import com.lilas.githubviewer.exception.AppException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Optional;

@Slf4j
public abstract class BaseService<T, K> {
    private WebClient webClient;

    @Value("${baseUrl}")
    String baseUrl;
    @Value("${searchUrl}")
    String searchUrl;
    @Value("${commitUrl}")
    String commitUrl;
    @Value("${issuesUrl}")
    String issuesUrl;

    @Autowired
    public void setWebClient(WebClient webClient) {
        this.webClient = webClient;
    }

    private final Class<K> clazz;


    protected BaseService(Class clazz) {
        this.clazz = clazz;
    }

    protected abstract URI createUrl(T searchObject);

    public Optional<K> call(T so) {
        final String url = createUrl(so).toString();
        log.info("created url ------> " + url);
        return Optional.ofNullable(webClient.get()
                .uri(url)
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError, clientResponse -> Mono.error(new AppException()))
                .onStatus(HttpStatus::is5xxServerError, clientResponse -> Mono.error(new AppException()))
                .bodyToMono(clazz)
                .block());
    }

}
