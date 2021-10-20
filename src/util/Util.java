package util;

import java.io.FileReader;
import java.util.Scanner;

import classe.Cliente;

public class Util {

	public static Cliente[] leArquivo() {

        try {
        	Scanner sc = new Scanner(new FileReader("../media/arquivoDados.csv"));
        	String row = null;
        	String[] data = null;
    		Cliente[] vetor = new Cliente[5824];
        	int cont = 0;
        	
        	while (sc.hasNext()) {
        		Cliente cli = new Cliente();
        		row = sc.nextLine();
        	    data = row.split(",");
        	    cli.setNome(data[0]);
        	    cli.setSexo(data[1]);
        	    cli.setEndereco(data[2]);
        	    cli.setCidade(data[3]);
        	    cli.setEmail(data[4]);
        	    cli.setTelefone(data[5]);
        	    cli.setIdade(data[6]);
        	    
        	    vetor[cont] = cli;
        	    cont++;
        	}
        	
        	sc.close();
        	return vetor;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
	
}