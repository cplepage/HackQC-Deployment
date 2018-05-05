package hackqc18.Acclimate;

import java.util.ArrayList;

public class Alertes {

    private ArrayList<Alerte> alertes;

    public Alertes(double nord, double sud, double est, double ouest) {
        
        alertes = AlertesFluxRss.theInstance().alertsInBox(nord, sud, est, ouest);
        
//        PointJSON point = new PointJSON(latitude + 2, longitude + 3);
//        PointJSON point2 = new PointJSON(latitude - 2, longitude - 3);
//        ArrayList<double[]> theArray = new ArrayList<double[]>();
//        theArray.add(new double[]{latitude + 4,longitude + 4});
//        theArray.add(new double[]{latitude + 4,longitude - 4});
//        theArray.add(new double[]{latitude - 4,longitude + 4});
//        theArray.add(new double[]{latitude - 4,longitude - 4});
//        PolygonJSON point3 = new PolygonJSON(theArray);

//        alertes.add(new Alerte("innondation", "le gouvernement", "Montréal",
//                "certain", "grave", "innondation", "1978-05-04", "00001", "urgent",
//                "on coule!", point.toString()));
//        alertes.add(new Alerte("innondation", "le gouvernement", "Montréal",
//                "certain", "grave", "innondation", "1978-05-04", "00001", "urgent",
//                "on coule!", point2.toString()));
//        alertes.add(new Alerte("innondation", "le gouvernement", "Montréal",
//                "certain", "grave", "innondation", "1978-05-04", "00001", "urgent",
//                "on coule!", point3.toString()));
    }

    public ArrayList<Alerte> getAlertes() {
        return alertes;
    }

    @Override
    public String toString() {
        String result = "{\n\"alertes\": [";

        for (int i = 0; i < alertes.size() - 1; i++) {
            result += alertes.get(i).toString() + ",";
        }
        result += alertes.get(alertes.size() - 1).toString();
        return result + "]\n}";
    }

}
