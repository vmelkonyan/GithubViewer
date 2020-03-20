package com.lilas.githubviewer.controller;


import com.lilas.githubviewer.constants.KeyConstants;
import com.lilas.githubviewer.dto.mapping.ItemInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;

@Slf4j
@Controller
public class ItemsController {

    @GetMapping(KeyConstants.ITEM_CLICK_KEY)
    public String itemClick(@Valid ItemInfoDTO itemInfoDTO, Model model) {
        model.addAttribute("selectedItem", itemInfoDTO);
        return KeyConstants.ITEM_DETILES_KEY;
    }

}
