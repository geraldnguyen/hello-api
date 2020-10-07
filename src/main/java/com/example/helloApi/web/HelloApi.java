package com.example.helloApi.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloApi {

  @Value("${hello.default:World}")
  private String defaultName;

  @GetMapping
  public String hello(){
    return helloName(defaultName);
  }

  @GetMapping("/{name}")
  public String helloName(@PathVariable("name") String name) {
    return String.format("Hello %s", name);
  }
}