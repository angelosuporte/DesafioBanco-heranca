package desafioBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private Integer numeroBanco;
	private String nomeBanco;

	List<ContaBancaria> contaBancaria = new ArrayList<>();
	List<Cliente> cliente = new ArrayList<>();

	public Banco(Integer numeroBanco, String nomeBanco) {
		super();
		this.numeroBanco = numeroBanco;
		this.nomeBanco = nomeBanco;
	}

	public Integer getNumeroBanco() {
		return numeroBanco;
	}

	public void setNumeroBanco(Integer numeroBanco) {
		this.numeroBanco = numeroBanco;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public List<ContaBancaria> getContaBancaria() {
		return contaBancaria;
	}

	public void setContaBancaria(List<ContaBancaria> contaBancaria) {
		this.contaBancaria = contaBancaria;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Banco [=" + numeroBanco + ", nomeBanco=" + nomeBanco + "\n" + contaBancaria
				+ ", cliente=" + cliente + "]";
	}

	

}
