public enum Gf{
	bucky("nice","22"),
	kelsy("cutie","10"),
	julia("bigmistake","12"),
	gf1("gf1 description","age1"),
	gf2("gf2 description","age2"),
	gf3("gf3 description","age3"),
	gf4("gf4 description","age4"),
	gf5("gf5 description","age5");
	
	
	
	private final String desc;
	private final String year;
	
	Gf(String description,String birthday)
	{desc = description;
	year = birthday;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getYear()
	{
		return year;
	}
}