package service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserService userService;


    @Override
    public User saveUser(User user) {
        return userService.saveUser(user);
    }

    @Override
    public List<User> listUser() {
        return userService.listUser();
    }

    @Override
    public User findByIdUser(Long id) {
        return userService.findByIdUser(id);
    }

    @Override
    public void deletUser(User user) {
        userService.deletUser(user);
    }
}
