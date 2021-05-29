
public class reverse {
	public static void main(String[] args)
	{
		int num=12345;
		int a=num;
		int i=0;int j=0;
		while(a>0)
		{
			i=a%10;
			j=(j*10)+i; //5*10=50+4+54; j=54*10=540+3=543;  j=543*10+2=5432; j=5432*10=1=54321
			a=a/10;
		}
		System.out.println("reverse num is "+j);
	}
}
