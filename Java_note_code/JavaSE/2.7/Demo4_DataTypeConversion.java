/**
	������: ������ĳ����Ƿ�������, ���������, ��ָ����˵������
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
			����������
			1. byte �� byte(��short, char) ���������ʱ�������Ϊint,
			����int������ӵĽ��Ҳ��int����
			2. b1 �� b2 ����������, �����洢��ֵ�Ǳ仯��,
			�ڱ����ʱ���޷��ж���������ֵ,����п��ܻᳬ��byte��ֵ
		*/


		byte b4 = 3 + 4;
		/*
			Java �����Ż�����, ���Զ�������������Ľ��, �൱���� byte b4 = 7;
		*/
		System.out.println(b4);
	}
}
