public class RelationalOperatorsExample3 {
	public static void main(String [] args){
		double consumodeaguarecomendada =10;
		double diaseneldesafio = 365;
		double ingestadeagua = 100000.34;
		double consumodeaguarecomendadoparaeldesafio = consumodeaguarecomendada*diaseneldesafio;
		boolean desafiocompletado =ingestadeagua >= consumodeaguarecomendadoparaeldesafio;
		System.out.println(desafiocompletado);
	}
}