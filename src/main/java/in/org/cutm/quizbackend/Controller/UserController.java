package in.org.cutm.quizbackend.Controller;

import in.org.cutm.quizbackend.Entity.UserInfo;
import in.org.cutm.quizbackend.Service.UserService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cutm/users")

public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService1){
        userService = userService1;
    }
    @PostMapping
    public ResponseEntity<UserInfo> saveUserInfo(@RequestBody UserInfo userInfo){
        return new ResponseEntity<UserInfo>(userService.saveUser(userInfo), HttpStatus.CREATED);

    }

    //Get all the user info
    @GetMapping
    public List<UserInfo> getAllUser(){
        return userService.getUserInfo();
    }

    //Get the user by id
    @GetMapping("{id}")
    public UserInfo getUserById(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }

    //update the user by id

    @PutMapping("{id}")
    public ResponseEntity<String> updateUserInfo(@RequestBody UserInfo userInfo,@PathVariable("id") Integer id){
        userService.updateUserInfo(userInfo,id);
        return new ResponseEntity<String>("User Information updated", HttpStatus.NOT_FOUND);
    }

    //delete user by id
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return ResponseEntity.ok("User with id " + id + " deleted ");
    }





}
