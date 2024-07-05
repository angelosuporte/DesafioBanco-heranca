package desafioBanco;

public interface Conta {
	
	public default void saque(Double valorSaque) {
	}
	
	public default void deposito(Double valorDeposito) {
	}
	
	public default void transferencia(Double valorTranferencia, Conta contaDestino) {
	}
	
	public default void imprimirExtrato(String extrato) {
	}

}
