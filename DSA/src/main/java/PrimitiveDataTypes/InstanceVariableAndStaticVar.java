package PrimitiveDataTypes;



public class InstanceVariableAndStaticVar {

	static int var;
	
	int s=10;
	int b;
	int c=30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariableAndStaticVar printStream = new InstanceVariableAndStaticVar();
		System.out.println(printStream.b=printStream.c+printStream.s);//b=
		System.out.println(InstanceVariableAndStaticVar.var);
		String str="satish";

	}

}
