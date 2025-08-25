package dev.jfranco.magalu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name = "tb_status")
@Data
public class Status {

    @Id
    private long statusId;

    private String description;

}
