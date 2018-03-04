import java.util.Random;

import org.omg.Messaging.SyncScopeHelper;

public class Methods {

String whichPresent(String friendname) {
	//something
	if(friendname.equalsIgnoreCase("Ryan")) {
		return "Money";
	}
	else if(friendname.equalsIgnoreCase("Bill")) {
		return "Video Games";
}
	else {
		return "Who is that lol";
	}
}

public class Lion{
	boolean canEat(String foodName) {
		if(foodName.equals("Other Lions")) {
			return true;
		}
		else if(foodName.equals("Fruit")) {
			return false;
		}
		else if(foodName.equals("Literally Anything But Fruit")) {
			return true;
		}
		else {
			return true;
		}
		
	
	}
}



int getMyLuckyNumber() {
	Random r = new Random();
	int R2 = r.nextInt(19);
	return R2;
}



int eggsMomWants() {
	int ME = 3;
	return ME;
}
int eggsDadWants() {
	int DE = 5;
	return DE;
}
int eggsBabyWants() {
	int BE = 1;
	return BE;
}
int eggsFamilyWants() {
	
	return eggsMomWants() + eggsDadWants() + eggsBabyWants();
	 
}
















}

