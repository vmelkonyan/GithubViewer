package com.lilas.githubviewer.controller;


import com.lilas.githubviewer.constants.KeyConstants;
import com.lilas.githubviewer.dto.issue.IssueDTO;
import com.lilas.githubviewer.dto.mapping.MappingIssueDTO;
import com.lilas.githubviewer.exception.AppException;
import com.lilas.githubviewer.service.IssuesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Slf4j
@Controller
public class IssuesController {

    private IssuesService issuesService;

    @GetMapping(KeyConstants.ISSUES_KEY)
    public String showIssues(@Valid MappingIssueDTO mappingIssueDTO, Model model) throws AppException {
        IssueDTO[] issueDTOS = issuesService.issuesInfo(mappingIssueDTO);
        if (issueDTOS != null) {
            log.info("info_message ----> {}",issueDTOS.length);
            model.addAttribute("issues", issueDTOS);
            return KeyConstants.ISSUES_VIEW_KEY;
        } else {
            log.error("error_message {}", "result is null");
            throw new AppException();
        }
    }

    @Autowired
    public void setIssuesService(IssuesService issuesService) {
        this.issuesService = issuesService;
    }

    @ExceptionHandler(AppException.class)
    public ModelAndView handleError() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("errorMessage", "Something went wrong please try again");
        mav.setViewName("error");
        return mav;
    }
}
