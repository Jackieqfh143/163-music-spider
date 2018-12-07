class Demo3_Operator 
{
	public static void main(String[] args) 
	{
		int x = 4;
		//       4    +    6  +  60
		int y = (x++) + (++x) + (x*10);

		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
