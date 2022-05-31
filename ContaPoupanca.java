public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		final String tipoconta = "--- Extrato Conta Poupanca ---";
		//System.out.println("--- Extrato Conta Poupança ---");
		super.imprimirInfosComuns(tipoconta);
	}
}