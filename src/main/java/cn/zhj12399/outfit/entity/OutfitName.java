package cn.zhj12399.outfit.entity;

public class OutfitName {
    private String name;
    private int year;
    private int month;
    private int day;

    private int T;

    private String up;
    private String down;
    private String shoes;
    private String hands;

    public OutfitName() {
    }

    public OutfitName(String name, int year, int month, int day, int T, String up, String down, String shoes, String hands) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.T = T;
        this.up = up;
        this.down = down;
        this.shoes = shoes;
        this.hands = hands;
    }

    public Outfit getOutfit() {
        return new Outfit(this.year, this.month, this.day, this.T, this.up, this.down, this.shoes, this.hands);
    }

    public String getName() {
        return name;
    }
}
