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
        this.name = name;
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
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getT() {
        return T;
    }
    public void setT(int T) {
        this.T = T;
    }
    public String getUp() {
        return up;
    }
    public void setup(String up) {
        this.up = up;
    }
    public String getDown() {
        return down;
    }
    public void setDown(String down) {
        this.down = down;
    }
    public String getShoes() {
        return shoes;
    }
    public void setShoes(String shoes) {
        this.shoes = shoes;
    }
    public String getHands() {
        return hands;
    }
    public void setHands(String hands) {
        this.hands = hands;
    }
}
