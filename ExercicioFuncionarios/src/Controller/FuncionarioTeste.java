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
		resposta =(Integer.parseInt(JOptionPane.showInputDialog("0-(Sair) 1-(Cadastrar Funcionário)"
				+ " 2-(Buscar funcionário)\n 3-(Exibir informações funcionário)")));
		do {
			if(resposta==1) {
			String nome=(JOptionPane.showInputDialog("Digite o nome do funcionário"));
			data=(JOptionPane.showInputDialog("Digite a data de nascimento no formato(dia/mês/ano"));
			data01 = LocalDate.parse(data,formato01);
			int idade=(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
			String cargo=(JOptionPane.showInputDialog("Digite o cargo a qual quer exercer"));
			Pessoa pessoa =new Pessoa(nome,data01,idade,cargo);
			//int cont= pessoas.size();
			
			
			int numeroCracha=(Integer.parseInt(JOptionPane.showInputDialog("Informe o número "
					+ "do cracha do funcionário:")));
			double salarioMensal=(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário R$:")));
			int feriasMensais=(Integer.parseInt(JOptionPane.showInputDialog("Informe o valor das "
					+ "férias mensais")));
			funcionarios.add(new Funcionario(nome,data01,idade,cargo,
					numeroCracha, pessoa,
					salarioMensal,feriasMensais));
			}else if(resposta ==2) {
				int opcaoBusca= (Integer.parseInt(JOptionPane.showInputDialog("Numero do crachá a "
						+ "buscar")));
				//Funcionario funcionario= new Funcionario();
				funcionario.buscarFuncionario(opcaoBusca,funcionarios);
			}else if(resposta ==3) {
				int opcaoBusca= (Integer.parseInt(JOptionPane.showInputDialog("Numero do crachá a "
						+ "buscar")));
				//Funcionario funcionario= funcionarios.get(opcaoBusca);
				funcionario.informacoesFuncionario(opcaoBusca,funcionarios);
			}
			
			
			resposta =(Integer.parseInt(JOptionPane.showInputDialog("0-(Sair) 1-(Cadastrar Funcionário)"
					+ " 2-(Buscar funcionário) \n3-(Exibir informações funcionário)")));
			
		}while(resposta!=0 || resposta>3 || resposta>0);
		
		/*for(Funcionario auxFuncionario: funcionarios) {
			System.out.println(auxFuncionario.toString());
		}*/
		
		
		
	}
	

}
