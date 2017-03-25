import java.util.Scanner;
public class ImpostoIR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				double rendaL;
				double impostoR = 0;
				double rendaH;
				double rendaM;
				double rendaC;
				final double INSS = 0.8;
				final double DESC = 20;
				
				Scanner leitor = new Scanner(System.in);
					System.out.println("Digite a Renda do homem");
					rendaH = leitor.nextDouble();
					System.out.println("Digite a Renda da mulher");
					rendaM = leitor.nextDouble();
					rendaC = (rendaH + rendaM);
						System.out.println("A renda conjunta é de: " + rendaC);
					
						if(rendaC>900.0 && rendaC<1500) {
							impostoR = ((rendaH + rendaM)*0.10);
							rendaL = (impostoR*INSS+DESC);
							System.out.println("O imposto de renda é de: " + impostoR + " ,A aliquota é de: 10% e a renda liquida é de: " + rendaL );
							
							}
							else if(rendaC>=1500 && rendaC<=2500.00) {
								impostoR = ((rendaH + rendaM)*0.15);
								rendaL = (impostoR*INSS+DESC);
								System.out.println("O imposto de renda é de: " + impostoR + " ,A aliquota é de: 15% e a renda liquida é de: " + rendaL);
							}
							else if(rendaC>2500)
								impostoR = ((rendaH + rendaM)*0.25);
						rendaL = (impostoR*INSS+DESC);
								System.out.println("O imposto de renda é de: " + impostoR +" ,A aliquota é de: 20% e a renda liquida é de: " + rendaL);
								
							{		
									
							

								
								
								
								
								
								
								
								
								
						}
									
						
							
					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}		
			


	}
