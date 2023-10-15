package bg.softuni.pathfinder.service;

import bg.softuni.pathfinder.model.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAll();
}
