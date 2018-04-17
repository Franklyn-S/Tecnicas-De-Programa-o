class Main{
	public static void main(String args[]){
		Expression op1, op2, op3;

		op1 = new Operando(45.0);
		op2 = new Seno(op1);

		System.out.println(op2.calcular());
	}
}