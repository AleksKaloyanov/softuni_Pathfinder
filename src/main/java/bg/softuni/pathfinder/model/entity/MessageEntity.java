package bg.softuni.pathfinder.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class MessageEntity extends BaseEntity {
    private LocalDateTime dateTime;
    private String textContent;
    private UserEntity author;
    private UserEntity recipient;

    public MessageEntity() {
    }

    @Column(name = "date_time", nullable = false)
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public MessageEntity setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    @Column(name = "text_content", columnDefinition = "TEXT", nullable = false)
    public String getTextContent() {
        return textContent;
    }

    public MessageEntity setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }

    @ManyToOne
    public UserEntity getAuthor() {
        return author;
    }

    public MessageEntity setAuthor(UserEntity author) {
        this.author = author;
        return this;
    }

    @ManyToOne
    public UserEntity getRecipient() {
        return recipient;
    }

    public MessageEntity setRecipient(UserEntity recipient) {
        this.recipient = recipient;
        return this;
    }
}
