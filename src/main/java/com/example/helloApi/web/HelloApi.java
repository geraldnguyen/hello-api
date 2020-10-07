package com.example.helloApi.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RequestMapping("/hello")
@RestController
@Log4j2
public class HelloApi {

  @Value("${hello.default:World}")
  private String defaultName;

  @GetMapping
  public String hello(){
    return helloName(defaultName);
  }

  @GetMapping("/{name}")
  public String helloName(@PathVariable("name") String name) {
    String response = String.format("Hello %s", name);
    log.info(response);
    return response;
  }
}