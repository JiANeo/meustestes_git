import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Servicos servicos = new Servicos();
		servicos.metodoServicos(new Operador1());
		Scanner tecla = new Scanner(System.in);
		int teclaresult1 = tecla.nextInt();
		
		
		servicos.metodoServicos(new Operador2());
		Scanner tecla2 = new Scanner(System.in);
		int teclaresult2 = tecla.nextInt();
		
		System.out.println("Escreva o operador:\n Soma \n subtraçao \n Multiplicação \n Divisão");
		System.out.println("\n");
		Scanner tecla3 = new Scanner(System.in);
		String result3=tecla3.nextLine();
		
		
		if(result3.equalsIgnoreCase("soma") || result3.equalsIgnoreCase("subtração") || result3.equalsIgnoreCase("multiplicação") || result3.equalsIgnoreCase("divisão")) {

		switch(result3) {
		
		case "soma":
			double resultadosoma=teclaresult1 + teclaresult2;
			System.out.println(resultadosoma);
			break;
			
		case "subtração":
			double resultadosub=teclaresult1 - teclaresult2;
			System.out.println(resultadosub);
			break;
			
		case "multiplicação":
			double resultadomul=teclaresult1 * teclaresult2;
			System.out.println(resultadomul);
			break;
			
		case "divisão":
			double resultadodiv=teclaresult1 % teclaresult2;
			System.out.println(resultadodiv);
			break;
			default:
				System.out.println("Não introduziu nenhum operador");
		}
	}
	}
}
