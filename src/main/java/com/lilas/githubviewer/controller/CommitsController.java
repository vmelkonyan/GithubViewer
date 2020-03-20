package com.lilas.githubviewer.controller;


import com.lilas.githubviewer.constants.KeyConstants;
import com.lilas.githubviewer.dto.commits.CommitModelDTO;
import com.lilas.githubviewer.dto.mapping.DetailsDTO;
import com.lilas.githubviewer.exception.AppException;
import com.lilas.githubviewer.service.CommitsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Arrays;

@Slf4j
@Controller
public class CommitsController {
    private CommitsService commitsService;

    @GetMapping(KeyConstants.COMMITERS_KEY)
    public String showCommitter(@Valid DetailsDTO detailsDTO, Model model) {
        CommitModelDTO[] commitModelDTOList = commitsService.commitInfo(detailsDTO);
        model.addAttribute("commiters", commitModelDTOList);
        return KeyConstants.COMMITERS_VIEW_KEY;
    }

    @GetMapping(KeyConstants.COMMIT_KEY)
    public String showCommits(@Valid DetailsDTO detailsDTO, Model model) throws AppException {
        CommitModelDTO[] commitModelDTOList = commitsService.commitInfo(detailsDTO);
        if (commitModelDTOList != null) {
            log.info("info_message {}",commitModelDTOList.length);
            model.addAttribute("commits", commitModelDTOList);
            log.info("response_result -------> " + Arrays.toString(commitModelDTOList));
            return KeyConstants.COMMIT_VIEW_KEY;
        } else {
            log.error("error_message {}", "result is null");
            throw new AppException();
        }

    }

    @Autowired
    public void setCommitsService(CommitsService commitsService) {
        this.commitsService = commitsService;
    }

    @ExceptionHandler(AppException.class)
    public ModelAndView handleError() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("errorMessage", "Something went wrong please try again");
        mav.setViewName("error");
        return mav;
    }
}
