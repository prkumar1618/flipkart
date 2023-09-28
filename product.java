class product
{
	public static void main(string args[])
	{
		int n1,n2,res;
		scanner s=new scanner(system.in);
		system.out.println("Enter n1 value");
		n1=s.nextInt();
		system.out.println("Enter n2 value");
		n2=s.nextInt();
		res=n1*n2;
		system.out.println("The product value is : "+res);
	}
}
