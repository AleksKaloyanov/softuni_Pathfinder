package bg.softuni.pathfinder.model.entity;

import bg.softuni.pathfinder.model.entity.enums.CategoryNameEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class CategoryEntity extends BaseEntity {
    private CategoryNameEnum name;
    private String description;

    public CategoryEntity() {
    }

    @Enumerated(EnumType.STRING)
    public CategoryNameEnum getName() {
        return name;
    }

    public CategoryEntity setName(CategoryNameEnum name) {
        this.name = name;
        return this;
    }

    @Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public CategoryEntity setDescription(String description) {
        this.description = description;
        return this;
    }
}
