package JavaBasics.Collection;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTrai {

    public static <E> void main(String[] args){

        ArrayList<Integer> ar= new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        System.out.println("*********");
        Employee e1=new Employee(22,"AA","India");
        Employee e2=new Employee(23,"BB","US");
        Employee e3=new Employee(24,"CC","Japna");
        ArrayList<Employee> ep =new ArrayList<Employee>();
        ep.add(e1);
        ep.add(e2);
        ep.add(e3);

        Iterator<Employee> ir = ep.iterator();
        while (ir.hasNext()){
         Employee e=   ir.next();
            System.out.println(e.age);
            System.out.println(e.Name);
            System.out.println(e.place);
            System.out.println("/////////////////////");
        }

        System.out.println("///////");
        ArrayList<String> st = new ArrayList<String>();
        st.add("Name");
        st.add("Animal");
        st.add("Thing");

        ArrayList<String> st1 = new ArrayList<String>();
        st1.add("Name1");
        st1.add("Animal1");
        st1.add("Thing");
        st.addAll(st1);
        for(int j=0;j<st.size();j++)
        {
            System.out.println(st.get(j));
        }
        System.out.println("///////");
       st.removeAll(st1);
        for(int j=0;j<st.size();j++)
        {
            System.out.println(st.get(j));
        }
        st.add("Thing");
     st.retainAll(st1);
        System.out.println("///////");
        for(int j=0;j<st.size();j++)
        {
            System.out.println(st.get(j));
        }


    }
}
