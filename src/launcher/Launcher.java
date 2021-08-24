package launcher;

import entities.Student;
import gui.SimplePresentationScreen;
import logic.SetAgent;
public class Launcher {
	
	public static void main(String [] args) {

		
		//Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
		
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	SetAgent setter;
            	Student studentData = null;
            	
            	setter = new SetAgent();
            	studentData = setter.SetAll(studentData);
				SimplePresentationScreen PScreen = new SimplePresentationScreen(studentData);
				PScreen.setVisible(true);
            }
        });
    }
}