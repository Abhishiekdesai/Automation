package pratices;

public class demo2 {
	public float add()//where when we have the return type 
	//in the give program then we write the sop in the main program ;
	
	{
		float a =10;
		float b =39;
		float c =90;
		float res = a+b+c;
		return res;
		
		
	}
	public static void main(String args[])
	{
		demo2 obj=new demo2();
		float ytd=obj.add();
		System.out.println("res ="+ytd);
		
	}

}
