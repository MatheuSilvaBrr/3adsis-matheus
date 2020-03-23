package aula20200323.cofre;

public class CofreSeguro {

	private String senha;
	private boolean aberto;

	public CofreSeguro(String senha) {
		this.senha = senha;
		this.aberto = false;
	}

	public void abrir(String senha) {
		if (this.senha.equals(senha)) {
			this.aberto = true;
			return;
		}

		System.out.println("Senha incorreta");
	}

	public void fechar() {
		this.aberto = false;

	}

	public boolean isAberto() {
		return aberto;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
