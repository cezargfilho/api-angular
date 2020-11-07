package br.ucsal0.tap.turmas.turmasAPI.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AlunoController {

	@Autowired
	private AlunoRepository repo;

	@GetMapping("/list")
	public List<Aluno> lista() {
		repo.save(new  Aluno("999999", "CJ SPLASH", 2d, 2d, 7d));
		return repo.findAll();
	}
}
