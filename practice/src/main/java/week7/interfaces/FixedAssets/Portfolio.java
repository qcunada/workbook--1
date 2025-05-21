package week7.interfaces.FixedAssets;


import java.util.ArrayList;

public class Portfolio {
    private String name;
    private String owner;
    private ArrayList<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<>();

    }
    public void add(Valuable valuable){
        valuables.add(valuable);
    }
    public double getValue(){
        double total = 0;
        for (Valuable valuable : valuables) {
            total += valuable.getValue();
        }
        return total;

    }
    public Valuable getMostValuable() {
        if (valuables.isEmpty()) return null;

        Valuable max = valuables.get(0);
        for (Valuable valuable : valuables) {
            if (valuable.getValue() >= max.getValue()) {
                max = valuable;
            }
        }
        return max;
    }

    public Valuable getLeastValuable() {
        if (valuables.isEmpty()) return null;

        Valuable min = valuables.get(0);
        for (Valuable valuable : valuables) {
            if (valuable.getValue() <= min.getValue()) {
                min = valuable;
            }
        }
        return min;
    }
    public ArrayList<Valuable> getValuables(){
        return valuables;
    }

}
