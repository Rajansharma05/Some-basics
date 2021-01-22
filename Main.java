/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

rajansharma05
*******************************************************************************/

import java.util.Scanner;

 
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter first String __ ");
	    String str1 = in.nextLine();
	    System.out.println("Enter second string__");
	    String str2 = in.nextLine();
		System.out.println("Now they compared by lexicographically ___ and the output shown on unicode "+ str1.compareTo(str2));
	}
}
