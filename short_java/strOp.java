package short_java;
import java.util.*;

public class strOp{
	public static String reverse(String data){
		String rev=new String();
		int l=data.length();
		for(int i=l-1;i>=0;i--){
			rev=rev+data.charAt(i);
		}		
		return rev;
	}

	public static String slice(String data,int s,int end){
		String sliced=new String();
		for(int i=s;i<end;i++){
			sliced=sliced+data.charAt(i);
		}
		return sliced;
	}
}