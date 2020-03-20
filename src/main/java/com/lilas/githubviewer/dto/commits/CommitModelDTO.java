package com.lilas.githubviewer.dto.commits;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CommitModelDTO {
    @JsonProperty("sha")
    private String sha;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("commit")
    private CommitDTO commitDTO;
    @JsonProperty("url")
    private String url;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("comments_url")
    private String commentsUrl;
    @JsonProperty("author")
    private AuthorDTO authorDTO;
    @JsonProperty("committer")
    private CommitterDTO committerDTO;
    @JsonProperty("parents")
    private List<ParentsDTO> parents;
}
