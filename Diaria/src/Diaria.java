import java.util.Scanner;

public class Diaria {

	public static void main(String[] args) {
		// TODO Auto-generated method
		double dias = 0;
		double Total;
		String nome; 
			Scanner leitor= new Scanner(System.in);

System.out.println("Informe o Nome do Cliente:");
	nome= leitor.next();
		System.out.println("Informe Quantos Dias o Cliente " + nome + " Ficou hospedado");
			dias= leitor.nextDouble();
				
				if(dias<15){
					Total=(300+20);
						System.out.println("O total a pagar é  " + Total);
			}
			
			if(dias==15){
				Total=(300+14);
					System.out.println("O total a pagar é  " + Total);
			}
			
			if(dias>15){
				Total= (300+12);
					System.out.println("O total a pagar é   " + Total);
			}
			
			

}




	}


