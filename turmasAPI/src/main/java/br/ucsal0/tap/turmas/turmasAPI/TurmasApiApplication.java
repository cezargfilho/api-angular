package br.ucsal0.tap.turmas.turmasAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.ucsal0.tap.turmas.turmasAPI.api.Aluno;
import br.ucsal0.tap.turmas.turmasAPI.api.AlunoRepository;

@SpringBootApplication
public class TurmasApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurmasApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(AlunoRepository repo) {

		return (args) -> {
			repo.save(new Aluno("101010", "Valentina", 4d, 3d, 4d));
			repo.save(new Aluno("202020", "Carlos", 2d, 4d, 6d));
			repo.save(new Aluno("303030", "José", 8d, 8d, 8d));
			repo.save(new Aluno("404040", "Ana", 5d, 10d, 7d));
			repo.save(new Aluno("505050", "Maria", 6d, 6d, 7d));
			repo.save(new Aluno("606060", "Fernando", 10d, 10d, 9d));
			repo.save(new Aluno("707070", "Mario", 9d, 8d, 8d));
			repo.save(new Aluno("808080", "Fabiana", 2d, 3d, 5d));
			repo.save(new Aluno("808080", "Patrícia", 7d, 5d, 8d));
			repo.save(new Aluno("808080", "Cris", 4d, 5d, 5d));
		};
	}
}
