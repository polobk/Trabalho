import java.util.Scanner;

public class SPAFelipe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float peso;
		float altura;
		double pfinal;
		
		
		Scanner leitor = new Scanner (System.in);//Scanner
			System.out.println("Informe seu Peso");
			peso = leitor.nextFloat();
			System.out.println("Informe sua Altura");
			altura = leitor.nextFloat();
			System.out.println(" ");
			System.out.println("Seu peso é: " + peso +"Kg " + " Sua altura é: " + altura);
			
						
			if(peso==50 && altura==1.50){
				System.out.println(" ");
				System.out.println("Parabéns você está no seu peso ideal");
			
			}else if(peso>50 && altura==1.50){
				pfinal=(peso-50);
				System.out.println(" ");
				System.out.println("Você está acima do peso, emagreça: " + pfinal + "Kg ");
				
			}else if(peso<50 && altura==1.50){
				pfinal=(50-peso);
				System.out.println(" ");
				System.out.println("Você está abaixo do peso, engorde: " + pfinal + "Kg ");
				
			} if(peso==70 && altura>=1.50 && altura<=1.90){
				System.out.println(" ");
				System.out.println("Parabéns você está no seu peso ideal");
				
			}else if(peso>70 && altura>1.50 && altura<=1.90){
				pfinal=(peso-70);
				System.out.println(" ");
				System.out.println("Você está acima do peso, emagreça: " + pfinal + "Kg ");
			
			}else if(peso<70 && altura>1.50 && altura<=1.90){
				pfinal=(70-peso);
				System.out.println(" ");
				System.out.println("Você está abaixo do peso, engorde: " + pfinal + "Kg ");
			
			}if(peso==100 && altura>1.90){
				System.out.println("");
				System.out.println("Parabéns você está no seu peso ideal");
				
			}else if(peso>100 && altura>1.90){
				pfinal=(peso-100);
				System.out.println(" ");
				System.out.println("Você está acima do peso, emagreça: " + pfinal + "Kg ");
			
			}else if(peso<100 && altura>1.90){
				pfinal=(100-peso);
				System.out.println(" ");
				System.out.println("Você está abaixo do peso, engorde: " + pfinal + "Kg ");
			}
			
			
		
		
		
		
		
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
}




	}


