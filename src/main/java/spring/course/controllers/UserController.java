package spring.course.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.course.model.UserModel;
import spring.course.services.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {

    private UserService service;
    public UserController(@Qualifier("Primary") UserService userService) {
       this.service = userService;
    }


    @GetMapping("/getUser/{userName}")
    public ResponseEntity<UserModel> getUser(@PathVariable("userName") String userName)
    {
        //return "User: John Doe";
        //return "<html><body><h1>The browser renders the HTML<h1><body><html>";
        /*if (userMap.containsKey(userName))
        {
            return ResponseEntity.of(Optional.of(userMap.get(userName)));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }*/
        //userMap.get(userName);
        //return new UserModel("John", "Doe",1234);
        //return userMap.get(userName);

        return ResponseEntity.of(Optional.ofNullable(service.getUser(userName)));
    }

    @PostMapping("/addUser")
    public ResponseEntity<HttpStatus> createUser(@RequestBody() UserModel user)
    {

        service.addUser(user);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("/deleteUser/{userName}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("userName") String userName)
    {
       service.deleteUser(userName);
        return ResponseEntity.noContent().build();
    }
}
