import java.util.ArrayList;
import java.util.Scanner;

public class CacheManagementTest {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		CustomArrayList<String> stringList = new CustomArrayList<>(5);

		System.out.print("Please enter a sentence : ");
		String enteredString = input.nextLine();
		
		String[] enteredStringArray = enteredString.split(" ");

		for (int i = 0; i < enteredStringArray.length; i++) {

			stringList.addElement(enteredStringArray[i]);
			System.out.println("Buffer "  + (i+1)  + ".status ---> " + stringList.getCustomList());
			

		}
	

	}
}
