import javax.swing.*;
import java.awt.*;

// SecondHandSecondHandVehicleFrame IS-A JFrame ==> Inheritance
public class SecondHandVehicleFrame extends JFrame{
	// Instance Variable to keep track of currentVehicle
	private SecondHandVehicle currentVehicle;

	// Declare GUI Components here
	private JLabel jlblOne, jlblTwo, jlblThree;
		
	// Constructor - SetLayout & Add Components here...
	// Constructor takes in the selected second hand vehicle and assigns it to currentVehicle
	public SecondHandVehicleFrame(SecondHandVehicle vehicleIn){
		// Set up currentVehicle
		currentVehicle=vehicleIn;

		// Construct Components and
		jlblOne = new JLabel(currentVehicle.toString(), JLabel.CENTER);
		jlblTwo = new JLabel("You must create a GUI to work with this VEHICLE here", JLabel.CENTER);
		jlblThree = new JLabel("You need to add options to decreaseValue(), calculateTaxPayable(), and qualifyForScrappage() for " + currentVehicle.getMake() + " " + currentVehicle.getModel(), JLabel.CENTER);		

		// ...add them to the JFrame
		add(jlblOne,BorderLayout.NORTH);
		add(jlblTwo,BorderLayout.CENTER);
		add(jlblThree,BorderLayout.SOUTH);		
	}
}