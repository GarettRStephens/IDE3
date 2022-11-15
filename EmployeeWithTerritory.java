public class EmployeeWithTerritory extends Employee
{
   private int territory;
   public EmployeeWithTerritory( int idNum, double sal, int terr){
      super(idNum, sal);
      this.territory = terr;
   }
   public int getTerritory()
   {
      return territory;
   }
//   public void setTerritory(int terr)
//   {
//      territory = terr;
//   }
}
