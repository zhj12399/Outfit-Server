package cn.zhj12399.outfit.entity;

public class Outfit {
    private int year;
    private int month;
    private int day;

    private int t;

    private String up;
    private String down;
    private String shoes;
    private String hands;

    public Outfit() {}

    public Outfit(int year, int month, int day, int t, String up, String down, String shoes, String hands) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.t = t;
        this.up = up;
        this.down = down;
        this.shoes = shoes;
        this.hands = hands;
    }

    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}
    public int getMonth() {return month;}
    public void setMonth(int month) {this.month = month;}
    public int getDay() {return day;}
    public void setDay(int day) {this.day = day;}
    public int getT() {return t;}
    public void setT(int t) {this.t = t;}
    public String getUp() {return up;}
    public void setUp(String up) {this.up = up;}
    public String getDown() {return down;}
    public void setDown(String down) {this.down = down;}
    public String getShoes() {return shoes;}
    public void setShoes(String shoes) {this.shoes = shoes;}
    public String getHands() {return hands;}
    public void setHands(String hands) {this.hands = hands;}
}

