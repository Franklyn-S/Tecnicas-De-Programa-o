import java.lang.Math;
class Seno extends OperadorUnario{
	Seno(Expressao e){
		super(e);
	}

	double calcular(){
		return Math.sin(this.e.calcular());
	}
}