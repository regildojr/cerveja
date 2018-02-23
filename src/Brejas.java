import java.util.Scanner;

public class Brejas {
	private static Scanner leitor;

	public static void main (String [] args ){
		
		leitor = new Scanner(System.in);
		int cervejas = 99 ;
		int opcao = 0;
		int quantidade = 0;
		
			System.out.println("Informe o numero de cervejas");
			cervejas = leitor.nextInt();
			cervejas = cervejas - 1;
			
			while(cervejas > 0){
				
				System.out.println("existem " + cervejas + " no freezer\n");
			    System.out.println("pego uma garrafa e passo pra frente\n"); 
			    cervejas = cervejas -1;
				System.out.println(" Agora sao " + cervejas + " no freezer\n");
				if(cervejas == 1){
					System.out.println("Quer mais uma gelada ? 1 sim , 2  nao");
					opcao = leitor.nextInt();
					
					if(opcao==1){
						System.out.println("informe o numero de cerverjas");
						quantidade = leitor.nextInt();
						
						cervejas = quantidade;
						System.out.println("Cervejas reabastecidas");
					}else{
						System.out.println("Ta ficando sem ...");
					}
					
				}
			}
		
	}
}
				