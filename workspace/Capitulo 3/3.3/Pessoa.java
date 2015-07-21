class Pessoa{

	static int id = 1;

}

class Teste{
	
	public static void main(String[] args){
		
		Pessoa p = new Pessoa();
		System.out.println(p.id);
		System.out.println(Pessoa.id);
		
	}
	
}