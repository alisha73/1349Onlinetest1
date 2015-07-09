package evm;

public class On  extends Lamp{

	public On() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeLampState() {
		if(Lamp==0){
			Lamp=1;
			
			System.out.println("Lamp is on");
		}
		else
		{
			Lamp=0;
			System.out.println("Lamp is off");
		}
		
	}

}
