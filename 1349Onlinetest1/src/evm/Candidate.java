package evm;

public class Candidate {
int candidateID;
Vote vote;




	public Candidate(int candidateID) {
		this.candidateID=candidateID; 
		this.vote=new Vote();
	}

}
