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
		
		System.out.println("Escreva o operador:\n Soma \n subtra�ao \n Multiplica��o \n Divis�o");
		System.out.println("\n");
		Scanner tecla3 = new Scanner(System.in);
		String result3=tecla3.nextLine();
		
		
		if(result3.equalsIgnoreCase("soma") || result3.equalsIgnoreCase("subtra��o") || result3.equalsIgnoreCase("multiplica��o") || result3.equalsIgnoreCase("divis�o")) {

		switch(result3) {
		
		case "soma":
			double resultadosoma=teclaresult1 + teclaresult2;
			System.out.println(resultadosoma);
			break;
			
		case "subtra��o":
			double resultadosub=teclaresult1 - teclaresult2;
			System.out.println(resultadosub);
			break;
			
		case "multiplica��o":
			double resultadomul=teclaresult1 * teclaresult2;
			System.out.println(resultadomul);
			break;
			
		case "divis�o":
			double resultadodiv=teclaresult1 % teclaresult2;
			System.out.println(resultadodiv);
			break;
			default:
				System.out.println("N�o introduziu nenhum operador");
		}
	}
	}
}
