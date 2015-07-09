package evm;

public class CandidateLamp extends Lamp{

	public CandidateLamp() {
	// TODO Auto-generated constructor stub
	}

	@Override
	public void changeLampState() {
		if(Lamp==0){
			Lamp=1;
			
			System.out.println("Candidate vote is cast");
		}
		else
		{
			Lamp=0;
			System.out.println("Candidate vote is not cast");
		}
	}

}
