class Demo1_Operator 
{
	public static void main(String[] args) 
	{
		//单独使用
		int a = 3;
		a++;					//a = a + 1;
		System.out.println("a = " + a);	//a = 4;
		a = 3;
		++a;					//a = a + 1;
		System.out.println("a = " + a);	//a = 4;

		//参与运算使用
		int b = 3;
		int c;
		c = b++;	// 当++在变量后面的时候,会先将变量中的值取出做赋值操作,然后再自身加1
		System.out.println("b = " + b);  // b = 4;
		System.out.println("c = " + c);	 // c = 3;

		b = 3;
		c = ++b;	// 当++在变量前面的时候,会自身加1,然后将变量中的值取出做赋值操作
		System.out.println("b = " + b);  // b = 4;
		System.out.println("c = " + c);	 // c = 4;

	}
}
