package dev.jfranco.magalu.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_notification")
@Data
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long notificationID;

    private LocalDateTime dateTime;

    private String destination;

    private String message;

    @ManyToOne
    @JoinColumn(name = "channel_id")
    private Channel channel;


    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

}
