import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		String para="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum\r\n"
				+ "\r\n"
				+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
          System.out.println(para);
          Scanner s=new Scanner(System.in);
          
          System.out.println("Enter the word to search");
        
          String key=s.nextLine();
          if(para.contains(key)) {
        	System.out.println(para.replaceAll(key,"#"));
        	  }
        	 
          }
          
          
          
          
          
          
          
	}


