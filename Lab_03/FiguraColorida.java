abstract class FiguraColorida extends Figura{
	String cor;

	FiguraColorida(Strin cor){
		this(0,0,cor);
	}

	FiguraColorida(int x, int y, String cor){
		super(x,y);
		this.cor = cor;
	}

	
}