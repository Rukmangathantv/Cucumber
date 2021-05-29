
public class Armstrong_Number {
	public void armst () {
		System.out.println("number is 1643");
	int num=1643;
	int a=num; 
	int i=0;
	int j=0;
	
	while (a>0)
	{
		i=a%10 ;
		j=(i*i*i*i)+j;
		a=a/10;
	}
	if(num==j)
	{
		System.out.println("armstrng num");
	}
	else
	{
		System.out.println("not armstrng num");
	}
	}
	
public static void main (String[]args) {
	Armstrong_Number arm = new Armstrong_Number();
	arm.armst();
}


}
