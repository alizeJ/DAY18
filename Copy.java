//��C��һ���ı��ļ����Ƶ�D�̡�

/*
���Ƶ�ԭ��
��ʵ���ǽ�C���µ��ļ����ݴ洢��D�̵�һ���ļ��С�

���裺
1����D�̴���һ���ļ������ڴ洢C���ļ��е����ݡ�
2�������ȡ����C���ļ�������
3��ͨ�����ϵĶ�д������ݴ洢��
4���ر���Դ��
*/
import java.io.*;

class  Copy
{
	public static void main(String[] args) 
	{
		FileWriter fw = null;
		FileReader fr = null;
		try
		{
			fw = new FileWriter("F:\\56398.txt");
			fr = new FileReader("F:\\Java ����\\day18\\RunTime.java");
			int num = 0;
			while((num=fr.read())!=-1)
			{
				fw.write(num);
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			if(fw!=null)
				try
				{
					fw.close();
				}
				catch (IOException e)
				{
					System.out.println(e.toString());
				}
			if(fr!=null)
				try
				{
					fr.close();
				}
				catch (IOException e)
				{
					System.out.println(e.toString());
				}
		}
	}
}
