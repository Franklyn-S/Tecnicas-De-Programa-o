//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
public abstract class Conta{
	int numero_conta; //id
	float saldo;
	String tipo;

	Conta(int numero_conta){
		this(numero_conta,0.0);
	}

	Conta(int numero_conta, float saldo){
		if(!contaExiste()){
			this.numero_conta = conta;
			this.saldo = saldo;
		}
	}

	void creditar(int conta, float valor);
	void debitar(int conta, float valor);

	float consultarSaldo(int conta){
		return this.saldo;
	}
}