package app;

import java.util.Scanner;

import classe.VetorPesquisa;

public class App {

	public static void main(String[] args) {

		VetorPesquisa vet = new VetorPesquisa();
		Scanner sc = new Scanner(System.in);

//		for (int i = 0; i < vet.v.length; i++) {
//			System.out.println(vet.v[i]);
//		}
		
		boolean s = true;
		
		do {
			System.out.println("Bem-vindo(a)! Digite o nome do cliente que deseja pesquisar: ");
			String nome = sc.nextLine();
			System.out.println(vet.buscaCliente(nome));
			System.out.println("Deseja continuar? (Continue para continuar/Exit para sair)");
			String escolha = sc.nextLine();
			if(escolha == "Exit") {
				s = false;
			}else {
				s = true;
			}
		} while(s == true);
		
		sc.close();
		
	}


}
