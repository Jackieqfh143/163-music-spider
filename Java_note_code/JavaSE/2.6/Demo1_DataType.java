class Demo1_DataType 
{
	public static void main(String[] args) 
	{
		// 整数类型
		byte b = 10;                 // 占一个字节
		short s = 20;				 // 占两个字节
		int i = 30;					 // 占四个字节  整数的数据类型默认就是 int 类型
		long x = 8888888888888L;	 // 占八个字节 如果long类型后面加L进行标识最后加大L,因为小l想1了
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(x);

		// 浮点类型
		float f = 12.3F;			 // 占四个字节
		double d = 33.4;             // 占八个字节	小数默认的数据类型就是double
		System.out.println(f);
		System.out.println(d);

		// 字符类型
		char c = 'a';				 // 占两个字节
		System.out.println(c);

		// 布尔类型
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
	}
}
