import java.util.Scanner;
//display how input one character from keyboader
public class Class446{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char a = s1.charAt(0);
		System.out.println(a);
		
		String s2 = sc.next();
		char b = s2.charAt(0);
		System.out.println(b);
	}
}
