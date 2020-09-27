import java.text.SimpleDateFormat;
import java.util.*;

// An exploration of basic input and output.
class BasicIO {
	
    // Reads and processes string input.
    public static void main(String[] args) {
    	
    	SimpleDateFormat format2 = new SimpleDateFormat ("yyyy�� MM�� dd�� ");
		    			
    	Scanner stdin = new Scanner(System.in);
    	
        // get first input
        System.out.print("Enter your name: ");
	    String name = stdin.nextLine();
	    
	    // get second input
	    System.out.print("Enter your age: ");
	    int years = stdin.nextInt();
	    
	    // get third input
	    System.out.print("Enter your height: ");
	    int height = stdin.nextInt();
	    
    	Date time = new Date();

    	String time2 = format2.format(time);
    	
	    // display output on console
	    System.out.printf(time2 + " ���� "+ name + "(" + years + ")" + "�� Ű�� " + height +" cm �Դϴ�.");
	    System.out.println("���̸� ��¥ ���� ��ȯ�ϸ� " + years*365);
	    
	} // method main
    
} // class BASIC_IO

