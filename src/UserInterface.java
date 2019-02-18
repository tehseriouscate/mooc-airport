import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private AirplaneList planes;
    private FlightList flights;

    public UserInterface(Scanner reader)  {
        this.reader = reader;
        this.planes = new AirplaneList();
        this.flights = new FlightList();
    }

    private String readInput()  {
        return  reader.nextLine().toLowerCase();
    }


    private static void printWelcomeMessage(String option) {
        if (option.equals("Airport panel")) {
            System.out.println("Airport panel");
            System.out.println("--------------------");
            System.out.println();
        }
        else if (option.equals("Flight service"))   {
            System.out.println("Flight service");
            System.out.println("------------");
            System.out.println();
        }
    }

    private static void printAvailCommands(String option)    {
        if (option.equals("Airport panel")) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
        }
        else if (option.equals("Flight service"))   {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
        }
    }

    private void handleAirportPanelCommand(String command)   {
        if (command.equals("1"))    {
            System.out.print("Give plane ID: ");
            String planeID = readInput().toUpperCase();
            System.out.print("Give plane capacity: ");
            int capacity = Integer.parseInt(readInput());
            planes.addAirplane(new Airplane(planeID, capacity));
        }
        else if (command.equals("2"))   {
            System.out.print("Give plane ID: ");
            String planeID = readInput();
            if (planes.planeExists(planeID)) {
                System.out.print("Give departure airport code: ");
                String departure = readInput().toUpperCase();
                System.out.print("Give destination airport code: ");
                String destination = readInput().toUpperCase();
                this.flights.addFlight(new Flight(planes.getPlane(planeID.toUpperCase()), departure, destination));
            }
            else
                System.out.println("Plane not found. Try again");
        }
    }

    private void handleFlightServiceCommand(String command) {
        if (command.equals("1"))    {
            System.out.println(planes);
        }
        else if (command.equals("2")) {
            System.out.println(flights);
        }
        else if (command.equals("3"))   {
            System.out.print("Give plane ID: ");
            String id = readInput();
            if (planes.planeExists(id)) {
                System.out.println(planes.getPlane(id));
            }
            else
                System.out.println("Plane not found.");
        }

    }



    public void startAirportPanel() {
        printWelcomeMessage("Airport panel");
        String command = "";
        while(!command.equals("x"))  {

            printAvailCommands("Airport panel");
            System.out.print("> ");
            command = readInput();

            if (command.equals("1")) {
                handleAirportPanelCommand("1");
            }
            else if (command.equals("2")){
                handleAirportPanelCommand("2");

            }

        }
    }

    public void startFlightService()    {
        printWelcomeMessage("Flight service");
        String command = "";
        while(!command.equals("x"))  {

            printAvailCommands("Flight service");
            System.out.print("> ");
            command = readInput();

            if (command.equals("1")) {
                handleFlightServiceCommand("1");
            }
            else if (command.equals("2")){
                handleFlightServiceCommand("2");
            }
            else if (command.equals("3"))   {
                handleFlightServiceCommand("3");
            }

        }

    }

    public void start() {
        startAirportPanel();
        startFlightService();

    }



}
