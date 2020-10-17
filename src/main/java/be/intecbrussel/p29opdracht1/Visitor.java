package be.intecbrussel.p29opdracht1;

import javax.persistence.*;

@Entity
public class Visitor {

    @Id
    private long id;
    private String name;

    public Visitor() {

    }

    public Visitor(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return name;
    }

    public void setText(String text) {
        this.name = name;
    }
}
