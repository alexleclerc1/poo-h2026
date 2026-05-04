package guilde;

import java.util.ArrayList;
import java.util.List;

public class Guilde {
    List<Aventurier> aventuriers;
    List<Quete> quetes;

    public Guilde() {
        aventuriers = new ArrayList<>();
        aventuriers.add(new Aventurier());
        aventuriers.add(new Aventurier());
        aventuriers.add(new Aventurier());


        quetes = new ArrayList<>();
        quetes.add(new Quete());
        quetes.add(new Quete());
        quetes.add(new Quete());
    }

    public List<Aventurier> getAventuriers() {
        return aventuriers;
    }

    public List<Quete> getQuetes() {
        return quetes;
    }
}
