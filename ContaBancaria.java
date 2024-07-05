package desafioBanco;

public class ContaBancaria implements Conta {

	Cliente cliente;
	protected Double saldo;

	public ContaBancaria() {
	}

	public ContaBancaria(Cliente cliente, Double saldo) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double valorSaldo) {
		this.saldo = valorSaldo;
	}

	public void saque(Double valorSaque) {
		saldo -= valorSaque;
	}

	public void deposito(Double valorDeposito) {
		saldo += valorDeposito;
	}

	public void tranferencia(Double valor, Conta contaDestino) {
		if(valor <= saldo) {
		this.saque(valor);
		contaDestino.deposito(valor);
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

	@Override
	public String toString() {
		return "ContaBancaria [cliente=" + cliente + ", saldo=" + saldo + "]";
	}
	
}
