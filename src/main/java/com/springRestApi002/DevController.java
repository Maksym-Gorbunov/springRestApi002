package com.springRestApi002;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {

  // http://localhost:9090/developers
  @GetMapping("developers")
  public String getDevelopers(){
    return "developers 002";
  }

}
