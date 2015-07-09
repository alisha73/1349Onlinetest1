package evm;

public class ControlUnit {
	Button totalButton;
	Button ballotButton;
	On onLamp;
	ReadyLamp readyLamp;
	
	
	public ControlUnit(Button totalButton,Button ballotButton) {
		this.totalButton=totalButton;
		this.ballotButton=ballotButton;
		this.onLamp=new On();
		this.readyLamp=new ReadyLamp();
	}

}
