package co.pragra.learning.springjpamvc.repo;

import co.pragra.learning.springjpamvc.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
}
