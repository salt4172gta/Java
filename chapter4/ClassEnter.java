import java.util.Scanner;
public class ClassEnter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string ,enter as separtor");
		String s1 = sc.nextLine();//enter as a delimetor
		String s2 = sc.nextLine();//enter as a delimetor
		String s3 = sc.nextLine();//enter as a delimetor
		String s4 = sc.nextLine();//enter as a delimetor
		System.out.println(s1.concat(s2).toUpperCase());
		System.out.println(s3.concat(s4).toUpperCase());
		
		
	}

}
