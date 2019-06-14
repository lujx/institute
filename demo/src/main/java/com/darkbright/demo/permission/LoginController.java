package com.darkbright.demo.permission;

import com.darkbright.demo.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * description here.
 *
 * @author boolo
 * @date 2019-01-18 10:37
 **/
@RestController
@CrossOrigin
public class LoginController {

  @Autowired
  private PathUtil pathUtil;
  @Autowired
  private HttpServletRequest request;



  @RequestMapping("/")
  String home() {
    return "Hello World!";
  }

  @RequestMapping("/test-path")
  String testPath(){
    pathUtil.getPath(this.getClass(), request);
    return "Testing path!";
  }
}
