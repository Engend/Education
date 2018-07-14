import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Test!");
		String name = in.nextLine();
		
		System.out.println("Old");
		int age = in.nextInt();
		
		System.out.println(name + " | " + age);
	}
}
