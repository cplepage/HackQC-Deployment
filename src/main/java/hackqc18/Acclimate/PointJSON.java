package hackqc18.Acclimate;

public class PointJSON {
    private final CoordinatesJSON coordinates;
    
    public PointJSON(double x, double y) {
        coordinates = new CoordinatesJSON(x, y);
    }
    
    
    @Override
    public String toString() {
        return "{\n\"type\": \"Point\",\n" 
                + coordinates.toString() + "}";
    }
}
