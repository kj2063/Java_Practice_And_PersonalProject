import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class num_print {
	public static void main(String[] args) {
		
		File f = new File("c:\\workspace\\¿¬½À\\num.txt");
		
		try {
			Scanner sc = new Scanner(f);
//			sc.useDelimiter(",");
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
