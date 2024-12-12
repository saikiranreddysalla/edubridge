package Features;

@FunctionalInterface
interface MyFunctionalinterface{
	void greet();
}
@FunctionalInterface
interface MyFunctionalinterface2{
	int findSquare(int num);
	
}
@FunctionalInterface
interface MyFunctionalinterface3{
	int findSum(int num1, int num2);
	
}
@FunctionalInterface
interface MyFunctionalinterface4{
boolean isEven(int num);
	
}
public class LambdaExpressions {
	public static void main(String[] args) {
		
		MyFunctionalinterface2 myFun2 = (x)->x*x;
		int square = myFun2.findSquare(10);		 
		 System.out.println(square);  
		 
		MyFunctionalinterface3 myFun3 = (x,y)-> x+y;
		int sum = myFun3.findSum(10,10);		 
		 System.out.println(sum);
		 
		 MyFunctionalinterface4 myFun4 = (x)-> x % 2 == 0; 		 
		System.out.println(myFun4.isEven(10));
		System.out.println(myFun4.isEven(11));
		
		 
	   MyFunctionalinterface myFun = ()-> System.out.println("Hello...");
       myFun.greet();

	}

}
