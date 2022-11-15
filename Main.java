import java.util.Scanner;
public class Main {
    public static void main(String[] args)
   {
//        Employee emp1 = new Employee();
//        EmployeeWithTerritory emp2 = new EmployeeWithTerritory();
//
//
//        System.out.println("This is employee " + emp1.getId() + " and he makes $" + emp1.getSalary() );
//
//        System.out.println("employee" + emp2.getId() + " makes " + emp2.getSalary() + " and has the "
//                + emp2.getTerritory() + "territory");

//Employee emp1 = new Employee(1, 2.99);
//System.out.println(emp1.getId() + "   " + emp1.getSalary());
//
//EmployeeWithTerritory emp2 = new EmployeeWithTerritory(1 , 29.0, 5);
//System.out.println(emp2.getId() + " " +emp2.getSalary() + "  " + emp2.getTerritory());
//
//EmployeeWithEmployeeHousing emp3 = new EmployeeWithEmployeeHousing(1, 23, 1, 1, 345.99);
//System.out.println(emp3.getId() + " " + emp3.getSalary() + " " + emp3.getRoomID() + " " + emp3.getFloorLevel() + "  " +emp3.getRent());


       Scanner userInput = new Scanner(System.in);
       System.out.println("Would you like to create a Regular Employee (1) Employee with territory (2) or " +
               " Employee using Employee Housing (3) ");
       int choice = userInput.nextInt();
       if (choice == 1){
           System.out.println("what ID number would you like to give the new Employee");
           int idNum = userInput.nextInt();
           System.out.println("enter the new Employees Salary");
           double sal = userInput.nextDouble();
           Employee emp1 = new Employee(idNum, sal);
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
           System.out.println("What ID number would you like to give to the new Employee with territory");
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
           System.out.println("Employee ID: " + emp3.getId() + " ");

       }


    }//ends method
}//ends class
