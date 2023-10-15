package bg.softuni.pathfinder.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class CommentEntity extends BaseEntity {
    private Boolean approved;
    private LocalDateTime created;
    private String textContent;
    private RouteEntity route;
    private UserEntity author;

    public CommentEntity() {
    }

    @Column(nullable = false)
    public Boolean getApproved() {
        return approved;
    }

    public CommentEntity setApproved(Boolean approved) {
        this.approved = approved;
        return this;
    }

    @Column(name = "created", nullable = false)
    public LocalDateTime getCreated() {
        return created;
    }

    public CommentEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    @Column(columnDefinition = "TEXT")
    public String getTextContent() {
        return textContent;
    }

    public CommentEntity setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }

    @ManyToOne
    public RouteEntity getRoute() {
        return route;
    }

    public CommentEntity setRoute(RouteEntity route) {
        this.route = route;
        return this;
    }

    @ManyToOne
    public UserEntity getAuthor() {
        return author;
    }

    public CommentEntity setAuthor(UserEntity author) {
        this.author = author;
        return this;
    }
}
