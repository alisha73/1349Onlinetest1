package evm;

public class CloseButton extends Button{

	public CloseButton() {
		
			}

	@Override
	public int buttonPressed() {
		if(buttonState==0){
				return 0;
		}
		else
			{
			return 1;
			}

	}

}
