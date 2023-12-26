import java.util.*;
class check{
	int add(int j,int h) {
		return(j+h);
	}
	int mul(int a,int b) {
		return(a*b);
	}
}

public class Shubham {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter num A");
		int a=obj.nextInt();
		System.out.println("Enter num B");
		int b=obj.nextInt();
		check obj1=new check();
		System.out.println("Sum of a and b= " +obj1.add(a,b));
		System.out.println("Sum of a and b= " +obj1.mul(a,b));
	}

}