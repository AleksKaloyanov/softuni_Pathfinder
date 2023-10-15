package bg.softuni.pathfinder.model.entity;

import bg.softuni.pathfinder.model.entity.enums.LevelEnum;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {
    private String fullName;
    private String username;
    private String password;
    private String email;
    private Integer age;
    private LevelEnum level;
    private Set<RoleEntity> roles;

    public UserEntity() {
    }

    @Column(name = "full_name", nullable = false)
    public String getFullName() {
        return fullName;
    }

    public UserEntity setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    @Column(nullable = false, unique = true)
    public String getUsername() {
        return username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    @Column(nullable = false)
    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    @Column
    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    @Column
    public Integer getAge() {
        return age;
    }

    public UserEntity setAge(Integer age) {
        this.age = age;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public LevelEnum getLevel() {
        return level;
    }

    public UserEntity setLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    @ManyToMany
    @JoinTable(name = "Users_Roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "roles_id"))
    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public UserEntity setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
        return this;
    }
}
