package Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Funcionario;
import model.Pessoa;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pessoa> pessoas = new ArrayList();
		ArrayList<Funcionario> funcionarios = new ArrayList();
		Funcionario funcionario= new Funcionario();
		DateTimeFormatter formato01= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String data="25/05/1995";
		LocalDate data01 = LocalDate.parse(data,formato01);
		int resposta=0;
		resposta =(Integer.parseInt(JOptionPane.showInputDialog("0-(Sair) 1-(Cadastrar Funcion�rio)"
				+ " 2-(Buscar funcion�rio)\n 3-(Exibir informa��es funcion�rio)")));
		do {
			if(resposta==1) {
			String nome=(JOptionPane.showInputDialog("Digite o nome do funcion�rio"));
			data=(JOptionPane.showInputDialog("Digite a data de nascimento no formato(dia/m�s/ano"));
			data01 = LocalDate.parse(data,formato01);
			int idade=(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
			String cargo=(JOptionPane.showInputDialog("Digite o cargo a qual quer exercer"));
			Pessoa pessoa =new Pessoa(nome,data01,idade,cargo);
			//int cont= pessoas.size();
			
			
			int numeroCracha=(Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero "
					+ "do cracha do funcion�rio:")));
			double salarioMensal=(Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio R$:")));
			int feriasMensais=(Integer.parseInt(JOptionPane.showInputDialog("Informe o valor das "
					+ "f�rias mensais")));
			funcionarios.add(new Funcionario(nome,data01,idade,cargo,
					numeroCracha, pessoa,
					salarioMensal,feriasMensais));
			}else if(resposta ==2) {
				int opcaoBusca= (Integer.parseInt(JOptionPane.showInputDialog("Numero do crach� a "
						+ "buscar")));
				//Funcionario funcionario= new Funcionario();
				funcionario.buscarFuncionario(opcaoBusca,funcionarios);
			}else if(resposta ==3) {
				int opcaoBusca= (Integer.parseInt(JOptionPane.showInputDialog("Numero do crach� a "
						+ "buscar")));
				//Funcionario funcionario= funcionarios.get(opcaoBusca);
				funcionario.informacoesFuncionario(opcaoBusca,funcionarios);
			}
			
			
			resposta =(Integer.parseInt(JOptionPane.showInputDialog("0-(Sair) 1-(Cadastrar Funcion�rio)"
					+ " 2-(Buscar funcion�rio) \n3-(Exibir informa��es funcion�rio)")));
			
		}while(resposta!=0 || resposta>3 || resposta>0);
		
		/*for(Funcionario auxFuncionario: funcionarios) {
			System.out.println(auxFuncionario.toString());
		}*/
		
		
		
	}
	

}
