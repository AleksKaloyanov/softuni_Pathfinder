package bg.softuni.pathfinder.service;

import bg.softuni.pathfinder.model.entity.UserEntity;
import bg.softuni.pathfinder.model.service.UserServiceModel;

import java.util.List;

public interface UserService {
    List<UserEntity> getAll();

    void registerUser(UserServiceModel userServiceModel);
}
