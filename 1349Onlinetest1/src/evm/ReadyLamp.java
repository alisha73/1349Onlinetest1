package evm;

public class ReadyLamp extends Lamp{

	public ReadyLamp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeLampState() {
		if(Lamp==0){
			Lamp=1;
			
			System.out.println("Lamp is ready");
		}
		else
		{
			Lamp=0;
			System.out.println("Lamp is not ready");
		}
		
	} 

}
