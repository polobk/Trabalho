import java.util.Scanner;

public class calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			double  IR, renda;
		double total;
		final double Desconto= 600;
		String nome;
		Scanner leitor= new Scanner(System.in);
		  
		
			System.out.println("Insira Seu nome: ");
				nome= leitor.next();
		
					System.out.println( nome + " Insira sua renda Anual: ");
						renda= leitor.nextDouble();
		
							if(renda<=10000){
								System.out.println(nome + " , Você está isento.");	
							}
		
								if(renda>=10000 && renda<=30000){
									IR= (renda-Desconto)*0.05;
										System.out.println(nome + " Sua Renda Anual é de: " + IR);
								}
									if(renda>=30000 && renda<=60000){
										IR=(renda-Desconto)*0.1;
											System.out.println(nome + " Sua Renda Anual é de: " + IR);
									}	
									
									if(renda>60000){
									IR=(renda-Desconto)*0.15;
									System.out.println(nome + " Sua renda Anual é de: " + IR);
									}
}




	}





