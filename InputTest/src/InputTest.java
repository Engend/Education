import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(Paths.get("myfile.txt"));
		Scanner in2 = new Scanner(Paths.get("myfile2.txt"));
		String name = in.nextLine();
		System.out.println(": " + name);
		String name2 = in2.nextLine();
		System.out.println(": " + name2);
	}
}
