import java.io.*;
import java.util.*;

public class principal {

	public static void main(String[] args) throws IOException {

		Scanner teclas = new Scanner(System.in);
		System.out.println();
		System.out.println("Escreva uma letra e prima a tecla enter");
		String entrada = teclas.nextLine();
		System.out.println("Escreveu : " + entrada);
		
		if (entrada.equalsIgnoreCase("sim")) {
			System.out.println("O contúdo do ficheiro :");

			// ------------

			try {
				//char fimlinha=(char)13;
				//String fich=System.getProperty("user.dir")+"C:\\melancolia.txt";
				
//				PrintWriter escreve=new PrintWriter("C:\\Users/Utilizador/Desktop/melancolia.txt");
//				escreve.write("nova palavra"+fimlinha);
//				escreve.close();
				FileReader reader = new FileReader("C:\\Users/Utilizador/Desktop/melancolia.txt");
				
				String dados = "";
				BufferedReader entrada1 = new BufferedReader(reader);
				// String dados=entrada1.readLine();
//			    Scanner entrada2 = new Scanner(reader);
//				String entrada3=entrada2.next();
				// ArrayList<String> Lista=new ArrayList<String>();
				do {
					dados = entrada1.readLine();
					if (dados != null)
						System.out.println(dados);
				} while (dados != null);

				entrada1.close();
//				
				// Lista.add(dados);
//				
				// System.out.println();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// ------------

		} else

			System.out.println("Nao quis ler o ficheiro , o programa terminou");
		System.exit(0);

	}

}
