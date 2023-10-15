package bg.softuni.pathfinder.service.impl;

import bg.softuni.pathfinder.model.entity.UserEntity;
import bg.softuni.pathfinder.repository.UserRepository;
import bg.softuni.pathfinder.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }
}
