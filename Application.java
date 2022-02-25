import java.util.Scanner;

public class Application {
     public static void main(String[] args) {
    	 loginScreen();
     }
     
     static void loginScreen() {
    	 boolean reload=true;
    	 Scanner input=new Scanner(System.in);
    	 System.out.println("@@@@@@@@@@@@@Welcome to Login Page@@@@@@@@@@@@");
    	 System.out.println();
    	 System.out.print("Enter Login Name: ");
    	 String username=input.nextLine();
    	 System.out.print("Enter Login Password: ");
    	 String password=input.nextLine();
    	 System.out.println();
    	 if(username=="admin"||username.equals("admin")) {
    		 if(password=="password"||password.equals("password")) {
    			 mainDashboard();
    			 reload=false;
    		 }else {
    			 System.out.println("Username correct but Wrong Password \n");
    		 }
    		 
    	 }else {
    		 System.out.println("Wrong username");
    	 }
    	 while(reload) {
    	 System.out.print("Do you want to go to Login Screen (y/n) : ");
    	 String choice=input.next();
    	 if(choice=="y"||choice.equals("y")) {
    		 loginScreen();
    	 }else if(choice=="n"||choice.equals("n")){
    		 reload=false;
    		 System.out.println("Login Terminated");
    	 }else {
    		 reload=false;
    		 System.out.println("Wrong word");
    	 }
    	 }
    	 
    	 
     }
     
     static void mainDashboard() {
    	 boolean reload=true;
    	 Scanner get=new Scanner(System.in);
    	 System.out.println("@@@@@@@@@@@ Welcome to Main Dashboard");
    	 System.out.println();
    	 System.out.println("1.Student Dashboard");
    	 System.out.println("2.Quit");
    	 System.out.println();
    	 System.out.print("Choose your choice: ");
    	 int choice=get.nextInt();
    	 
    	 switch(choice) {
    	 case 1:
    		 studentDashboard();
    		 reload=false;
    		 break;
    	 case 2:
    		 System.out.println("Quit Main Dashboard");

    		 break;
    	default:
    		
       	    Scanner input=new Scanner(System.in);
    		while(reload) {
    		System.out.print("Do you want to continue with Long in screen (y/n): ");
    		String select=input.nextLine();
    		
    		if(select=="y"||select.equals("y")) {
       		 loginScreen();
       	 }else if(select=="n"||select.equals("n")){

       		 System.out.println("Main Dashboard Terminated");
       		reload=false;
       	 }else {
       		 
       		 System.out.println("Wrong word");
       		reload=false;
       	 }
    			 
    	 }
       }
    	 
    	 
     }
     static void studentDashboard() {
    	    Scanner input=new Scanner(System.in);
    	 	System.out.println("@@@@@@@@@@ Welcome to Studen tDash Board");
    	 	System.out.println();
    	 	System.out.println("Chosse the option");
    	 	System.out.println("1.Create Student ");
    	 	System.out.println("2.Read all Student Data");
    	 	System.out.println("3.Read Individual Student Data");
    	 	System.out.println("4.Update Student Data");
    	 	System.out.println("5.Delete Student Data");
    	 	System.out.println("6.Quit");
    	 	System.out.println();
    	 	System.out.print("Choose option given above: ");
    	 	int choise=input.nextInt();
    	 	
    	 	switch(choise) {
    	 	case 1:
    	 		createStudent();
    	 		break;
    	 	case 2:
    	 		readAllStudentData();
    	 		break;
    	 	case 3:
    	 		readIndividualStudentData();
    	 		break;
    	 	case 4:
    	 		updateStudentData();
    	 		break;
    	 	case 5:
    	 		deleteStudentData();
    	 		break;
    	 	case 6:
    	 		quit();
    	 		break;
    	 	default:
    	 		System.out.println("We are out of service");
    	 		break;
    	 	}
    	 	
     }
     static void createStudent() {
    	 
    	 System.out.println("This is create student");
     }
     static void readAllStudentData() {
    	 
    	 System.out.println("This is create read all data");
     }
     static void readIndividualStudentData() {
    	 
    	 System.out.println("This is create read individual student data");
     }
     static void updateStudentData() {
	 
    	 System.out.println("This is create update student data");
     }
      static void deleteStudentData() {
	 
    	  System.out.println("This is create delete student data");
     }
      static void quit() {
	 
    	  System.out.println("This is create Quit");
  }
     
}
