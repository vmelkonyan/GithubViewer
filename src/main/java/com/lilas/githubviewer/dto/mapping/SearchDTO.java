package com.lilas.githubviewer.dto.mapping;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class SearchDTO {

    @NotBlank(message="spring")
    String filter;
    Integer size = 10;
    Integer page = 0;
}
