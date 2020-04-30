package short_java;
import java.util.*;
import java9.*;


public class get{
	Scanner scan=new Scanner(System.in);
	public static int Int(String data){
		Scanner scan=new Scanner(System.in);
		System.out.println(data);
		int v=scan.nextInt();
		return v;
	}

	public static String Str(String data){
		Scanner scan=new Scanner(System.in);
		System.out.println(data);
		String v=scan.nextLine();
		return v;
	}
	
	public static double Double(String data)
    {
        Scanner key=new Scanner (System.in);
        System.out.println(data);
        double v;
        v = key.nextDouble();
        return v;
    }
    public static float Float(String data)
    {
        Scanner key=new Scanner (System.in);
        System.out.println(data);
        float v;
        v = key.nextFloat();
        return v;
    }
    public static byte Byte(String data,byte value)
    {
        Scanner key=new Scanner (System.in);
        System.out.println(data);
        byte v;
        v=key.nextByte();
        return v;
    }
    public static short Short(String data)
    {
        Scanner key=new Scanner (System.in);
        System.out.println(data);
        short v;
        v = key.nextShort();
        return v;
    }
    public static long Long(String data)
    {
        Scanner key=new Scanner (System.in);
        System.out.println(data);
        long v;
        v = key.nextLong();
        return v;
    }


}