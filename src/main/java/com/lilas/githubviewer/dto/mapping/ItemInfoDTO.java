package com.lilas.githubviewer.dto.mapping;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemInfoDTO {
    private String createDate;
    private String updateDate;
    private String description;
    private String owner;

    public String getUpdateDate() {
        return updateDate.trim();
    }
}
