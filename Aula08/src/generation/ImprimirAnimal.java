package generation;


public class ImprimirAnimal {

public static void main(String[] args) {
		
		TestaAnimal t1 = new TestaAnimal();
		
		t1.somAnimal(new Cachorro());
		t1.somAnimal(new cavalo());
		t1.correr(new Cachorro());
		t1.correr(new cavalo());

	}
}


