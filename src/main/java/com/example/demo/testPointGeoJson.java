package com.example.demo;

public class testPointGeoJson {

    private final String type;
    private final float[] coordinates = new float[2];

    public testPointGeoJson(){
        this.type = "Point";
        this.coordinates[0] = -71.49859980203153f;
        this.coordinates[1] = 48.67906237862251f;

    }

    public String getType() {
        return type;
    }

    public float[] getCoordinates() {
        return coordinates;
    }


}
