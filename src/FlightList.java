import java.util.ArrayList;

public class FlightList {

    private ArrayList<Flight> flights;


    public FlightList() {
        this.flights = new ArrayList<Flight>();
    }

    public void addFlight(Flight flight)    {
        flights.add(flight);
    }

    public String toString() {
        String result = "";

        for (Flight flight : flights) {
            result += flight + "\n";
        }

        return result;
    }

}
