package evm;

import java.util.*;

public class EVM {

	BU ballotUnit;
	ControlUnit controlUnit;
	int totCandid;
	
	public EVM(int totCandid) {
	    TotCandidate(totCandid);
		this.totCandid=totCandid;
		ballotUnit=new BU(totCandid);
		controlUnit=new ControlUnit();
	}
	
	public void CUOn(int input){
		if(input==0){
      controlUnit.onLamp.changeLampState();
      if(controlUnit.onLamp.Lamp==0){
    	  controlUnit.ballotButton.buttonPressed();    	  
    	  
      }
      
			
		}
		
	}
	
	public void TotCandidate(int totCandid){
		
		for(int i=1;i<totCandid-1;i++)
		{
			
		}	
		
	}
	

}
