package classe;

public class Cliente {

	private String nome;
	private String sexo;
	private String endereco;
	private String cidade;
	private String email;
	private String telefone;
	private String idade;
	
	public Cliente() {};
	
	public Cliente(String nome, String sexo, String endereco, String cidade, String email, String telefone,
			String idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.endereco = endereco;
		this.cidade = cidade;
		this.email = email;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", sexo=" + sexo + ", endereco=" + endereco + ", cidade=" + cidade + ", email="
				+ email + ", telefone=" + telefone + ", idade=" + idade + "]";
	}
	
}
