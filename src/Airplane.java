public class Airplane {

    private String id;
    private int capacity;

    public Airplane(String id, int capacity)    {
        this.id=cleanString(id);
        this.capacity=capacity;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString()    {
        return this.id + " (" + this.capacity + " ppl)";
    }

    private static String cleanString(String s) {
        return s.trim().toUpperCase();
    }
}
