class Teste{
    public static void main(String[] args) {
    	Figura Q = new Quadrado(2,2,4);
        Figura C = new Circulo(5,5,5);
        
        System.out.println(Q.desenhar());
        System.out.println(C.desenhar());

        
    }//Fim do método main
}//Fim da classe teste