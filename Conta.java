import javax.swing.JOptionPane;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public int sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return 1; // codigo 1 = saque efetuado
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
            return 0; // codigo 0 = saque não efetuado
        }
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
        if (this.sacar(valor) == 1){
            contaDestino.depositar(valor);
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
        }
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns(String tipoconta) {
		JOptionPane.showMessageDialog(null, tipoconta
        + "\nTitular: " + this.cliente.getNome()
		+ "\nAgencia: " + this.agencia + "\nNumero: " +  this.numero
		+ "\nSaldo: " +  this.saldo);
	}
}