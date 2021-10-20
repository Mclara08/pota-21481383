package classe;

import util.Util;

public class VetorPesquisa {
	
	public Util util = new Util();
	public Cliente[] v = Util.leArquivo();
	private int cont = 0;

	public VetorPesquisa() {}
	
	private int pesquisaBinaria(String chave) {
		int inicio = 0, meio, fim = v.length-1;
		
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            
            int var = chave.compareTo(v[meio].getNome());
            
            if (var == 0) {
            	cont++;
                return meio;
            } if (var > 0) {
                inicio = meio + 1;
                cont++;
        	} else {
                fim = meio - 1;
                cont++;
            }
        }
		
		return -1;
		
	}
	
	public String buscaCliente(String nome) {
		
		int retorno = pesquisaBinaria(nome.trim());
		
		if(retorno != -1) {
			for (int i = 0; i < v.length; i++) {
				if(i == retorno) {
					System.out.println("Foram realizadas " + cont + " comparações!");
					return v[i].toString();
				}
			}
		}

		System.out.println("Foram realizadas " + cont + " comparações!");
		return "Cliente não encontrado na base!";
		
	}
	
}
