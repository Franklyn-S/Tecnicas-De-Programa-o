abstract class OperadorUnario extends Operador{
	Expressao e;

	OperadorUnario(Expressao e){
		this.e = e;
	}

	double calcular(){
		super.calcular();
	}
}