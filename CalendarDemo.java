import java.util.*;
import java.text.*;

class  CalendarDemo
{
	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();
		sop(c.get(Calendar.YEAR));

		String[] mons = {"һ��","����","����","����"
					,"����","����","����","����"
					,"����","ʮ��","ʮһ��","ʮ����"};


		String[] weeks = {
						 "","������","����һ","���ڶ�",
						"������","������","������","������",
						};		

		int index = c.get(Calendar.MONTH);
		int index2 = c.get(Calendar.DAY_OF_WEEK);

		sop(c.get(Calendar.MONTH));//Ϊʲô��2
		sop(weeks[index2]);
		sop(c.get(Calendar.DAY_OF_MONTH));
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
