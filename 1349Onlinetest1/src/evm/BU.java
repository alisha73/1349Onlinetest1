package evm;


public class BU {
	int totCand;
	Candidate []candidate;
	ReadyLamp ready;
	Lamp candLamp;
	Button candButton;
	
	public BU(int totCand) {
		this.totCand=totCand;
		candidate=new Candidate[totCand];
		ready=new ReadyLamp();
		candLamp=new CandidateLamp();
		candButton=new CandidateButton();
		
	}

	
	
}
