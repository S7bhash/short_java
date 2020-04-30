import java.util.*;
import java.io.*;
import short_java.*;

class test1{
	public static void main(String[] args) {
		System.out.println("Demo for syntax of printing..");
		//########################//
		//#### PRINTING ##########//
		//########################//
		C.out("Printing without linebreak");
		C.outln("\nPrinting with linebreak");

		System.out.print("\nDemo of Regex syntax...");
		//########################//
		//#### REGEX #############//
		//########################//
		Regex m=new Regex(".s","as");
		System.out.println(m.match());

		System.out.println("\nDemo for scanning...");
		//########################//
		//#### SCANNING ##########//
		//########################//
		int n=get.Int("Enter the number");
		String s=get.Str("Enter the String");

		System.out.println("\nDemo for String operation");
		//########################//
		//## STRING OPERATIONS ###//
		//########################//
		String s1="Hello World";

		String reverse=strOp.reverse(s1);
		String slice=strOp.slice(s1,2,6);

		//########################//
		//## Array Operations ####//
		//########################//

		int arr[]={5,6,7,7,8,4};
		arrayOp.print(arr);
	}
}