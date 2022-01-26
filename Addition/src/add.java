import java.util.Scanner;
public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		a = myScanner.nextInt();
		b = myScanner.nextInt();
		System.out.println("Addition is :"+(a+b));
		myScanner.close();
	}

	
}
