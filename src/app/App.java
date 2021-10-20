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
//		
		boolean s = true;
		
		while(s != false) {
			System.out.println("Bem-vindo(a)! Digite o nome do cliente que deseja pesquisar: ");
			String nome = sc.nextLine();
			System.out.println(vet.pesquisaBinaria(nome));
			System.out.println("Deseja continuar? (Continue para continuar/Exit para sair)");
			String escolha = sc.nextLine();
			if(escolha != null) {
				if(escolha.compareTo("Continue") == 0) {
					s = true;
					continue;
				} else {
					s = false;
					break;
				}
			}
		}
		
		sc.close();
		
	}


}
