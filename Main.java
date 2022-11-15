import java.util.Scanner;
public class Main {
    public static void main(String[] args)
   {
        //makes the scanner that we will use to gather the users input
       Scanner userInput = new Scanner(System.in);
       System.out.println("Would you like to create a Regular Employee (1) Employee with territory (2) or " +
               " Employee using Employee Housing (3) ");
       int choice = userInput.nextInt();
       if (choice == 1){
           //lets us make choices for our user
           System.out.println("what ID number would you like to give the new Employee");
           int idNum = userInput.nextInt();// these parts will let you grab the input
           System.out.println("enter the new Employees Salary");
           double sal = userInput.nextDouble();
           Employee emp1 = new Employee(idNum, sal);// this calls the constructor with the data we get from the user
           System.out.println("Employee ID: " + emp1.getId() + " with a salary of $" + emp1.getSalary() + " has been " +
                   "created");

       }

       if (choice == 2){
           System.out.println("What ID number would you like to give to the new Employee with territory");
           int idNum = userInput.nextInt();
           System.out.println("Enter the new Employees Salary");
           double sal = userInput.nextDouble();
           System.out.println("What is this new Employees Territory Number Identifier");
           int ter = userInput.nextInt();
           EmployeeWithTerritory emp2 = new EmployeeWithTerritory(idNum, sal, ter);
           System.out.println("Employee ID: " + emp2.getId() + " with a salary of $" + emp2.getSalary() + " and a " +
                   "Territory Number of " + emp2.getTerritory() + " has been created");
       }

       if (choice == 3){
           System.out.println("What ID number would you like to give to the new Employee with Employee Housing");
           int idNum = userInput.nextInt();
           System.out.println("Enter the new Employees Salary");
           double sal = userInput.nextDouble();
           System.out.println("What floor will this Employee live on");
           int floorLevel = userInput.nextInt();
           System.out.println("Which room number will the Employee reside in");
           int roomId = userInput.nextInt();
           System.out.println("How much will the Employee pay for rent");
           double rent = userInput.nextDouble();
           EmployeeWithEmployeeHousing emp3 = new EmployeeWithEmployeeHousing(idNum, sal, floorLevel, roomId, rent);
           System.out.println("Employee ID: " + emp3.getId() + " with a salary of $" + emp3.getSalary() +
                   " Living on Floor " + emp3.getFloorLevel() + " Room number " + emp3.getRoomID() + " with a rent of "
           + emp3.getRent()) ;

       }


    }//ends method
}//ends class
