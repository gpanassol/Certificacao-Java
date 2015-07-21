class Calculadora{
	
	public int soma(int... nums){
		int total = 0;
		for(int a : nums){
			total += a;
		}
		return total;
	}
}

class Teste{
	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		System.out.println(cal.soma(1,2,3,4,5,6,7));
	}
}