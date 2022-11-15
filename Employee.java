public class Employee
{
   //Variables
   private int id;
   private double salary;
//makes the parent employee
   public Employee( int idNum, double sal){
      this.id = idNum;
      this.salary = sal;


   }

//returns what is created int the constructor
   public int getId()
   {
      return id;
   }
   public double getSalary()
   {
      return salary;
   }
//   public void setId(int idNum)
//   {
//      id = idNum;
//   }
//   public void setSalary(double sal)
//   {
//      salary = sal;
//   }
}

