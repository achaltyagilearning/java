import java.util.EnumSet;

class TestEnum{

 public static void main(String args[])
 {
	 
	 for(Gf gf: Gf.values())
	 {
		 System.out.printf("%s\t%s\t%s\n",gf,gf.getDesc(),gf.getYear());
		 
	 }
	 System.out.println("Now, Printing enum using setRange() Method");
	 for(Gf gf: EnumSet.range(Gf.gf1,Gf.gf4))
	 {
		 System.out.printf("%s\t%s\t%s\n",gf,gf.getDesc(),gf.getYear());
	 }
 }

}