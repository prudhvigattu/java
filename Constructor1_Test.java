class Constructor1
{
      int roll;
      String name;
      String course;
      Constructor1()
      {
	roll=1;
	name="prudhvi";
	course="CSE";
      }
      void display()
       {
	System.out.println("Roll:-"+roll);
                  System.out.println("Name:-"+name);
	System.out.println("Course:-"+course);
      }
}
class Constructor1_Test
{
       public static void main(String args[])
       {
	Constructor1 c=new Constructor1();
	c.display();
        }
}

