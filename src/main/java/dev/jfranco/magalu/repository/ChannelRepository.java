package dev.jfranco.magalu.repository;

import dev.jfranco.magalu.entity.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
