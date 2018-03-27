//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
public class Plus extends conta{

	Plus(int numero_conta){
		this(numero_conta, 0.0);
	}
	
	Plus(int numero_conta, float saldo){
		super(numero_conta, saldo);
	}

	void creditar(float valor){
		this.saldo += valor +(0.005*valor);
	}

	void debitar(float valor){
		this.saldo -=valor;
	}

	float consultarSaldo(){
		return this.saldo;
	}
}