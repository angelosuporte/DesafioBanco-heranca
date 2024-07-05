package desafioBanco;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		// Cadastrando Banco

		Banco banco = new Banco(811, "Banco Da Praca");

		Cliente cli1 = new Cliente(2100, "Joao");
		Cliente cli2 = new Cliente(2113, "Manoel");

		// Testando add dos clientes
		// System.out.println(cli1);
		// System.out.println(cli2);

		banco.getCliente().addAll(Arrays.asList(cli1, cli2));

		ContaBancaria poupanca = new ContaPoupanca(cli1, 1000.0, 0.2);
		ContaBancaria corrente = new ContaCorrente(cli2, 2000.0, 2000.0);
		

		banco.getContaBancaria().addAll(Arrays.asList(poupanca, corrente));

		// Testando add das contas no Banco
		// System.out.println(banco);

		// Testando operacoes ContaPoupanca
		poupanca.saque(300.0);
		((ContaPoupanca) poupanca).atualizaSaldo(); // poupanca rendendo
		poupanca.deposito(700.0);
		System.out.println("Saldo poupanca " + poupanca.getSaldo());

		corrente.tranferencia(200.0, poupanca);
		
		System.out.println("Saldo corrente " + corrente.getSaldo());
		System.out.println("Saldo poupanca " + poupanca.getSaldo());
		
		System.out.println(poupanca);
		System.out.println(corrente);

	}
}
