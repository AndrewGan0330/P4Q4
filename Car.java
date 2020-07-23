/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical4_q4;

/**
 *
 * @author mengf
 */
public class Car {
     private String plate_No;
    private String color;
    private int year;
    private CarType type;

    public Car(String plate_No, String color, int year, CarType type) {
        this.plate_No = plate_No;
        this.color = color;
        this.year = year;
        this.type = type;
    }
    
    public String toString(){
        return String.format("%-10s %-10s %-8d %s", plate_No, color, type.toString());
    }
}
