class Demo1_Operator 
{
	public static void main(String[] args) 
	{
		//����ʹ��
		int a = 3;
		a++;					//a = a + 1;
		System.out.println("a = " + a);	//a = 4;
		a = 3;
		++a;					//a = a + 1;
		System.out.println("a = " + a);	//a = 4;

		//��������ʹ��
		int b = 3;
		int c;
		c = b++;	// ��++�ڱ��������ʱ��,���Ƚ������е�ֵȡ������ֵ����,Ȼ���������1
		System.out.println("b = " + b);  // b = 4;
		System.out.println("c = " + c);	 // c = 3;

		b = 3;
		c = ++b;	// ��++�ڱ���ǰ���ʱ��,�������1,Ȼ�󽫱����е�ֵȡ������ֵ����
		System.out.println("b = " + b);  // b = 4;
		System.out.println("c = " + c);	 // c = 4;

	}
}
