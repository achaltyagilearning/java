class ObjectCounter{
	private String name;
	private String age;
	private static int counter =  0;
	
	public ObjectCounter(String name, String age)
	{
	   this.name = name;
       this.age = age;
       counter++;	   
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAge()
	{
		return age;
	}
	public static int getCounter()
	{
		return counter;
	}
	
	
}