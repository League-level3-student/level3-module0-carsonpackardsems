package _00_Intro_To_Arrays;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _03_FindTheHiddenButton implements ActionListener{
    JFrame window;
    JPanel panel;
    Random random = new Random();
    // 1. create an array of JButtons. Don't initialize it yet.
JButton[] buttonList;
int buttonCount;
    // 2. create an integer variable called hiddenButton
int hiddenButton;
    public static void main(String[] args) {
        new _03_FindTheHiddenButton().start();
    }

    public void start() {
        window = new JFrame("Find the Button");
        panel = new JPanel();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Ask the user to enter a positive number and convert it to an int
String buttonConversionString = JOptionPane.showInputDialog("Please insert a positive number to convert into buttons.");
        // 4. Initialize the array of JButtons to be the size of the int
        //    created in step 3
int buttonCount = Integer.parseInt(buttonConversionString);
buttonList = new JButton[buttonCount];
        // 5. Make a for loop to iterate through the JButton array
        for(int i = 0; i < buttonList.length; i++) {
        	buttonList[i] = new JButton();
        	buttonList[i].addActionListener(this);
        	panel.add(buttonList[i]);
        }
        window.add(panel);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.setVisible(true);
        
        JOptionPane.showMessageDialog(null, "Hello, andwelcome to Find the Hidden Button! Today we will test your  perceptivness in this tough game of mental strength. I will show a message on a button for only a moment. You have to find out what button said a message. Good luck!");
            // 6. initialize each JButton in the array
        
            // 7. add the ActionListener to each JButton
        
            // 8. add each JButton to the panel

        // 9 add the panel to the window

        // 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.

        // 11. set the JFrame to visible.

        // 12. Give the user the instructions for the game.
     
hiddenButton = random.nextInt(buttonCount);
        // 13. initialize the hiddenButton variable to a random number less than
        //     the int created in step 3
buttonList[hiddenButton].setText("Click");
        // 14. Set the text of the JButton located at hiddenButton to read "ME"
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        // 15. Use Thread.sleep(100); to pause the program.
buttonList[hiddenButton].setText("");
        // 16. Set the text of the JButton located at hiddenButton to be blank.

    }
    void resetAllButtons() {    	
    	try {
    		Thread.sleep(500);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
        // 13. initialize the hiddenButton variable to a random number less than
        //     the int created in step 3
buttonList[hiddenButton].setText("Click");
        // 14. Set the text of the JButton located at hiddenButton to read "ME"
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        // 15. Use Thread.sleep(100); to pause the program.
buttonList[hiddenButton].setText("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton)e.getSource();

        // 17. if the hiddenButton is clicked, tell the user that they win.
if(buttonClicked == buttonList[hiddenButton]) {
	JOptionPane.showMessageDialog(null, "You clicked the right button! Reseting course...");
	hiddenButton = random.nextInt(buttonCount);
	resetAllButtons();
}
else {
	JOptionPane.showMessageDialog(null, "Sorry, wrong button. Reseting course...");
	hiddenButton = random.nextInt(buttonCount);
	resetAllButtons();
}
        // 18. else tell them to try again
    }
}
