package co.pragra.learning.springjpamvc.domain.controllers;

import co.pragra.learning.springjpamvc.domain.Student;
import co.pragra.learning.springjpamvc.repo.StudentRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private StudentRepo repo;

    public StudentController(StudentRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/student")
    public List<Student> getALL(){
        return repo.findAll();
    }
}
