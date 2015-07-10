package evm;

public class BallotButton extends Button {

	public BallotButton() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int buttonPressed() {
		if(buttonState==0){
			buttonState=1;
			System.out.println("Ballot Button pressed");
	}
	else
		{
		buttonState=0;
		System.out.println("Ballot Button pressed");
		}
		return buttonState;


	}

}
