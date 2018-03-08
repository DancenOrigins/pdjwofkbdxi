package pkgS;

import java.util.Scanner;

public class Stringle {

	public static void main(String[] args) {
		Stuffy();
	}
	public static char Stuffy(){
	System.out.println("why dont you put in your name you hairless chimpanzee");
	Scanner scanner = new Scanner (System.in);
	String text = scanner.nextLine();
	
	scanner.close();
	
	int lenth = text.length()-1;
	
	int i = 0;
	
	for(i = 0; i <= lenth; i++){
		char c1 = text.charAt(i);
		if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u'){
			System.out.println(c1);
			return c1;
			
			
			
		}
	}
	return 0;
	
	
	}
	

}
