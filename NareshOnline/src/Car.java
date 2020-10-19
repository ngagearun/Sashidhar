
public class Car {
	
	//instance variable
	String colorname,modelno;
	int speed,enginecapacity;
	
	void displayHyndaicardetails(){
		colorname="RED";
		modelno="HYD1234";
		speed=100;
		enginecapacity=1400;
	}
	
	void displayNxuscaardetails(){
		
		colorname="BLUE";
		modelno="NXUS1234";
		speed=120;
		enginecapacity=1500;
		System.out.println(colorname);
		System.out.println(modelno);
		System.out.println(speed);
		System.out.println(enginecapacity);
	}
	
	
	void displayBMWcardetails(){
		colorname="WHITE";
		modelno="BMW1234";
		speed=150;
		enginecapacity=1800;
	}

	public static void main(String[] args) {
		Car nexus=new Car();
		nexus.displayNxuscaardetails();

	}

}
