class Constructor_Over
{
	int roll;
	String name;
	String course;
	Constructor_Over()
	{
                   System.out.println("Values in default constructor is:");
	roll=1;
	name="prudhvi";
	course="CSE";
                  System.out.println("Roll:"+roll+" "+"Name:"+name+" "+"course:"+course);
	} 
	Constructor_Over(int r,String n,String c)
	{
                   System.out.println("Values in parametarised constructor is:");
	roll=r;
	name=n;
	course=c;
                  System.out.println("Roll:"+roll+" "+"Name:"+name+" "+"course:"+course);
	} 
}
class Constructor_Over1
{ 
     public static void main(String args[])
{
     Constructor_Over c1=new Constructor_Over();
     Constructor_Over c2=new Constructor_Over(2,"afthab","ECE");
}
}