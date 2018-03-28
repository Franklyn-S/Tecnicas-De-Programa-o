//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
//Nome: Matheus Sousa Correia Matricula: 400501
public class Sistema{
	Conta[] contas = new Conta[10];
	int posicao = 0;

	void criarContaXPTOBasic(int numero_conta){
		if(!contaExiste(numero_conta)){
			contas[posicao] = new Basic(numero_conta);
			posicao++;
		}
	}

	void criarContaXPTOPlus(int numero_conta){
		if(!contaExiste(numero_conta) ){
			contas[posicao] = new Plus(numero_conta);
			posicao++;
		}
	}

	void criarContaXPTOExtreme(int numero_conta){
		if(!contaExiste(numero_conta) ){
			contas[posicao] = new Extreme(numero_conta);
			posicao++;
		}
	}

	void creditar(int numero_conta, double valor){
		for(int i = 0;i < posicao; i++){
			if(contas[i].getNumeroConta() == numero_conta){
				contas[i].creditar(valor);
			}
		}			
	}

	void debitar(int numero_conta, double valor){
		for(int i = 0;i < posicao; i++){
			if(contas[i].getNumeroConta() == numero_conta){
				contas[i].debitar(valor);
			}
		}
	}

	double consultarSaldo(int numero_conta){
		for(int i = 0;i < posicao; i++){
			if(contas[i].getNumeroConta() == numero_conta){
				return contas[i].consultarSaldo();
			}
		}
		return -1;
	}
	

	//Ele vai iterar sobre os elementos e comparar os numeros de cada conta que há no vetor contas. 
	//Retornará true se encontrar alguma conta com mesmo número que numero_conta e false caso contrário.
	boolean contaExiste(int numero_conta){
		if(contas.length > 0) return false;
		for(Conta c: contas){
			if(c.getNumeroConta() == numero_conta){
				return true;
			}
		}
		return false;
	}

}