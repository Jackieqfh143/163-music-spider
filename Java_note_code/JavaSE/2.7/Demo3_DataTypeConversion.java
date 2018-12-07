/**
强制转换的注意事项
*/
class Demo3_DataTypeConversion 
{
	public static void main(String[] args) 
	{
		/*
			00000000 00000000 00000000 10000010   130的二进制
			强制转换之后的到
			10000010		因为计算机是以补码的形式运算的,我们得先-1得到反码
			10000001		在高位变其他位取反得到原码
			11111110        结果为 -126

		*/
		byte b = (byte)(126 + 4);
		System.out.println(b); // 输出结果为 -126
	}
}
