package dev.jfranco.magalu.dto;

import dev.jfranco.magalu.entity.Channel;
import dev.jfranco.magalu.entity.Notification;
import dev.jfranco.magalu.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotification(LocalDateTime dateTime, String destination, String message, Channel.values channel) {

    public Notification toNotification() {
        return new Notification(channel.toChannel(), dateTime, destination, message, Status.values.PENDING.toStatus());
    }
}