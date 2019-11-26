/*
 * ParkingDB: declare array and initialise it with 5 elements.
 * Populate array with random numbers.
 */
import java.util.ArrayList;

public class ParkingDB {

    private ArrayList<String> plateDatabase = new ArrayList<>();

    public ParkingDB() {

        plateDatabase.add("46252");
        plateDatabase.add("36527");
        plateDatabase.add("87674");
        plateDatabase.add("34563");
        plateDatabase.add("65379");

    }

    public boolean checkDB(String regNum) {
        for(String item : plateDatabase) {
            if(item.contains(regNum)) {
                return true;
            }
        }
        return false;
    }
}
