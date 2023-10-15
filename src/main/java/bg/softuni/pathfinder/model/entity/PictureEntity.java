package bg.softuni.pathfinder.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pictures")
public class PictureEntity extends BaseEntity {
    private String title;
    private String url;
    private UserEntity author;
    private RouteEntity route;

    public PictureEntity() {
    }

    @Column(nullable = false)
    public String getTitle() {
        return title;
    }

    public PictureEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    @Column(nullable = false, columnDefinition = "TEXT")
    public String getUrl() {
        return url;
    }

    public PictureEntity setUrl(String url) {
        this.url = url;
        return this;
    }

    @ManyToOne
    public UserEntity getAuthor() {
        return author;
    }

    public PictureEntity setAuthor(UserEntity author) {
        this.author = author;
        return this;
    }

    @ManyToOne
    public RouteEntity getRoute() {
        return route;
    }

    public PictureEntity setRoute(RouteEntity route) {
        this.route = route;
        return this;
    }
}
