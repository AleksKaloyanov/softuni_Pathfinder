package bg.softuni.pathfinder.model.entity;

import bg.softuni.pathfinder.model.entity.enums.RoleNameEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity {
    private RoleNameEnum name;
    public RoleEntity() {
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    public RoleNameEnum getName() {
        return name;
    }

    public RoleEntity setName(RoleNameEnum name) {
        this.name = name;
        return this;
    }
}
