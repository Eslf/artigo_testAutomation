package models;

public class Cadastro {
	
		// Atributos relativos a informacoes de usuario
	
		private String nome;
		private String sobrenome;
		private String email;
		private String senha;
		private String telefone;
		
		// Atributos relativos a informacoes do endereco
		private String rua;
		private String cidade;
		private String cep;
		private String estado;
		private String aliasEndereco;
		
		// Construtores
		
		public Cadastro() {}

		// Getters e Setters
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getRua() {
			return rua;
		}

		public void setRua(String rua) {
			this.rua = rua;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getAliasEndereco() {
			return aliasEndereco;
		}

		public void setAliasEndereco(String aliasEndereco) {
			this.aliasEndereco = aliasEndereco;
		}
		
		
	
}
