/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.taskplanieti.controllers;

import co.edu.eci.taskplanieti.entity.User;
import co.edu.eci.taskplanieti.service.UserService;
import co.edu.eci.taskplanieti.service.serviceImp.UserServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jairo Gomez
 */
@RestController
public class UserController {

    @Autowired
    UserService userService = new UserServiceImpl();

    @GetMapping("/users")
    public  List<User> getUsers() {
        List<User> users = userService.getAll();
        System.out.println(users.toString());
        return users;
    }

    @GetMapping("/userId")
    public User getUserById(@RequestParam(value = "id") String id) {
        User user = userService.getById(id);
        return user;
    }

    @PostMapping("/addUser")
    public User addUser(@RequestParam(value = "id") String id, @RequestParam(value = "correo") String correo, @RequestParam(value = "nombre") String nombre) {
        User user = new User(id, correo, nombre);
        userService.create(user);
        System.out.println(user.toString());
        return user;
    }
    
   @PutMapping("/update")
    public User updateUser(@RequestParam(value = "id") String id, @RequestParam(value = "correo") String correo, @RequestParam(value = "nombre") String nombre) {
        User user = new User(id, correo, nombre);
        userService.create(user);
        return user;
    }

    @DeleteMapping("/DeleteUser")
    public void updateUser(@RequestParam(value = "id") String id) {
        userService.remove(id);
    }
    
    
}
