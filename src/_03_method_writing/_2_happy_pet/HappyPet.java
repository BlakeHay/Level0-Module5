package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
static int happinessLevel = 0;
public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What pet do you want?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
while(true){		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
int task = JOptionPane.showOptionDialog(null, "What would you like to do for the pet", null, 0, JOptionPane.INFORMATION_MESSAGE, null,
new String[] { "Cuddle", "Walk", "Feed" }, null);
happy(pet, task);
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel>8){
				JOptionPane.showMessageDialog(null, "You love your pet.");
				break;
			}
}
}
public static void happy (String pet, int task){
if(task == 0){
JOptionPane.showMessageDialog(null, "The " + pet + " is purring.");
happinessLevel += 4;
}
if(task == 1){
JOptionPane.showMessageDialog(null,"The " + pet + " is tired.");
happinessLevel += 2;
}
if(task == 2){
JOptionPane.showMessageDialog(null, "The " + pet + " is full.");
happinessLevel += 3;
}
}
	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

}