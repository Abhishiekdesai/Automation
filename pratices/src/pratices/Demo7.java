package pratices;

public class Demo7 {       //copycon
	int id;
	int sal;
	Demo7()
	{
		id = 108;
		sal = 30000;                                //def con
		System.out.println("salary ="+sal);
		System.out.println("identity ="+id);
	}
	Demo7(Demo7 obj)
	{
		id = obj.id;
		sal = obj.sal;                               //copy cons
		System.out.println("id after copy ="+id);
		System.out.println("sal after copy ="+sal);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo7 obj1 = new Demo7();
		Demo7 obj2 = new Demo7(obj1);

	}
}
