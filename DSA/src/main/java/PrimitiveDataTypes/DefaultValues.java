package PrimitiveDataTypes;

import java.util.Arrays;

public class DefaultValues {
	int a;
	char ch;
	float var;
	double d;
	byte b;
	short s;
	long l;
	boolean bl;
	static int bb;
	public static void main(String[] satish) {
		String str="satishpunekarhirekodichikodihbelagavihkarnatakahindiahasiahearthsolarhsystem";
		
		satish=str.split("h");
		System.out.println(Arrays.toString(satish));
		System.out.println(satish[1].length());
		
		int a=20;
		DefaultValues dv=new DefaultValues();
		//instance variable.--->to this we need to create objects.
		System.out.println(dv.a);//default value =0(line number 4,a)
		System.out.println(dv.ch);//0(\u0000)
		System.out.println(dv.var);//0.0
		System.out.println(dv.b);//0
		System.out.println(dv.d);//0.0
		System.out.println(dv.l);//0
		System.out.println(dv.s);//0
		System.out.println(dv.bl);//false
		
		//static.--->for this we dont need to create object, directly we can use by className 
		System.out.println(DefaultValues.bb);
		//local variable.
		System.out.println(a);// we must initialize local variables bcz they will get distry outside method
		
	}

}
