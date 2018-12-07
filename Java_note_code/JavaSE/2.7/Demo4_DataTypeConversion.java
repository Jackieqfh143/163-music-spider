/**
	面试题: 看下面的程序是否有问题, 如果有问题, 请指出并说明理由
*/
class Demo4_DataTypeConversion 
{
	public static void main(String[] args) 
	{
		byte b1 = 3; 
		byte b2 = 4;
		// byte b3 = b1 + b2;
		// System.out.println(b3);
		/*
			从两个方面
			1. byte 与 byte(或short, char) 进行运算的时候回提升为int,
			两个int类型相加的结果也是int类型
			2. b1 和 b2 是两个变量, 变量存储的值是变化的,
			在编译的时候无法判断里面具体的值,相加有可能会超过byte的值
		*/


		byte b4 = 3 + 4;
		/*
			Java 常量优化机制, 会自动求出两个常量的结果, 相当于了 byte b4 = 7;
		*/
		System.out.println(b4);
	}
}
