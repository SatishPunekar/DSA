package oops;

class Main {
	private int score;
	private int age;
	
	public Main(String name,int score,int age ) {
		this.age=age;
		this.score=score;
	}
	public String eligible() {
		if(age>20&&score>10) {
			System.out.println(age+" "+score);
			return "Yes";
		}
		else {
			System.out.println(age+" "+score);
			return "NO";
			
		}
	}

}

public  class student{
	public static void main(String[] args) {
		Main mn=new Main("satish", 30, 20);
		String result=mn.eligible();
		System.out.println(result);
		
	}
}

