/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eci.taskplanieti.service.serviceImp;

import co.edu.eci.taskplanieti.entity.User;
import co.edu.eci.taskplanieti.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Jairo Gomez
 */
@Component
public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<User>();

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getById(String userId) {
        User usr = null;
        for (User u : users) {
            if (u.getId().equals(userId)) {
                usr = u;
            }
        }
        return usr;
    }

    @Override
    public User create(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User update(User user) {
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            if (u.getId().equals(user.getId())) {
                users.set(i, user);
            }
        }
        return user;

    }

    @Override
    public void remove(String userId
    ) {
        User usr = null;
        for (User u : users) {
            if (u.getId().equals(userId)) {
                usr = u;
            }
        }
        if (usr != null) {
            users.remove(usr);
        }
    }
}
