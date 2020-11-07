package br.ucsal0.tap.turmas.turmasAPI.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AlunoController {

	@Autowired
	private AlunoRepository repo;

	@GetMapping("/list")
	public List<Aluno> lista() {
		return repo.findAll();
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<Aluno> cadastrar(@RequestBody AlunoForm form) {
		if (form == null) {
			return ResponseEntity.badRequest().build();
		}
		Aluno aluno = new Aluno(form);
		repo.save(aluno);
		return ResponseEntity.ok(aluno);
	}
}
