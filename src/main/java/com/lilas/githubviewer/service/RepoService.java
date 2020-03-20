package com.lilas.githubviewer.service;


import com.lilas.githubviewer.dto.mapping.SearchDTO;
import com.lilas.githubviewer.dto.repo.GitPepoDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Service
public class RepoService extends BaseService<SearchDTO, GitPepoDTO> {

    public RepoService() {
        super(GitPepoDTO.class);
    }

    @Override
    protected URI createUrl(SearchDTO searchDTO) {
        return UriComponentsBuilder.fromUriString(baseUrl)
                .path(searchUrl)
                .queryParam("q", searchDTO.getFilter())
                .queryParam("per_page", searchDTO.getSize())
                .queryParam("page", searchDTO.getPage() + 1)
                .build()
                .toUri();
    }


    public GitPepoDTO search(SearchDTO searchDTO) {
        Optional<GitPepoDTO> result = super.call(searchDTO);
        return result.orElse(null);
    }


}
