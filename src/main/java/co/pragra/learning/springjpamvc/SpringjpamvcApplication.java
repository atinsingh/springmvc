package co.pragra.learning.springjpamvc;

import co.pragra.learning.springjpamvc.domain.Program;
import co.pragra.learning.springjpamvc.domain.Student;
import co.pragra.learning.springjpamvc.repo.ProgramRepo;
import co.pragra.learning.springjpamvc.repo.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringjpamvcApplication {
	private StudentRepo repo;
	private ProgramRepo programRepo;

	public SpringjpamvcApplication(StudentRepo repo, ProgramRepo programRepo) {
		this.repo = repo;
		this.programRepo = programRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringjpamvcApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(){
		return args -> {

			List<Program> programs =
					Arrays.asList(
							new Program("Java",102L, BigDecimal.valueOf(2000),"Java Learning"),
							new Program("NodeJs",80L, BigDecimal.valueOf(1000),"Node JS Learning")
					);
			//programRepo.saveAll(programs);

				Student student = new Student("Denesh","007",programs);
				repo.save(student);
		};
	}

}
