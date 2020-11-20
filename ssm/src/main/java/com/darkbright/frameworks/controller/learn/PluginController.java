package com.darkbright.frameworks.controller.learn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/plugin")
public class PluginController {

    @GetMapping("/jqueryui")
    public ModelAndView enterJqueryUi(){
        return new ModelAndView("plugin/jqueryui");
    }

    

}
