package com.sda.mvc.controller;

import com.sda.mvc.model.User;
import com.sda.mvc.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/cinema/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<String> findAllUsers(@RequestParam(value = "minAge", required = false) Integer a, @RequestParam(value = "maxAge", required = false) Integer b) {

        if ((a == null) || (b == null)) {
            return new ResponseEntity<>("Check them ages pal.", HttpStatus.BAD_REQUEST);

        }

        List<User> userListInAgeGroup = userService.findUsersInAgeGroup(a, b);
        log.info("we got here dude.");
        log.warn("Error");
        log.debug(userListInAgeGroup.toString());
        return new ResponseEntity<>(userListInAgeGroup.toString(), HttpStatus.OK);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello!";
    }

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        // TODO catch exeption & is the user saved?

        try {
            userService.saveUser(user);
        } catch (IllegalArgumentException e) {
            log.warn("Something went wrong! Please fill in all fields!");
        }

        log.info(user.toString());

        return new ResponseEntity<>("User:" + user, HttpStatus.CREATED);
    }

    @DeleteMapping("/users")
    public ResponseEntity<String> deleteUser(@RequestParam String username){
        User user = userService.deleteUser(username);
        return new ResponseEntity<>(user.toString(), HttpStatus.OK);


    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> catchRuntimeException(RuntimeException e) {
        return new ResponseEntity<>("Runtime exception " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
