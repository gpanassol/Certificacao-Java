class Objeto{
	int valor;
}

class Teste{
	public static void main(String[] args){

		Objeto a = new Objeto();
		a.valor = 5;

		Objeto b = new Objeto();
		b.valor = 5;

		Objeto c = a;

		System.out.println(a == b);
		System.out.println(a == c);
	}
}