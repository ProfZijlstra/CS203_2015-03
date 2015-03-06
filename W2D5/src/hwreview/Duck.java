package hwreview;

public class Duck {
    private int weight = 8;
    private String name = "unknown";
    private boolean canFly = true;
    private int airspeed = 22;

    public Duck(int weight, String name, boolean canFly, int airspeed) {
        this.weight = weight;
        this.name = name;
        this.canFly = canFly;
        this.airspeed = airspeed;
    }

    public Duck(int weight, int airspeed) {
        this(weight, "unknown", true, airspeed);
    }
    
    public Duck() { } // default constructor
    
    public void quack() {
        System.out.println("Quack Quack");
    }

    public int getWeight() { return weight; }
    public String getName() { return name; }
    public boolean isCanFly() { return canFly; }
    public int getAirspeed() { return airspeed; }

    public void setWeight(int weight) { this.weight = weight; }
    public void setName(String name) { this.name = name; }
    public void setCanFly(boolean canFly) { this.canFly = canFly; }
    public void setAirspeed(int airspeed) { this.airspeed = airspeed; }
}
