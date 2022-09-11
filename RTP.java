class Test
{
   public void test1()
   {
       System.out.println("Test class Method");
   }
}
public class RTP extends Test
{
    public void test1()
       {
          System.out.println("child class Method");
       }
   public static void main(String[] args)
   {
      Test t2=new Test();
      t2.test1();
      Test t1 =new RTP();
      t1.test1();
   }
}