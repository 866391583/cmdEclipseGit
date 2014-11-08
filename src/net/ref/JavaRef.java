package net.ref;
class Person
{
	String name;
	int age;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
}
public class JavaRef
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Person ap=new Person();
		ap.setAge(0);
		ap.setName("U");
		changeInfo(ap);
		System.out.println(ap.getName());
		System.out.println(ap.getAge());
		String str[]={"hello","world"};
		System.out.println(str[1]);
		

	}
	public static void changeInfo(Person p)
	{
		p.setName("hello world");
		p.setAge(20);
	}

}
