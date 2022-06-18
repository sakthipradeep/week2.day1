package week2.day2.assignment;

public class PalinDrome {

	public static void main(String[] args) {
		String value="madam",rev="";
		int valueLength=value.length();
		for(int i=(valueLength-1);i>=0;--i) {
rev=rev+value.charAt(i);
		}
			if(value.toLowerCase().equals(rev.toLowerCase())) {
				System.out.println(value+"is a palindrome");
			}
			else {
				System.out.println(value+"is not a palindrome");
			}
		}
	}
