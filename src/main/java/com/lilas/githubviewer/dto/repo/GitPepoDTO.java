package com.lilas.githubviewer.dto.repo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class GitPepoDTO {

    @JsonProperty("total_count")
    private int totalCount;
    @JsonProperty("incomplete_results")
    private Boolean incompleteResults;
    @JsonProperty("items")
    private List<ItemDTO> itemDTOS = null;
}
