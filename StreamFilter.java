package java8features;
 
import java.util.stream.Stream; 

class StreamFilter { 
	public static void main(String[] args) {
		
		Stream<String> myStream =Stream.of("hello","I","Love","Programming","Language");
		myStream.filter(x ->x.startsWith("Prog")).forEach(System.out::println);
	} 
}
