package com.lilas.githubviewer.dto.commits;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommitDTO {
    @JsonProperty("committer")
    private CommitterDTO committerDTO;
    @JsonProperty("message")
    private String message;
    @JsonProperty("url")
    private String url;
    @JsonProperty("comment_count")
    private String commentCount;


}
