
import java.util.*;
public class MyClass 
{

	public void MyNumbers()
	{
		int a;
		byte b;
		long c;
		short d;
		float e;
		double f;
		System.out.println("Enter the numbers");
		Scanner num= new Scanner(System.in);
		b=num.nextByte();
		d=num.nextShort();
		a=(int)b+(int)d;
		System.out.println("Int sum is:"+ " "+a);
		c=(long)a+(long)d;
		System.out.println("Long sum is:"+ " "+c);
		e=(float)c+(float)a;
		System.out.println("Float sum is:"+ " "+e);
		f=(double)e+(double)a;
		System.out.println("Double sum is:"+ " "+f);
	}
	
	public static void main(String[] args) 
	{
		MyClass obj=new MyClass();
		obj.MyNumbers();

	}

}
