package Draw;

public class Patterns {
	
public static void main(String [] args) {
	
	String s = "#";
	
	for (int i = 1; i<=6; i++) {
		
		for(int j = 1; j <= 6 - i; j++) {
			
			System.out.print(" ");
		}
		System.out.println(s);
		s += "##";
	}
	
}
}	
	


