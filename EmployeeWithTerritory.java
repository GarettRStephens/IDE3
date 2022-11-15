public class EmployeeWithTerritory extends Employee // causes this class to inherit the idnum and sal
{
   //Variables
   private int territory;

   //constructor
   public EmployeeWithTerritory(int idNum, double sal, int terr) {
      super(idNum, sal);
      this.territory = terr;
   }//ends constructor

   // returns the territory
   public int getTerritory() {
      return territory;
   }
}
