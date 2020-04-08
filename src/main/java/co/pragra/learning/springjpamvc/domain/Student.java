package co.pragra.learning.springjpamvc.domain;

import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    @OneToMany(targetEntity = Program.class, fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id" )
    private List<Program> programs;

    public Student(String firstName, String lastName, List<Program> programs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.programs = programs;
    }


}
