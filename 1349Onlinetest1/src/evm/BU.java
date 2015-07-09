package evm;


public class BU {
	int totCand;
	Candidate []candidate;
	ReadyLamp ready;
	CandidateLamp candLamp;
	CandidateButton candButton;
	
	public BU(int totCand) {
		this.totCand=totCand;
	//	candidate=new candidate[totCand];
		ready=new ReadyLamp();
		candLamp=new CandidateLamp();
		candButton=new CandidateButton();
		
	}

	
	
}
