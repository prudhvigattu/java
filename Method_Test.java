class Method_Over
{
    int a,b,c;
    void display()
     {
            int a=10;
            int b=20;
            int c=30;
            System.out.println("addition in display1 method is"+(a+b+c));
    }
    void display(int a1,int b1,int c1)
    {
           int a=a1;
           int b=b1;
           int c=c1;
               System.out.println("addition in display1 method is"+(a+b+c));
}
}
class Method_Test
{
   public static void main(String args[])
  { 
     Method_Over m=new Method_Over();
      m.display();
      m.display(20,30,40);
}
}