package co.pragra.learning.springjpamvc.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String programName;
    private Long hours;
    private BigDecimal fee;
    private String description;


    public Program(String programName, Long hours, BigDecimal fee, String description) {
        this.programName = programName;
        this.hours = hours;
        this.fee = fee;
        this.description = description;
    }


}
