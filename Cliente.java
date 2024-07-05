package desafioBanco;

public class Cliente {
	
	private Integer numero;
	private String nome;
	
	//ContaBancaria contaBancaria;
	
	public Cliente(Integer numero, String nome) {
		super();
		//this.contaBancaria = contaBancaria;
		this.numero = numero;
		this.nome = nome;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Extrato [numero= " + numero + ", nome= " + nome + "]";
	}

}
