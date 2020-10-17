package be.intecbrussel.p29opdracht1;

import javax.persistence.*;

@Entity
public class Visitor {

    @Id
    private int id;
    private String name;

    public Visitor() {

    }

    public Visitor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
