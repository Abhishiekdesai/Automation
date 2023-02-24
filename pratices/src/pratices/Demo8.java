package pratices;

public class Demo8 {
	int e;
	int id;
	String n;
	Demo8()           
	{
		e = 30;
		id =31;
		n = "abhi";
		System.out.println("def e="+e);
		System.out.println("def id ="+id);
		System.out.println("def name ="+n);
	}
	Demo8(int t,String n,int o)
	{
		int a = t;
		String b = n;
		int c = o;
		System.out.println("a="+t);
		System.out.println("b="+n);
		System.out.println("c ="+o);
	}	
	Demo8(int y, int u, int x)
	{
		int g =y;
		int h = u;
		int p = x;
		System.out.println("g="+y);
		System.out.println("h="+u);
		System.out.println("p ="+x);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8 obj1 = new Demo8();
		Demo8 obj2 = new Demo8(30,"abhi",67);
		Demo8 obj3 = new Demo8(21,32,43);
			}
		
		

	}


