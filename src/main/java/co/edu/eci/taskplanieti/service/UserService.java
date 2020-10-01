/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.taskplanieti.service;

import co.edu.eci.taskplanieti.entity.User;
import java.util.List;

/**
 *
 * @author Jairo Gomez
 */
public interface UserService {
    List<User> getAll();
    
    User getById(String userId);
    
    User create(User user);
    
    User update(User user);
    
    void remove(String userId);
}