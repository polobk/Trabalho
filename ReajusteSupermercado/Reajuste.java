import java.util.Scanner;

public class Reajuste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				double ValorP;
				double DiasM;
				double reajuste;
				double VendaM;
				double total;
				Scanner leitor= new Scanner(System.in);

				System.out.println("Insira quantos dias o mercado Fuciona no Mês: ");
				DiasM= leitor.nextDouble();
				
				System.out.println("Insira o preço do produto: ");
				ValorP= leitor.nextDouble();
				
				VendaM= (DiasM*ValorP);
					
				if(VendaM<=500 && ValorP<=30){
				reajuste= (VendaM*0.1);
				total= (ValorP+reajuste);
				System.out.println("O produto teve um reajuste de " + reajuste);
				System.out.println("O novo valor a pagar é de: " + total + " R$" );
				}
				
				if(VendaM>=500 && ValorP>=30 || ValorP<60){
				reajuste=(VendaM*0.15);
				total=(ValorP+reajuste);
				System.out.println("O produto teve um reajuste de " + reajuste);
				System.out.println("O novo valor a pagar é de R$ " + total );
				}
			
				if(VendaM>=1200 && ValorP>=80){
				reajuste=(VendaM*0.2);
				total=(ValorP-reajuste);
				System.out.println("O produto teve um reajuste de " + reajuste);
				System.out.println("O novo valor do produto é de R$ " + total );
					
				}
			}

		

				

			

	}


