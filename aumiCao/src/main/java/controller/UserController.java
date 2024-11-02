package controller;


import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.UserService;

@Controller
@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    public UserService userService;


    @PostMapping("")
    public ResponseEntity<User> userSave(User user){
        return ResponseEntity.status(HttpStatus.OK).body(userService.saveUser(user));
    }

    @GetMapping("")
    public ResponseEntity<User> userFindById(Long id){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findByIdUser(id));
    }

    @GetMapping("")
    public ResponseEntity<User> listUser(){
        return ResponseEntity.status(HttpStatus.OK).body((User) userService.listUser());
    }

    @DeleteMapping("")
    public ResponseEntity<String> deletUser(User user){
        userService.deletUser(user);
        return ResponseEntity.status(HttpStatus.OK).body("O usuário " + user.getName() + " foi deletado com sucesso!");
    }






}
