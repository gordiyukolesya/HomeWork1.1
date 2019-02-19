import java.util.Scanner;

public class main {

	public static void main (String[] args){
		float a=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Enter desired number");
	    a = scanner.nextFloat();
		float x = (float) Math.sqrt(a);
		System.out.print ("√a = ");
		System.out.println(x);
		
	}
}
