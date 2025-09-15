package dev.jfranco.magalu.dto;

import dev.jfranco.magalu.entity.Channel;

import java.time.LocalDateTime;

public record scheduleNotification(LocalDateTime dateTime, String destination, String message, Channel.values channel){}