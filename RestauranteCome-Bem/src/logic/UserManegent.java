package logic;

import java.util.ArrayList;
import java.util.Date;

import entitys.Gerente;
import exceptions.CPFException;

public class UserManegent {

	static ArrayList<Gerente> gerentes =  new ArrayList<>();
	
	public boolean addManegent(long id,String nomeCompleto, Date dataNascimento, String cpf,
			String endereco, String telefone, String cargo, double salario,
			Date admissao, String login, String senha){
		
		Gerente ger = new Gerente(id,nomeCompleto,dataNascimento,cpf,endereco,telefone,cargo,salario,admissao,login,senha);
		
		gerentes.add(ger);
		
		return true;
	}
	
	public static boolean addManegent(long id,String nomeCompleto, String cpf,String login, String senha) throws CPFException{
		
		Gerente ger = new Gerente(id,nomeCompleto,cpf,login,senha);
		
		for(Gerente gerente: gerentes){
			
			if(gerente.getCpf().equalsIgnoreCase(cpf)){
				throw new CPFException();
			}
			
		}
		
		gerentes.add(ger);
		return true;
	}
	
}
