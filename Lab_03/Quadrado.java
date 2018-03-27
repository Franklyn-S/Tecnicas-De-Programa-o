import java.lang.Math;
class Quadrado extends Figura{
	int lado; //tamanho dos lados do quadrado;

	Quadrado(int lado){
		this(0,0,lado);
	}
	
	Quadrado(int x, int y, int lado){
		this.x = x;
		this.y = y;
		this.lado = lado;
	}

    double calcularArea(Figura f){
    	return Math.pow(lado,2);
    }//Fim do método calcular area;

}//Fim da classe Quadrado