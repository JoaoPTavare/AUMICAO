package service;

import model.User;

import java.util.List;

public interface UserService {

    public User saveUser(User user);
    public List<User> listUser();
    public User findByIdUser(Long id);
    public void deletUser(User user);
}
