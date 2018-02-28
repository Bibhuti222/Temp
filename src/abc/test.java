package abc;

//class Temp
//{
//	
//}
//public class test extends Temp
//{
//	public static void main(String[] args) throws ClassNotFoundException 
//	{
//		Class ref=Class.forName("abc.test");
//		System.out.println(Class.forName("abc.Temp"));
//		System.out.println(ref.getName());
//		System.out.println(ref.getClass());
//		System.out.println(ref.getSuperclass());
//		System.out.println(ref.getClasses());
//	}
//}

//class Simple{}  
//
//class test
//{  
//  public static void main(String args[])
//  {  
//   Simple ref=new Simple();
//   Class c=ref.getClass();
//   System.out.println(ref.getClass());
//   System.out.println(c.getName());
// } 
//}

//class Simple{}  
// 
//class test
//{  
//	public static void main(String args[])
//	{  
//		Class c;
//		try
//		{
//			c = Class.forName("Simple");
//			System.out.println(c.getName());  
//		}
//		catch (ClassNotFoundException e)
//		{
//			// TODO Auto-generat d catch block
//			//e.printStackTrace();
//			System.out.println("jhvv");
//		}
//	}
//}



//
//class test
//{  
//  public static void main(String args[])
//  {  
//   Class c1 = boolean.class;   
//   System.out.println(c1.getName());
//  
//   Class c2 = test.class;   
//   System.out.println(c2.getName());  
// } 
//}





class Simple{}  
interface My{}  
  
class Test
{  
 public static void main(String args[]) throws ClassNotFoundException
 {   
   Class c=Class.forName("Simple");  
   System.out.println(c.isInterface());  
     
   Class c2=Class.forName("My");  
   System.out.println(c2.isInterface());   
  
 }  
}  





