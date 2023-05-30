package infosys;

public class TotalPrac {
	
	
public int add (int a,int b) {
	return a+b;
}
public int multi (int a,int b) {
	return (a*b);
	
}
	
	
	public static void main(String[] args) {
		
	TotalPrac t = new TotalPrac();
	int c = t.add(12, 5);
	int d = t.multi(5, 8);
	
	
		System.out.println(c);
		System.out.println(d);
	}
	
	
}



	
