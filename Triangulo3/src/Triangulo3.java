import java.util.Scanner;

public class Triangulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lado1;
        double lado2;
        double lado3;
        
        //Scanner
        Scanner leitor= new Scanner(System.in);
        
        System.out.println("informe o tamanho do primeiro lado: ");
        lado1= leitor.nextDouble();
        System.out.println("informe o tamanho do segundo lado: ");
        lado2= leitor.nextDouble();
        System.out.println("informe o tamanho do terceiro lado: ");
        lado3= leitor.nextDouble();
        
        if(lado1==lado2){
          if(lado2==lado3){
        	  System.out.println("O triangulo � Equil�tero");	  
          }
          
     	}
        
        if((lado1!=lado2 && lado2==lado3) ||(lado3!=lado1 && lado2==lado1) ){
        
        						System.out.println("O triangulo � Is�celes");
        }
       
        if(lado1!=lado2){
        	if(lado3!=lado1){
        		System.out.println("O triangulo � Escaleno");	
       
        	}
        }

	}


	}


