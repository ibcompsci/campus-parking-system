/*
 * BarrierProcess: receive registration and check with database.
 */
public class BarrierProcess {

    private ParkingDB db;

    public BarrierProcess(ParkingDB database) {
        db = database;
    }

    public void scanPlate(String regNum) {

        System.out.println("\nYour registration is " + regNum);
        System.out.println("\nChecking database...");

        boolean check = db.checkDB(regNum);
        if (check) {
            System.out.println("Match found. Barrier opening.");
        } else {
            System.out.println("No match found. Contact the transport office.");
        }
    }
}
