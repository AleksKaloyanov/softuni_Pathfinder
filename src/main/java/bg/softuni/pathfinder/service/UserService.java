package bg.softuni.pathfinder.service;

import bg.softuni.pathfinder.model.entity.UserEntity;
import bg.softuni.pathfinder.model.service.UserServiceModel;

import java.util.List;

public interface UserService {
    List<UserEntity> getAll();

    void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findUserByUsernameAndPassword(String username, String password);

    void loginUser(Long id, String username);

    void logout();

    UserServiceModel findById(Long id);

    boolean isNameExists(String username);
}
