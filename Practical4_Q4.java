/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical4_q4;

import java.util.Scanner;

/**
 *
 * @author mengf
 */
public class Practical4_Q4 {

    public static void main(String[] args) {
        //todo:: By using array, create 3 CarType objects
        CarType []type = {new CarType("Toyota", "Vios", 1.5),
                          new CarType("Nissan", "Teana", 2.0),
                          new CarType("Honda", "City", 1.6)
        };
        
  	//todo:: create an array that will able to store 6 registrations
        Registration[] registration = new Registration[2];
         
        
  	Scanner scanner = new Scanner(System.in);
  	
  	for (int i = 0; i < registration.length; ++i){

  		System.out.println("\nRegistration number: " + Registration.getCount() );
  		
                //todo:: request and read the owner detail
                System.out.print("Enter the owner name :");
                String name = scanner.nextLine();
                System.out.print("Enter the IC Number : ");
                String ic_Number = scanner.nextLine();
                
                              
                //construct owner object
                Owner own = new Owner(name, ic_Number);
                
  		//todo:: request and read car detail
                System.out.print("Enter the1 plate No : ");
                String plateNo = scanner.nextLine();
                System.out.print("Enter the color : ");
                String color = scanner.nextLine(); 
                System.out.print("Enter the year : ");
                int year = scanner.nextInt();
                
                
  		System.out.println("\nCar Types: ");
  		//todo:: display all available carType
               for(int j = 0; j < type.length; ++j){
                System.out.printf("%d %s\n",j+1, type[j].toString());
               }
                System.out.print("\nSelect car type [1.." + type.length + "]: ");
  		int selection = scanner.nextInt();
//  		 //todo:: get cartype from array (based on selection)
                Car car = new Car(plateNo, color, year, type[selection-1] );
              
                //todo:: register the car
             registration[i] = new Registration(own,car);
  
                
                         
  		scanner.nextLine();
            }
                
  		displayListing(registration);
               
  	}
  
  	//todo:: display all registration detail
        

  
  public static void displayListing(Registration[] regArr) {
  	System.out.printf("\n\n%50s\n", "Car Registration Listing");
  	System.out.printf("%-6s %-12s %-12s %-10s %-8s %-6s %-10s %-10s %5s\n", 
  		"Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
  	for (int i = 0; i < regArr.length; ++i) 
  		System.out.println(regArr[i]);
  }
    
}
