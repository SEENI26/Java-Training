package arrays;

public class ObjectTypeArray 
{
	public static void main(String[] args) {
		
		// objects represent storing multiple objects in a single name.
			Object a[]=new Object[5];
			
			a[0]=100;
			a[1]="welcome";
			a[2]='A';
			a[3]=true;
			a[4]=10.5;
			
			//System.out.println(Arrays.toString(a)); //[100, welcome, A, true, 10.5]

			for(Object x:a)
			{
				System.out.print(x);
			}
		}

}
