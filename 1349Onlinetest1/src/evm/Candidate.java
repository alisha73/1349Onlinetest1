package evm;

public class Candidate {
int candidateID;
Vote vote;
	public int getCandidateID() {
	return candidateID;
}

public void setCandidateID(int candidateID) {
	this.candidateID = candidateID;
}

	public Candidate(int candidateID) {
		this.candidateID=candidateID; 
		this.vote=new Vote();
	}

}
