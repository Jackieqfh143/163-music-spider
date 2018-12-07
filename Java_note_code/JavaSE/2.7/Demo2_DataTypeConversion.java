/**
	数据类型之强制转换
*/
class Demo2_DataTypeConversion 
{
	public static void main(String[] args) 
	{
		int x = 3;
		byte b = 4;
		// b = x + b;	  //会报错
		b = (byte)(x + b);
		System.out.println(b);
	}
}
