package infosys;

public class New {
 int a=27;
 void run () {
	 System.out.println("h");
 }
int add1 (int d, int b,int c) {
	return (d+b+c);
}
 int s (int a,int b, int c) {
	 return (a*b*c);
	 
 }
 float f (float a,float b,float c) {
	 return (a/b/c);
	 
 }
 
 
 public static void main (String[]args) {
	 
	 New n = new New();
	 
	 n.run();
	 System.out.println(n.a);
     System.out.println(n.add1(3,4,6));
     System.out.println(n.s(4, 6, 6));
     System.out.println(n.f(6, 8, 12));


}
}




