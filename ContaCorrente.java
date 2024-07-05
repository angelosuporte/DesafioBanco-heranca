package desafioBanco;

public class ContaCorrente extends ContaBancaria {

	private Double limiteEspecial;

	public ContaCorrente(Cliente cliente, Double saldo, Double limiteEspecial) {
		super(cliente, saldo);
		this.limiteEspecial = limiteEspecial;
	}

	public Double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(Double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	@Override
	public void saque(Double valorSaque) {
		if(valorSaque > saldo) {
			valorSaque -= saldo;
			
		}
	}

	@Override
	public String toString() {
		return "ContaCorrente [" + cliente + "saldo =" + saldo + " limiteEspecial =" + limiteEspecial + "]";
	}

}
