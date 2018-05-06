package hackqc18.Acclimate;

import java.io.*;
import java.util.ArrayList;

public class StaticParser {

    String tmp = "";
    String[] champs = {};
    String[] constrAlerte = {};
    String donnee = "";
    
    private ArrayList<Alerte> alertes = new ArrayList<>();

    public StaticParser () {

        try {
            
            File fileDir = new File("src" +
                    File.separator + "main" +
                    File.separator + "java" +
                    File.separator + "hackqc18" +
                    File.separator + "Acclimate" +
                    File.separator + "historique_alertes.csv");

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream(fileDir), "UTF8"));
            
            String s;
            while ((s = reader.readLine()) != null) {
                if (s.contains("\r"))
                    s.replace("\r", ",");

                tmp += s;
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println("Erreur à l’ouverture du fichier");
        }
        parseFeed();
    }
    
    
    public void parseFeed(){      
        String [] alertePrg = tmp.split(",");
        
        String [] typesAlertes = {"Avalanche", "Feu de brousse", "Feu de forêt",  
                "Géomorphologique (ex. érosion)", "Glace", "Inondation", 
                "Inondation par ruissellement", "Mouvement de terrain", "Onde de tempête", 
                "Orage violent", "Ouragan", "Pluie", "Pluie verglaçante", 
                "Tempête hivernale", "Tornade", "Tremblement de terre", 
                "Vent de tempête"};
        
        String nom = "", territoire = "", certitude = "", severite = "", type = "";
        String dateDeMiseAJour = "", urgence = "", description = "", geom = "", IdAlert = "";
        String source = "Ministère de la Sécurité publique du Québec";
        double x = 0.0, y = 0.0;
        
        for (int i = 10; i < alertePrg.length; i++){
            int j = i % 10;
            
            switch(j){
                case 0: 
                    String [] temp = alertePrg[i].split("[a-z]+");
                    if (temp.length > 1){
                        dateDeMiseAJour = temp[1];
                    }
                    break;
                case 1:
                    break;
                case 2:
                    territoire = alertePrg[i];
                    break;
                case 3:
                    x = Double.parseDouble(alertePrg[i]);
                    break;
                case 4:
                    y = Double.parseDouble(alertePrg[i]);
                    break;
                case 5:
                    urgence = alertePrg[i];
                    break;
                case 6:
                    certitude = alertePrg[i];
                    break;
                case 7:
                    type = alertePrg[i];
                    break;
                case 8:
                    severite = alertePrg[i];
                    break;
                case 9:
                    for (int k = 0; k < typesAlertes.length; k++) {
                        if (type.equals(typesAlertes[k])) {
                            //System.out.println("type " + type);
                            Alerte tmp = new Alerte(nom, source, territoire, certitude,
                                    severite, type, dateDeMiseAJour, IdAlert, urgence, 
                                    description, geom, new CoordinatesJSON(x, y));
                            alertes.add(tmp);
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}