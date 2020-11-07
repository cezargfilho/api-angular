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
	private Long id;
	private String matricula;
	private String nome;
	private Double av1;
	private Double av2;
	private Double av3;
	private String media;

	public Aluno() {
	}

	public Aluno(AlunoForm form) {
		this.matricula = form.getMatricula();
		this.nome = form.getNome();
		this.av1 = Double.parseDouble(form.getAv1());
		this.av2 = Double.parseDouble(form.getAv2());
		this.av3 = Double.parseDouble(form.getAv3());
		this.media = getMedia();
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
		return df.format(d);
	}

}
