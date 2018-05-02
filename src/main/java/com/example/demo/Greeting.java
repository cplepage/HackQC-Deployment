package com.example.demo;

public class Greeting {

    private final long id;
    private final String content;
    private final int annee;

    public Greeting(long id, String content, int annee) {
        this.id = id;
        this.content = content;
        this.annee = annee * 2;
    }

    public int getAnnee() {
        return annee;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
