package bg.softuni.pathfinder.model.service;

import bg.softuni.pathfinder.model.entity.RoleEntity;
import bg.softuni.pathfinder.model.entity.enums.LevelEnum;

import java.util.Set;

public class UserServiceModel {
    private Long id;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private Integer age;
    private LevelEnum level;
    private Set<RoleEntity> roles;
}
