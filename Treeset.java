package java8features;

//Use a lambda expression to create a reverse comparator
import java.util.*;

class Treeset{
public static void main(String args[]){


TreeSet<String> ts=new TreeSet<String>();


ts.add("A");
ts.add("B");
ts.add("C");
ts.add("D");
ts.add("E");
ts.add("F");
ts.add("G");


for(String element : ts)
	System.out.println(element + "");

System.out.println();
}
}
