//Nome: Franklyn Seabra Rogério Bezerra, Matricula: 397847
public class Sistema{
	int[] contas = new int[10];
	int posicao = 0;

	void criarContaXPTOBasic(int numero_conta){
		if(!contaExiste() || contas[0] == null){
			Conta b = new Basic(numero_conta);
			contas[posicao] = numero_conta;
			posicao++;
		}
	}

	void criarContaXPTOPlus(int numero_conta){
		if(!contaExiste() || contas[0] == null){
			Conta p = new Plus(numero_conta);
			contas[posicao] = numero_conta;
			posicao++;
		}
	}

	void criarContaXPTOExtreme(int numero_conta){
		if(!contaExiste() || contas[0] == null){
			Conta e = new Extreme(numero_conta);
			contas[posicao] = numero_conta;
			posicao++;
		}
	}


	boolean contaExiste(int numero_conta){
		for (int i = 0; i<contas.length(); i++) {
			if(contas[i] == numero_conta){
				return true;
			}
		}
		return false;
	}


}