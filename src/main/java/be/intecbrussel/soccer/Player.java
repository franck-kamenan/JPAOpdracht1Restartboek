package be.intecbrussel.soccer;

import javax.persistence.*;

@Entity
@IdClass(PlayerPK.class)
public class Player {

    private String club;
    private int number;
    private String name;

    @Id
    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Id
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
