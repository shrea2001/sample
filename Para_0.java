package java8features;


interface Test1 {
	void print();
}

class Para_0 {

	static void fun(Test1 t) { t.print(); }
	public static void main(String[] args)
	{
	
		fun(() -> System.out.println("Hello"));
	}
}

