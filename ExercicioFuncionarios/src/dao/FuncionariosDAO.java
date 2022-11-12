package dao;

import java.util.ArrayList;

import model.Funcionario;
import model.Pessoa;

public interface FuncionariosDAO {
	public void cadastrarFuncionario(int numeroCracha,Pessoa pessoa, double salarioMensal
			,int feriasMensais);
	public void buscarFuncionario(int numero, ArrayList<Funcionario> funcionarios);
	public void informacoesFuncionario(int numeroCracha, ArrayList<Funcionario> funcionarios);
}
