package com.lilas.githubviewer.dto.commits;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ParentsDTO {
    @JsonProperty("sha")
    private String sha;
    @JsonProperty("url")
    private String url;
    @JsonProperty("html_url")
    private String html_url;
}
