package evm;

public abstract class Button {

int buttonState;
	public Button() {
		buttonState=0;
	}
	
	public abstract int buttonPressed();
	

}
