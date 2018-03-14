/*
Nome: Franklyn Seabra Rogério Bezerra
Matricula: 397847   Curso: Ciências da computação, UFC
*/
class Conjunto{
	int tamanho;
	int[] array;

	Conjunto(int t){
		this.tamanho = t;
		array = new int[t];
	}

	public void adicionar(int e){ //elemento
		if (elementoPertence(e)){
			return;
		}
		int k;
		for (int i = 0; i < this.tamanho; i++){
			if (this.array[i] != NULL)
				k++;
		}
		this.array[k] = e;
	}

	public boolean elementoPertence(int e){
		for (int i = 0; i < this.tamanho; i++){
			if (array[i] == e)
				return TRUE;
		}
		return FALSE;
	}

	public boolean conjuntoPertence(Conjunto c){
		int teste = 0;
		for (int i = 0; i < c.tamanho; i++) {
			for (int j = 0; j < this.tamanho; j++) {
				if (c[i] == this.array[j]) {
					teste = 1;
				}
			}
			if (teste == 0) {
					return FALSE;
			}
			teste = 0;
		}
		return TRUE;
	}
	public Conjunto uniao(Conjunto A){
		Conjunto union  = new Conjunto(this.tamanho + A.tamanho);
		for (int i = 0; i < A.tamanho; i++) {
			union.adicionar(A.array[i]);
		}
		for (int j = 0; j < this.tamanho; j++) {
			union.adicionar(this.array[j]);
		}
		return union;
	}

	public Conjunto interseccao(Conjunto A){
		Conjunto union  = new Conjunto(this.tamanho + A.tamanho);
		for (int i = 0; i < A.tamanho ;i++){
			for (int j = 0; j<this.tamanho; j++){
				if(A.array[i] == this.array[j]){
					union.adicionar(this.array[j]);
				}
			}
		}
		return union;
	}
}

