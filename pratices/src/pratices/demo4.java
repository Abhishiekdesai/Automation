package pratices;

public class demo4 {
      public int add(int f, int g)
      {
    	  int a =f;
    	  int b=g;
    	  int x=f-g;
    	  return x;
      }
      public static void main(String args[])
      {
    	  demo4 obj=new demo4();
    	  int god=obj.add(100, 70);
    	  System.out.println(" x ="+god);
      }
}
