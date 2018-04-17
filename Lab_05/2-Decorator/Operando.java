//ConcreteComponent
class Operando implements Expressao{
	double valor;

	Operando(double valor){
		this.valor = valor;
	}
	double calcular(){
		return valor;
	}
}