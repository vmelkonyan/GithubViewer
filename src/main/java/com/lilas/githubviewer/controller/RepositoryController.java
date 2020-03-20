package com.lilas.githubviewer.controller;

import com.lilas.githubviewer.constants.KeyConstants;
import com.lilas.githubviewer.dto.mapping.SearchDTO;
import com.lilas.githubviewer.dto.repo.GitPepoDTO;
import com.lilas.githubviewer.dto.repo.ItemDTO;
import com.lilas.githubviewer.exception.AppException;
import com.lilas.githubviewer.service.RepoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Slf4j
@Controller
public class RepositoryController {


    private RepoService repoService;

    @GetMapping(KeyConstants.REPO_LIST_KEY)
    public String getUserList(@Valid SearchDTO searchDTO, @PageableDefault Pageable pageable, Model model) throws AppException {
        GitPepoDTO gitPepoDTO = repoService.search(searchDTO);
        if(gitPepoDTO != null) {
            if (gitPepoDTO.getTotalCount() > 1000) {
                gitPepoDTO.setTotalCount(1000);
            }
            log.info("info_message {}",gitPepoDTO);
            Page<ItemDTO> page = new PageImpl<>(gitPepoDTO.getItemDTOS(), pageable, gitPepoDTO.getTotalCount());
            model.addAttribute("url", "/repoList");
            model.addAttribute("filter", searchDTO.getFilter());
            model.addAttribute("page", page);
            return KeyConstants.REPOLIST_VIEW_KEY;
        } else {
            log.error("error_message {}", "result is null");
            throw new AppException();
        }
    }

    @GetMapping("/")
    public String general() {
        return KeyConstants.SPLASH_VIEW_KEY;
    }

    @Autowired
    public void setRepoService(RepoService repoService) {
        this.repoService = repoService;
    }

    @ExceptionHandler(AppException.class)
    public ModelAndView handleError() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("errorMessage", "Something went wrong please try again");
        mav.setViewName("error");
        return mav;
    }

}