package evm;

public class ControlUnit {
	Button totalButton;
	Button ballotButton;
	public Lamp onLamp;
public Lamp readyLamp;
	
	
	public ControlUnit() {
		this.totalButton=new TotalButton();
		this.ballotButton=new BallotButton();
		this.onLamp=new On();
		this.readyLamp=new ReadyLamp();
	}

}
