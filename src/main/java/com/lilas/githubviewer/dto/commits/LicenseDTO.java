package com.lilas.githubviewer.dto.commits;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LicenseDTO {
    @JsonProperty("key")
    private String key;
    @JsonProperty("name")
    private String name;
    @JsonProperty("spdx_id")
    private String spdxId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("node_id")
    private String nodeId;

}
