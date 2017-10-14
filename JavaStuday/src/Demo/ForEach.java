package Demo;
/*
 *��For-Eachѭ����ȱ�㣺������������Ϣ��
 *  ���������ϻ�����ʱ�������Ҫ���ʼ��ϻ�������±꣬
 *  ��ô���ʹ�þ�ʽ�ķ�ʽ��ʵ��ѭ�������������Ҫʹ����ǿ��forѭ����
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("----------�ɷ�ʽ����------------");
        //��ʽ��ʽ        
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
        System.out.println("---------�·�ʽ����-------------");
        
        //��ʽд��,��ǿ��forѭ��
        for(int element:arr)
        {
            System.out.println(element);
        }
        
        System.out.println("---------������ά����-------------");
        
        //������ά����
        
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}} ;
        
        for(int[] row : arr2)
        {
            for(int element : row)
            {
                System.out.println(element);
            }
        }
        
        //�����ַ�ʽ��������List
        
        List<String> list = new ArrayList<String>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        
        System.out.println("----------��ʽ1-----------");
        //��һ�ַ�ʽ����ͨforѭ��
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
            
        }
        
        System.out.println("----------��ʽ2-----------");
        //�ڶ��ַ�ʽ��ʹ�õ�����
        for(Iterator<String> iter = list.iterator(); iter.hasNext();)
        {
            System.out.println(iter.next());
        }
        System.out.println("----------��ʽ3-----------");
        //�����ַ�ʽ��ʹ����ǿ�͵�forѭ��
        for(String str: list)
        {
            System.out.println(str);
            
        }
    }

}
