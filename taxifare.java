package basicIfElse;

import java.util.Scanner;

public class taxiFare {
	static int km;
	public  void checkfare() {

		if(km<=2) {
			System.out.println("the fare is 25rs for "+ km +" kms");
		}
		else if(km<=7 ||km>2) {
			System.out.println(25+(km-2)*20+" rs for "+km+"kms");
		}
		else if(km<=12 || km>7) {
			System.out.println(125+(km-7)*25+"rs for "+km+"kms");
		}
		else if(km>12) {
			System.out.println(225+(km-12)*35+"rs for "+km+"kms");
		}
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
    	System.out.println("plz enter your journey distance  in km");
    	km=s.nextInt();
    	taxiFare tf=new taxiFare();
    	tf.checkfare();	
	}
}

