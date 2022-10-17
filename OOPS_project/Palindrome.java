import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(String a) {
		if(a.length()==0 || a.length()==1) {
			return true;
		}
		if(a.charAt(0) == a.charAt(a.length()-1)) {
			return isPalindrome(a.substring(1, a.length()-1));
		}
		return false;
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input="";
		System.out.println("provide the word");
		input = sc.nextLine();
		input = input.toLowerCase();
		System.out.println(isPalindrome(input));
		sc.close();
	}

}
