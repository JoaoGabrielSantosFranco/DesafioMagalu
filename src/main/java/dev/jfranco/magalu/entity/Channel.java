package dev.jfranco.magalu.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_channel")
@Data
@NoArgsConstructor
public class Channel {

    public Channel(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    @Id
    private Long id;

    private String description;

    public enum values{
        EMAIL(1L,"email"),
        SMS(2L,"sms"),
        PUSH(3L,"push"),
        WHATSAPP(4L,"whatsapp");

        private long id;
        private String description;

        values(Long id, String description){
            this.id = id;
            this.description = description;
        }

        public Channel toChannel(){
            return new Channel(id,description);
        }
    }

}
