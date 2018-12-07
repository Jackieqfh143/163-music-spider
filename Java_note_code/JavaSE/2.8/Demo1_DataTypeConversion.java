class Demo1_DataTypeConversion
{
	public static void main(String[] args) 
	{
		float f = 12.3f;
		long x = 12345;

		f = x;					// 隐式转换
		System.out.println(f);

		//x = f;					//会报错
		x = (long)f;				//需要强制装换
		System.out.println(x);
	}
}
