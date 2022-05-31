public class Main {

	public static void main(String[] args) {
		Cliente mariane = new Cliente();
		mariane.setNome("Mariane");
		
		Conta cc = new ContaCorrente(mariane);
		Conta poupanca = new ContaPoupanca(mariane);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.sacar(100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
	
}