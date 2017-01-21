//将C盘一个文本文件复制到D盘。

/*
复制的原理：
其实就是将C盘下的文件数据存储到D盘的一个文件中。

步骤：
1，在D盘创建一个文件。用于存储C盘文件中的数据。
2，定义读取流和C盘文件关联。
3，通过不断的读写完成数据存储。
4，关闭资源。
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
			fr = new FileReader("F:\\Java 代码\\day18\\RunTime.java");
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
