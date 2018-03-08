import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

class Conjunto{

	//atributos
	private ArrayList elementos;

	//Contrutores

	public Conjunto(int tamanho){
		ArrayList A = new ArrayList(tamanho);
		this.elementos = A;
	}

	//metodos
	public void inserir(int valor){
		if(pertence(valor)){
			return;
		}
		(this.elementos).add(valor);
	}

	public boolean pertence(int valor){


/*
		for (Iterator iterator = elementos.iterator;iterator.hasNext();) {
			if(iterator == valor){
				return true;
			}
		}
*/

		Iterator<Conjunto> i = elementos.iterator();
		while(i.hasNext()){
			Conjunto teste = i.next();
			if ( == valor) {
				return true;
			}
		}



		return false;
	}

	public boolean subconjunto(Conjunto C){

	}

}