package S2_Listbox;

import java.util.ArrayList;
import java.util.List;

public class Demo1
{
    public static void main(String[]args)
    {
        List<String> a1=new ArrayList<String>();
        a1.add("ganesh");
        a1.add("mahesh");
        a1.add("suresh");


        for(String s1:a1) {
            System.out.println(s1.toUpperCase());
        }
        System.out.println(a1.size());
        }
    }

