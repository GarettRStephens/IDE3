public class EmployeeWithEmployeeHousing extends Employee
{
    //Variables
private int RoomID;
private double Rent;
private int FloorLevel;


     public EmployeeWithEmployeeHousing(int idNum, double sal, int floorLevel, int roomID, double rent){
         super(idNum, sal);
         this.RoomID = roomID;
         this.FloorLevel = floorLevel;
         this.Rent = rent;

     } // ends constructor

// these return the new variables with this constructor
    public int getRoomID() {
    return RoomID;

     }

    public double getRent(){
         return Rent;
    }

    public int getFloorLevel(){
         return FloorLevel;
    }


}
