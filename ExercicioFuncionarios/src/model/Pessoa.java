package model;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {
	private String nome;
	private LocalDate dataNascimento;
	private int idade;
	private String cargoExercido;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, LocalDate dataNascimento, int idade, String cargoExercido) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.cargoExercido = cargoExercido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCargoExercido() {
		return cargoExercido;
	}

	public void setCargoExercido(String cargoExercido) {
		this.cargoExercido = cargoExercido;
	}

	@Override
	public String toString() {
		return "[Nome=" + getNome() + ", Data Nascimento=" + getDataNascimento() + ", Idade="
				+ getIdade() + ", Cargo Exercido=" + getCargoExercido() + "]";
	}
	
	
}
