public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		final String tipoconta = "--- Extrato Conta Corrente ---";
		//System.out.println("--- Extrato Conta Corrente ---");
		super.imprimirInfosComuns(tipoconta);
	}
	
}