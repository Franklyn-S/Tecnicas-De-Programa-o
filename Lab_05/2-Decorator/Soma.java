class Soma extends OperadorUnario{

	Soma(Expressao esquerda, Expressao direita){
		super(esquerda, direita);
	}

	double calcular(){
		return this.esquerda.calcular() + this.direita.calcular;
	}
}