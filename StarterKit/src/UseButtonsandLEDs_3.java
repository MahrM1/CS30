
import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class UseButtonsandLEDs_3 {
	    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
	    public static void main(String[] args) throws Exception{

	        //Create | Create objects for your buttons and LEDs.
	        DigitalInput redButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput greenLED = new DigitalOutput();

	        //Address | Address your four objects which lets your program know where to find them.
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	        //Open | Connect your program to your physical devices.
	        redButton.open(1000);
	        redLED.open(1000);
	        greenButton.open(1000);
	        greenLED.open(1000);

	        
	        boolean redButtonState = false;
	        boolean greenButtonState = false;
	        int count= 0 ;
	        //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
	        while(true){
	        	
	            if( redButton.getState() && !redButtonState){
	                // turn on the redLED
	            	redLED.setState(true);
	            	count++;
	            	//output to the screem count
	            	System.out.println(count);
	            } else if( redButton.getState() && !redButtonState){ 
	                //turn off the redLED
	            	redLED.setState(false);
	            }

	            if(greenButton.getState()&& !greenButtonState){
	                greenLED.setState(true);
	            	count++;
	                System.out.println(count);
	            } else if(greenButton.getState()&& !greenButtonState) {
	            	greenLED.setState(false);
	            }
	            redButtonState = redButton.getState();
	            greenButtonState = greenButton.getState();
	            Thread.sleep(150);
	        }
	    }
	}
