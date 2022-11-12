package model;

import java.time.LocalDate;
import java.util.ArrayList;

import dao.FuncionariosDAO;

public class Funcionario extends Pessoa implements FuncionariosDAO {
	private int numeroCracha;
	private ArrayList<Pessoa> pessoaFuncionario = new ArrayList();
	private double salarioMensal;
	private int feriasMensais;

	//Um funcionário precisa fazer referência à apenas um elemento do arrayList de pessoa.
	public Funcionario() {
	}
	
	public Funcionario(String nome,LocalDate dataNascimento,int idade,String cargoExercido,int numeroCracha,
			Pessoa pessoaFuncionario, double salarioMensal, int feriasMensais) {
		super();
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setIdade(feriasMensais);
		this.setCargoExercido(cargoExercido);
		this.numeroCracha = numeroCracha;
		this.pessoaFuncionario.add(pessoaFuncionario);
		this.salarioMensal = salarioMensal;
		this.feriasMensais = feriasMensais;
	}

	public int getNumeroCracha() {
		return numeroCracha;
	}

	public void setNumeroCracha(int numeroCracha) {
		this.numeroCracha = numeroCracha;
	}

	public ArrayList<Pessoa> getPessoaFuncionario() {
		return pessoaFuncionario;
	}

	public void setPessoa(ArrayList<Pessoa> pessoaFuncionario) {
		this.pessoaFuncionario = pessoaFuncionario;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	public int getFeriasMensais() {
		return feriasMensais;
	}

	public void setFeriasMensais(int feriasMensais) {
		this.feriasMensais = feriasMensais;
	}

	@Override
	public void cadastrarFuncionario(int numeroCracha, Pessoa pessoaFuncionario, double salarioMensal
			, int feriasMensais) {
		setNumeroCracha(numeroCracha);
		ArrayList<Pessoa> pessoas= new ArrayList();
		pessoas.add(pessoaFuncionario);
		setPessoa(pessoas);
		setSalarioMensal(salarioMensal);
		setFeriasMensais(feriasMensais);
	}

	@Override
	public void buscarFuncionario(int numero, ArrayList<Funcionario> funcionarios) {
		//Funcionario funcionario = new Funcionario();
		for(Funcionario auxFuncionario : funcionarios) {
			if(numero==auxFuncionario.getNumeroCracha()) {
				System.out.println("Funcionário encontrado! "+ " "+ auxFuncionario.toString()) ;
			}else {
				System.out.println("Funcionário não encontrado!");
			}
			
		}
		
	}

	@Override
	public void informacoesFuncionario(int numeroCracha, ArrayList<Funcionario> funcionarios) {
		// TODO Auto-generated method stub
		
		for(Funcionario auxFuncionario : funcionarios) {
			if(numeroCracha==auxFuncionario.getNumeroCracha()) {
				System.out.println("Funcionário encontrado! "+ " "+ auxFuncionario.getPessoaFuncionario()) ;
			}else {
				System.out.println("Funcionário não encontrado!");
			}
			
		}
	}

	@Override
	public String toString() {
		return "Funcionario [numeroCracha=" + numeroCracha + ", pessoa=" + pessoaFuncionario + ", salarioMensal=" + salarioMensal
				+ ", feriasMensais=" + feriasMensais + "]";
	}
	
	
}
