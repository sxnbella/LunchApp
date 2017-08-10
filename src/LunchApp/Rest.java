package LunchApp;

public class Rest {

    private String name;
    private int weight;
    private final int weight_default = 10;

    protected Rest(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    protected Rest(String name) {
        this.name = name;
        this.weight = weight_default;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void addWeight(int add) {
        this.weight += add;
    }
}
