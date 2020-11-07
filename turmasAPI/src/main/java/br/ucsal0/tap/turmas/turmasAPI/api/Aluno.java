package br.ucsal0.tap.turmas.turmasAPI.api;

import java.text.DecimalFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String matricula;
	private String nome;
	private Double av1;
	private Double av2;
	private Double av3;
	private String media;

	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "turma_id", nullable = false) private Turma turma;
	 */

	public Aluno() {
	}

	public Aluno(String matricula, String nome, Double av1, Double av2, Double av3) {
		this.matricula = matricula;
		this.nome = nome;
		this.av1 = av1;
		this.av2 = av2;
		this.av3 = av3;
		this.media = this.getMedia();

	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public Double getAv1() {
		return av1;
	}

	public Double getAv2() {
		return av2;
	}

	public Double getAv3() {
		return av3;
	}

	public String getMedia() {
		Double d = ((av1 + av2 + av3) / 3);
		DecimalFormat df = new DecimalFormat("###.##");
		String s = df.format(d);
		System.out.println(s);
		return s;
	}

}
