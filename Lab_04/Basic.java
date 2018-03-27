//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
public class Basic extends conta{

	Basic(int numero_conta){
		this(numero_conta, 0.0);
	}

	Basic(int numero_conta, float valor){
		super(numero_conta, valor);
	}

	void creditar(float valor){
		this.saldo += valor;
	}

	void debitar(float valor){
		this.saldo -=valor;
	}

	float consultarSaldo(){
		return this.saldo;
	}

}
