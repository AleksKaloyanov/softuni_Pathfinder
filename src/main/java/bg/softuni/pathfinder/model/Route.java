package bg.softuni.pathfinder.model;

import jakarta.persistence.*;

@Entity
@Table(name = "route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "gpx_coordinates", columnDefinition = "LONGTEXT")
    private String gpxCoordinates;
    @Enumerated(EnumType.STRING)
    private Level level;
    @Column(name = "name", nullable = false)
    private String name;
    @ManyToOne
    private User author;
    @Column(name = "video_url")
    private String videoUrl;
}
