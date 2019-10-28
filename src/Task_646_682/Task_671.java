package Task_646_682;

public class Task_671 {
    public  static  void  main(String [] args) {
        String [] arr=new String[]{"arman195454","karen125454","vzgo295454","davo295454"};
        String st;
        for(String  N:arr)
        {
            st="";
            for(int i=N.length()-1;i>=N.length()-6;i--)
                st+=N.charAt(i);
            if(st.equals("454592")==true) {
                st="";
                for (int i = 0; i < N.length() - 6; i++)
                    st+=N.charAt(i);
                System.out.println(st);
            }
        }
    }
}
