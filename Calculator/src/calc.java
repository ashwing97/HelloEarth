import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int option=1;
		do{
		System.out.println("Enter one of the following operation\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\nOR press 0 to exit");
		option = in.nextInt();
		if(option == 0) {
			continue;
		}
		System.out.println("Enter the two numbers for the operation:");
		int a = in.nextInt();
		int b = in.nextInt();
		
		switch(option) {
		case 1: System.out.println("Addition is :"+(a+b));
				break;
		case 2: System.out.println("Substraction is :"+(a-b));
				break;
		case 3: System.out.println("Multiplication is :"+(a*b));
				break;
		case 4: System.out.println("Division is :"+(a/b));
				break;
		default: System.out.println("Enter a valid option:");
				break;
		}
		}while(option != 0);
		
		in.close();
	}

}
