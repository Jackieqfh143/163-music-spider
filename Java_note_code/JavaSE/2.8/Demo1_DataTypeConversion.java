class Demo1_DataTypeConversion
{
	public static void main(String[] args) 
	{
		float f = 12.3f;
		long x = 12345;

		f = x;					// ��ʽת��
		System.out.println(f);

		//x = f;					//�ᱨ��
		x = (long)f;				//��Ҫǿ��װ��
		System.out.println(x);
	}
}
