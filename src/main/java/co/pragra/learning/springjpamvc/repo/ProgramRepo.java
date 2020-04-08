package co.pragra.learning.springjpamvc.repo;

import co.pragra.learning.springjpamvc.domain.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepo extends JpaRepository<Program,Long> {

}


// MVC
// Model & View & Controller
// UI -- is view
// Model - is data
// Controller bind data with UI
// Servlet Application