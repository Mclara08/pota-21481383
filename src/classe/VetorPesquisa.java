package classe;

import util.Util;

public class VetorPesquisa {
	
	public Util util = new Util();
	public Cliente[] v = Util.leArquivo();
	private int cont = 0;

	public VetorPesquisa() {}
	
	public String pesquisaBinaria(String chave) {
		int inicio = 0, meio, fim = v.length-1;
		
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            
            int var = chave.compareTo(v[meio].getNome());
            
            if (var == 0) {
            	cont++;
            	System.out.println("Foram realizadas " + cont + " comparações!");
            	cont = 0;
                return v[meio].toString();
            } if (var > 0) {
                inicio = meio + 1;
                cont++;
        	} else {
                fim = meio - 1;
                cont++;
            }
        }
        
        System.out.println("Foram realizadas " + cont + " comparações!");
        cont = 0;
		return "Cliente não encontrado!";
		
	}
	
}
