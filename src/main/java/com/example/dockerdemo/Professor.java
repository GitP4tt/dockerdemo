package com.example.dockerdemo;

public class Professor {
    public String vorname;
    public String nachname;
    public String kuerzel;

    public Professor() {
    }

    public Professor(String vorname, String nachname, String kuerzel) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.kuerzel = kuerzel;
    }

    public String toString() {
        return vorname + " " + nachname + " (" + kuerzel + ")";
    }
}