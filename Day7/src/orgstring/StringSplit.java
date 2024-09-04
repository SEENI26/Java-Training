package orgstring;

public class StringSplit 
{
	public static void main(String args[]){  
		String s1="java string split method by javatpoint";  
		
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		
		for(String w:words)
		{  
		System.out.println(w);  
		}  
	}
}
