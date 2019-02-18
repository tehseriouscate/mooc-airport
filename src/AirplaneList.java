import java.util.HashMap;

public class AirplaneList {

    private HashMap<String, Airplane> airplaneList;


    public AirplaneList()   {
        this.airplaneList = new HashMap<String, Airplane>();
    }


    public void addAirplane(Airplane plane)   {
        String id = plane.getId();
        if (airplaneList.containsKey(id))   {
            System.out.println("This plane already exists.");
        }
        airplaneList.put(id, plane);

    }

    public Airplane getPlane (String id)   {
        id = cleanString(id);
        Airplane plane;

        for (String key : airplaneList.keySet())    {
            if (key.equals(id)) {
                plane = airplaneList.get(key);
                return plane;
            }
        }

        return null;
    }

    public boolean planeExists(String plane)  {
        if (this.airplaneList.containsKey(cleanString(plane))) {
            return true;
        }
        return false;
    }

    public String toString()    {
        String output = "";

        for (String key : airplaneList.keySet())    {
            output+= airplaneList.get(key)+"\n";
        }

        return output;
    }


    private static String cleanString(String s) {
        return s.trim().toUpperCase();
    }


}
