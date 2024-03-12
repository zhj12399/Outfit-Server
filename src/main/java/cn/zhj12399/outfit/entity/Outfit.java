package cn.zhj12399.outfit.entity;

public class Outfit {
    private int year;
    private int month;
    private int day;

    private String hat;
    private String up;
    private String down;
    private String shoes;
    private String hands;

    public Outfit() {}

    public Outfit(int year, int month, int day, String hat, String up, String down, String shoes, String hands) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hat = hat;
        this.up = up;
        this.down = down;
        this.shoes = shoes;
        this.hands = hands;
    }
}
