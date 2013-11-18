package gui;

import javax.swing.JOptionPane;

import exceptions.CPFException;
import exceptions.IDException;
import logic.UserEmployee;
import logic.UserManegent;

public class AddUserView {
	
	public static void main (String []args){
		
		while(true){
			
			
			int opcao = new Integer(JOptionPane.showInputDialog("Escolhe a opção: 1-Adicionar Gerente  2 Adicionar Funcionário"));
			
			switch(opcao){
				case 1:
					String nome = JOptionPane.showInputDialog("Digite o nome completo:");
					String cpf = JOptionPane.showInputDialog("Digite o CPF:");
					String login = JOptionPane.showInputDialog("Digite o Login:");
					String senha = JOptionPane.showInputDialog("Digite a Senha:");
					long id = new Long(JOptionPane.showInputDialog("Digite o ID:"));
					
					try {
						UserManegent.addManegent(id, nome, cpf, login, senha);
					} catch (CPFException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					
					int i = JOptionPane.showConfirmDialog(null ,"Deseja terminar o cadastro?",  
							"Saída",JOptionPane.YES_NO_OPTION);
					
					if(i == JOptionPane.YES_OPTION){
						System.exit(0);			
					}
				break;
				
				case 2:
					String nomeFucionario = JOptionPane.showInputDialog("Digite o nome completo:");
					String cpfFucionario = JOptionPane.showInputDialog("Digite o CPF:");
					String loginFucionario = JOptionPane.showInputDialog("Digite o Login:");
					String senhaFucionario = JOptionPane.showInputDialog("Digite a Senha:");
					long idFucionario = new Long(JOptionPane.showInputDialog("Digite o ID:"));
					
					try {
						UserEmployee.addEmployee(idFucionario, nomeFucionario, cpfFucionario, loginFucionario, senhaFucionario);
					} catch (CPFException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}catch (IDException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					
					int iFucionario = JOptionPane.showConfirmDialog(null ,"Deseja terminar o cadastro?",  
							"Saída",JOptionPane.YES_NO_OPTION);
					
					if(iFucionario == JOptionPane.YES_OPTION){
						System.exit(0);			
					}
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");

			}
			
		}	
		
	}
	
}
