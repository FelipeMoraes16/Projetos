import java.util.Scanner;
import java.util.InputMismatchException;
import java.text.DecimalFormat;

public class ConversorDeTemperaturas {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

			while(true){

				try{

					System.out.println("--- Conversor de graus Celsius para Fahrenheit ---");
					System.out.print("Digite quantos graus em Celsius: ");
					double digito = entrada.nextDouble();
					entrada.nextLine();

					double grausConvertidos = digito * 1.8 + 32;
					System.out.println("Fahreinheit: " + df.format(grausConvertidos));

					String mensagem = "Outra conversão [S/N]: ";
					String teclado = verificarSimNao(entrada, mensagem);

					if (teclado.equals("S")){
						continue;
					}

					else {
						break;
					}
				
				} catch (InputMismatchException e) {
					
					System.out.println("Erro: Não digite letras ou caracteres especiais!\n");
					entrada.nextLine();

					String mensagem = "Quer tentar novamente [S/N]: ";
					String teclado = verificarSimNao(entrada, mensagem);

					if (teclado.equals("S")){
						continue;
					}

					else {
						break;
					}
				}
			}

		entrada.close();
	}

	public static String verificarSimNao(Scanner entradaTeste, String mensagemTeste){

		String tecladoTeste = "";

		while(true) {
			System.out.println(mensagemTeste);

			tecladoTeste = entradaTeste.nextLine().toUpperCase();

			if (tecladoTeste.equals("S") || tecladoTeste.equals("N")){
				break;
			}

			else {
				continue;
			}
		}

		return tecladoTeste;
	}
}