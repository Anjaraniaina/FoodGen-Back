package com.genfood.foodgenback.endpoint.rest.controller;

import com.genfood.foodgenback.endpoint.rest.controller.validator.MailValidator;
import com.genfood.foodgenback.model.User;
import com.genfood.foodgenback.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
  private final UserService userService;
  private final MailValidator mailValidator;

  @PutMapping("/user")
  public User Save(@RequestBody User userEntity) {
    mailValidator.accept(userEntity);
    return userService.saveUser(userEntity);
  }

  @GetMapping("/user/{username}")
  public User getByUsername(@PathVariable String username) {
    return userService.getUserByUsername(username);
  }
}