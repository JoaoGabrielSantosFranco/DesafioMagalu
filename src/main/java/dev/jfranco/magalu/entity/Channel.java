package dev.jfranco.magalu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_channel")
@Data
public class Channel {

    @Id
    private Long channeId;

    private String description;

}
