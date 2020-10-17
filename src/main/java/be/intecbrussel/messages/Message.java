package be.intecbrussel.messages;

import javax.persistence.*;

@Entity
public class Message {

    @Id
    private int id;
    private String text;

    public Message() {

    }

    public Message(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
