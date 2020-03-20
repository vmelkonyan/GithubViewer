package com.lilas.githubviewer.service;



import com.lilas.githubviewer.dto.commits.CommitModelDTO;
import com.lilas.githubviewer.dto.mapping.DetailsDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Service
public class CommitsService extends BaseService<DetailsDTO, CommitModelDTO[]> {

    public CommitsService() {
        super(CommitModelDTO[].class);
    }


    @Override
    protected URI createUrl(DetailsDTO detailsDTO) {

        return UriComponentsBuilder.fromUriString(baseUrl)
                .path(String.format(commitUrl, detailsDTO.getFullName()))
                .queryParam("sha", detailsDTO.getDefaultBranch())
                .build()
                .toUri();
    }

    public CommitModelDTO[] commitInfo(DetailsDTO detailsDTO) {
        Optional<CommitModelDTO[]> result = super.call(detailsDTO);
        return result.orElse(null);
    }


}
