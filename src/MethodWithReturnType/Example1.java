package MethodWithReturnType;

public class Example1 {
public int multi(int x,int y) {
	int num=x*y;
return	num;
	
}
public static void main(String[] args) {
	Example1 E1=new Example1();
	
	int num1 = E1.multi(4, 5);
	System.out.println(num1);
	
	System.out.println(E1.multi(6, 9));
}
}
