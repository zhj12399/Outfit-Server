package cn.zhj12399.outfit.entity;

public class People {
    private String name;
    private String password;

    public People(){}
    public People(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
}
