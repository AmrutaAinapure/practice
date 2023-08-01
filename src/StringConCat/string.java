package StringConCat;

public class string {
	
	
	public static void main (String [] args) {
		
		
		
		String str1= "Amruta"+"Dheeraj"+"Vihan";
	
	
		System.out.println(str1.replace('a', 'r'));
		
		
		
		
		String  s1 = "velocity";
		
		System.out.println("indexof ---->"+s1.charAt(5));
		System.out.println("index of---->"+s1.charAt(3));
		
		
		
		
		
		String s2="velocity";
		String s3= "velocity";
		String s4= new String ("velocity");
		
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		
		String s5="Automation";
		System.out.println(s5.replace('o', 'k'));
	 String s6= "Velocity class";
	 System.out.println(s6.substring(4,8));
	 System.out.println(s6.substring(3,6));
	 
	 
	 String S6= "ruby phython ruby";
	 System.out.println("Index----R>"+S6.indexOf('r'));
		System.out.println("index of---->"+S6.indexOf('r',S6.indexOf('r')+1));
		
		String s7="amruta";
		System.out.println(s7.toUpperCase());
		
		
		//split
		
		String s8="Hello/world/velocity";
		String s9[] =s8.split("/");
	int i;
	for(i=0;i<s9.length;i++)
		System.out.println(s9[i]);
	
	
	String s10="Amu_vihu_saiee";
	String s11[]=s10.split("_");
	int j;
	for( j= 0;j<s11.length;j++);
	
		System.out.println(s11[j]);
		
	}
	
	
	
	

}
