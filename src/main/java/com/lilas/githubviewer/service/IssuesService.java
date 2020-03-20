package com.lilas.githubviewer.service;

import com.lilas.githubviewer.dto.issue.IssueDTO;
import com.lilas.githubviewer.dto.mapping.MappingIssueDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Service
public class IssuesService extends BaseService<MappingIssueDTO, IssueDTO[]> {
    public IssuesService() {
        super(IssueDTO[].class);
    }


    @Override
    protected URI createUrl(MappingIssueDTO mappingIssueDTO) {

        return UriComponentsBuilder.fromUriString(baseUrl)
                .path(String.format(issuesUrl, mappingIssueDTO.getFullName()))
                .queryParam("sta", "closed")
                .build()
                .toUri();
    }

    public IssueDTO[] issuesInfo(MappingIssueDTO mappingIssueDTO) {
        Optional<IssueDTO[]> result = super.call(mappingIssueDTO);
        return result.orElse(null);
    }

}
