public class Flight {

    private Airplane airplane;
    private String departure;
    private String destination;

    public Flight(Airplane airplane, String departure, String destination) {
        this.airplane = airplane;
        this.departure=cleanString(departure);
        this.destination=cleanString(destination);
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String toString()    {
        return this.airplane + " (" + this.departure + "-" + this.destination + ")";
    }

    private static String cleanString(String s) {
        return s.trim().toUpperCase();
    }
}
