package hackqc18.Acclimate;

public class Alerte {

    private final String nom;
    private final String source;
    private final String territoire;
    private final String certitude;
    private final String severite;
    private final String type;
    private final String dateDeMiseAJour;
    private final String idAlerte;
    private final String urgence;
    private final String description;
    private final String geom;

    public Alerte(String nom, String source, String territoire,
            String certitude, String severite, String type,
            String dateDeMiseAJour, String idAlerte, String urgence,
            String description, String geom) {
        this.nom = nom;
        this.source = source;
        this.territoire = territoire;
        this.certitude = certitude;
        this.severite = severite;
        this.type = type;
        this.dateDeMiseAJour = dateDeMiseAJour;
        this.idAlerte = idAlerte;
        this.urgence = urgence;
        this.description = description;
        this.geom = geom;

    }

    public String getNom() {
        return nom;
    }

    public String getSource() {
        return source;
    }

    public String getTerritoire() {
        return territoire;
    }

    public String getCertitude() {
        return certitude;
    }

    public String getSeverite() {
        return severite;
    }

    public String getType() {
        return type;
    }

    public String getDateDeMiseAJour() {
        return dateDeMiseAJour;
    }

    public String getIdAlerte() {
        return idAlerte;
    }

    public String getUrgence() {
        return urgence;
    }

    public String getDescription() {
        return description;
    }

    public String getGeom() {
        return geom;
    }

    @Override
    public String toString() {
        return "{\"alerte\" : {\n"
                + "\"nom\": \"" + nom + "\",\n"
                + "\"source\": \"" + source + "\",\n"
                + "\"territoire\": \"" + territoire + "\",\n"
                + "\"certitude\": \"" + certitude + "\",\n"
                + "\"severite\": \"" + severite + "\",\n"
                + "\"type\": \"" + type + "\",\n"
                + "\"dateDeMiseAJour\": \"" + dateDeMiseAJour + "\",\n"
                + "\"urgence\": \"" + urgence + "\",\n"
                + "\"description\": \"" + description + "\",\n"
                + "\"geometry\": " + geom
                + "\n}\n}";

    }
}
