package design.boilerplate.springboot.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "URL")
public class Url {
    @Id
    private String generatedHash;

    private String originalUrl;

    private Timestamp timestamp;
}
