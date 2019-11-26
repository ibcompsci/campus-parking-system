/*
 * CampusParkingSetup: initialise the program
 */
public class CampusParkingSetup {

    public static void main(String[] args) {

        // Create new objects
        ParkingDB db = new ParkingDB();
        BarrierProcess bp = new BarrierProcess(db);

        // Call scanPlate method in ParkingDB
        bp.scanPlate("87674");
    }
}

