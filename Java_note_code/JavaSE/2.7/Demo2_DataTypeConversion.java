/**
	��������֮ǿ��ת��
*/
class Demo2_DataTypeConversion 
{
	public static void main(String[] args) 
	{
		int x = 3;
		byte b = 4;
		// b = x + b;	  //�ᱨ��
		b = (byte)(x + b);
		System.out.println(b);
	}
}
