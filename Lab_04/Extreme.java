//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
public class Extreme extends conta{

	Extreme(int numero_conta){
		this(numero_conta, 0.0)
	}

	Extreme(int numero_conta, float valor){
		super(numero_conta, valor);
	}

	void creditar(float valor){
		this.saldo += valor + (0.002);
	}

	void debitar(float valor){
		this.saldo -=valor - (0.002);
	}

	float consultarSaldo(){
		return this.saldo;
	}
}