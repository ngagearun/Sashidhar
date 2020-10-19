
 class HelloWorld {
	 //Instance
	 String cname="Polarris";
	 //static 
	 static String employename="arun";
	 void m1(){
		
		 System.out.println(cname);
		 System.out.println(employename);
		 
	 }
	 
	 static void m2(){
		 
		 
		System.out.println(HelloWorld.employename);
	 }
	 

	 public static void main(String[] args){
		 //Local
		 int mobno=321,accno=1001;
		 String name="arun";
		
		 System.out.println("Mobile number is:"+mobno+"  Acc No is:"+accno+"   Name of person is"+name);
		 HelloWorld objname=new HelloWorld();//object cration
		 System.out.println(employename);
		 objname.cname="Infosus";
		 System.out.println(objname.cname);
		 m2();
		 
	 }
	 
}
 
 

