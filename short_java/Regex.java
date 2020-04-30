package short_java;
import java.util.regex.*;


public class Regex{
	Pattern p;
	Matcher m;
	public Regex(String pattern,String matcher){
		p = Pattern.compile(pattern);  
		m = p.matcher(matcher);  
	}

	public boolean match(){
		return m.matches();
	}

	public boolean find(){
		return m.find();
	}

	public String group(int i){
		return m.group(i);
	}

	public int start(){
		return m.start();
	}

	public int end(){
		return m.end();
	}
}