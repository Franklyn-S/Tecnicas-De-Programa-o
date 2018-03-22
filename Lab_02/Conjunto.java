
class Conjunto{

	//atributos
	Object o[];
	int t; //tamanho

	//Contrutores

	public Conjunto(int tamanho){
		Object o = new Object(tamanho);
		this.t = tamanho ;
	}

	//metodos
	public void inserir(Object valor){
		if(!pertence(valor)){
			for (int i=0 ;i<this.tamanho ;i++) {
			//a partir daqui				
			}
		}
		
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