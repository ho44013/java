import java.text.SimpleDateFormat;
import java.util.*;

// An exploration of basic input and output.
class BasicIO {
	
    // Reads and processes string input.
    public static void main(String[] args) {
    	
    	SimpleDateFormat format2 = new SimpleDateFormat ("yyyy년 MM월 dd일 ");
		    			
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
	    System.out.printf(time2 + " 현재 "+ name + "(" + years + ")" + "의 키는 " + height +" cm 입니다.");
	    System.out.println("나이를 날짜 수로 변환하면 " + years*365);
	    
	} // method main
    
} // class BASIC_IO

