package com.example.dockerdemo;

import java.util.concurrent.ConcurrentHashMap;

public class ProfessorenverwaltungStorage
        extends ConcurrentHashMap<String, Professor> {
    private static ProfessorenverwaltungStorage instance = null; // Singleton

    private ProfessorenverwaltungStorage() {
        this.put("GRM", new Professor("Gröschel", "Michael", "GRM"));
        this.put("GRT", new Professor("Rainer", "Gerten", "GRT"));
        this.put("SPE", new Professor("Thomas", "Specht", "SPE"));
        this.put("SMI", new Professor("Thomas", "Smits", "SMI"));
    }

    public static ProfessorenverwaltungStorage getInstance() {
        if (instance == null) {
            instance = new ProfessorenverwaltungStorage();
        }
        return instance;
    }
}