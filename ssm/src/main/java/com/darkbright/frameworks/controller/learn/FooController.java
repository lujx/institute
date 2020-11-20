package com.darkbright.frameworks.controller.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/foo")
public class FooController {
    
    private Logger logger = LoggerFactory.getLogger("FooController.class");
    
    @GetMapping
    public String enterFoo(){
        return "learn/foo";
    }
    
    @PostMapping
    public void receiveForm(HttpServletRequest request){
        logger.info("Form数据：" + request.getServletPath());
        
        
    }
    
}
