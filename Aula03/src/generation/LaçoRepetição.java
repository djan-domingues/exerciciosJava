package generation;

public class La�oRepeti��o {

	public static void main(String[] args) throws InterruptedException {
		
		int numero = 10;
		
		while(numero>0) {
			
			System.out.println("\nContando..." + numero);
			numero = numero-1;
			Thread.sleep(1000);
			
		}

		System.out.println("\nContagem parada...");
		
	}

}
