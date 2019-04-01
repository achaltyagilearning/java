class TestObjectCounter{
	
	public static void main(String args[])
	{
		ObjectCounter obj = new ObjectCounter("First","22");
		ObjectCounter obj1 = new ObjectCounter("Seconed","23");
		ObjectCounter obj3 = new ObjectCounter("Third","24");
		
		System.out.printf("%s\t%s\t%d\n%s\t%s\t%d\n%s\t%s\t%d",obj.getName(),obj.getAge(),ObjectCounter.getCounter(),
		obj1.getName(),obj1.getAge(),ObjectCounter.getCounter(),obj3.getName(),obj3.getAge(),ObjectCounter.getCounter());
		
	}
	
	
	
}