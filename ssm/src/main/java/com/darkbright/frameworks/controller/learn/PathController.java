package com.darkbright.frameworks.controller.learn;

import com.darkbright.frameworks.service.PathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/paths")
public class PathController {
    
    final private PathService pathService;
    
    @Autowired
    public PathController(PathService pathService) {
        this.pathService = pathService;
    }
    
    @GetMapping
    public ModelAndView ShowPath(){
        ModelAndView mav = new ModelAndView("learn/show_path");
        mav.addObject("path",pathService.JavaGetPath());
        return mav;
    }
    
}
