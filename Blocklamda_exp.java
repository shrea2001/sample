package java8features;


interface Func {

	int fact(int n);
}

class Blocklamda_exp {

	public static void main(String[] args)
	{
		// Block lambda expression
		Func f = (n) ->
		{
			int res = 1;

			
			for (int i = 1; i <= n; i++)
				res = i * res;
			return res;
		};

		
		System.out.println("Factorial of 5 : " + f.fact(5));
	}
}
