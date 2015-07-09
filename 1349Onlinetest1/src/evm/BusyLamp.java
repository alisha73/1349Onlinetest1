package evm;

public class BusyLamp extends Lamp{

	public BusyLamp() {
		 // TODO Auto-generated constructor stub
	}

	@Override
	public void changeLampState() {
		if(Lamp==0){
			Lamp=1;
			
			System.out.println("Lamp is not busy");
		}
		else
		{
			Lamp=0;
			System.out.println("Lamp is busy");
		}
		
	}

}
