package com.p.k.functionalapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainPageController {

    @GetMapping(value = "/")
    public ModelAndView getMainPage() {
        ModelAndView mav = new ModelAndView("mainPage");
        return mav;
    }

    @GetMapping(value = "/selectMap1")
    public ModelAndView getMapping1() {
        ModelAndView mav = new ModelAndView("selectPageAction1");
        return mav;
    }

    @GetMapping(value = "/selectMap2")
    public ModelAndView getMapping2() {
        ModelAndView mav = new ModelAndView("selectPageAction2");
        return mav;
    }

}


