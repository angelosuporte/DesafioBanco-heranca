package desafioBanco;

public class ContaPoupanca extends ContaBancaria{
	
	private Double taxaDeJuros;

	public ContaPoupanca(Cliente cliente, Double saldo, Double taxaDeJuros) {
		super(cliente, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}

	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}

	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}

	public void atualizaSaldo() {
		saldo += taxaDeJuros;  
	}

	@Override
	public String toString() {
		return "ContaPoupanca [" + cliente + " saldo = " + saldo +  "  Rendimento = " + taxaDeJuros + "]";
	}
}
