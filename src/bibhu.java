//class test
//{  
//  public static void main(String args[])
//  {  
//   Class c = boolean.class;   
//   System.out.println(c.getName());  
//  
////   Class c2 = test.class;   
////   System.out.println(c2.getName());  
// } 
//}






class Simple{}  
interface My{}  
  
class Test
{  
 public static void main(String args[]) throws ClassNotFoundException
 {   
   Class c=Class.forName("abc.Simple");  
   System.out.println(c.isInterface());  
     
   Class c2=Class.forName("abc.My");  
   System.out.println(c2.isInterface());   
  
 }  
} 