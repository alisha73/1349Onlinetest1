package evm;

public class CandidateButton extends Button {

	public CandidateButton() {
		
	}

	@Override
	public int buttonPressed() {
		if(buttonState==0){
			buttonState=1;
			
			System.out.println("Candidate Button pressed");
		}
		else
		{
			buttonState=0;
			System.out.println("Candidate button not pressed");
		}
		return buttonState;
	}

}
