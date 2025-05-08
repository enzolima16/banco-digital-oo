public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		Banco bradesco = new Banco ("Bradesco");
		bradesco.adicionarConta(cc);
		bradesco.adicionarConta(poupanca);
		bradesco.listarClientes();
		//cc.depositar(100);
		//cc.transferir(100, poupanca);

		//cc.imprimirExtrato();
		//poupanca.imprimirExtrato();
	}
}
