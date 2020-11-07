//package br.ucsal0.tap.turmas.turmasAPI.api;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//@Entity
//public class Turma {
//
//	@Id
//	@Column(name = "turma_id")
//	private Long id;
//	private String titulo;
//
//	@OneToMany(mappedBy = "turma")
//	private List<Aluno> alunos;
//
//	public Turma() {
//		this.id = 20L;
//		// Constutor vazio para JPA
//	}
//
//	public String getTitulo() {
//		return titulo;
//	}
//
//	public List<Aluno> getAlunos() {
//		return alunos;
//	}
//}
