package java8features;

import java.util.stream.Stream; 

class FilterByObjectProperties { 

	public static void filterByEvenElements() 
	{ 
		Integer[] myArray 
			= new Integer[] { 1, 4, 5, 7, 9, 10 }; 

		Stream.of(myArray) 
			.filter(x -> x % 2 == 0) 
			.forEach(System.out::println); 
	} 

	public static void filterByStartsWith() 
	{ 
		
		String[] myArray 
			= new String[] { "stream", "is", "a", 
							"sequence", "of", "elements", 
							"like",	 "list" }; 

		Stream<String> myStream = Stream.of(myArray); 
		myStream.filter(x -> x.startsWith("s")) 
			.forEach(System.out::println); 
	} 

	public static void filterByStartsWithVowelsRegex() 
	{ 
		String[] myArray 
			= "I am 24 years old and I want to be in Tier I company"
				.split(" "); 

		Stream<String> myStream = Stream.of(myArray); 

		myStream.filter(x -> x.matches("(a|e|i|o|u)\\w*")) 
			.forEach(System.out::println); 
	} 

	public static void main(String[] args) 
	{ 
	
		filterByEvenElements(); 
		System.out.println("======"); 

	
		filterByStartsWith(); 
		System.out.println("======"); 

	
		filterByStartsWithVowelsRegex(); 
	} 
}
