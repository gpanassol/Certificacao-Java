class B{
	int c;
	void c(int m){
		System.out.println("Classe B.: " + c);
		c = m;
		System.out.println("Classe B.: " + c);
	}
}

class A{
	public static void main(String[] args){
		B b = new B();
		b.c = 10;
		System.out.println(b.c);
		b.c(30);
		System.out.println(b.c);
	}
}