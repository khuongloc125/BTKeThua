package bai6;
import java.util.Scanner;

public class person {
    public String name;
    public int age;
    public String address;

    public person (){

    }

    public person (String name, int age, String address){
        this.age = age;
        this. name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addperson() {
        System.out.println("Nhap ten:");
    
    }
}