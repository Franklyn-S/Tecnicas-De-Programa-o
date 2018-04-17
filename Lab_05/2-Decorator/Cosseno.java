import java.lang.Math;
class Cosseno extends OperadorUnario{
	Cosseno(Expressao e){
		super(e);
	}

	double calcular(){
		return Math.cos(this.e.calcular());
	}
}