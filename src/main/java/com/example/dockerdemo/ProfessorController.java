package com.example.dockerdemo;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    private ProfessorenverwaltungStorage professoren = ProfessorenverwaltungStorage.getInstance();

    @GetMapping
    public Collection<Professor> get() {
        return professoren.values();
    }

    @GetMapping(path = "/{id}")
    public Professor get(@PathVariable String id) {
        return professoren.get(id);
    }

    @PostMapping()
    public Professor post(@RequestBody Professor professor) {
        professoren.put(professor.kuerzel, professor);
        return professor;
    }

    @PutMapping(path = "/{id}")
    public Professor put(@PathVariable String id,
                         @RequestBody Professor professor) {
        Professor prof = professoren.get(id);
        if (prof != null) {
            prof.vorname = professor.vorname;
            prof.nachname = professor.nachname;
            prof.kuerzel = professor.kuerzel;
            return prof;
        } else {
            this.professoren.put(id, professor);
            return professor;
        }
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable String id) {
        professoren.remove(id);
    }
}
