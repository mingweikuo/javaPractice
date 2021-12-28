/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author Wilson
 */
public class Ch1_10 {


    public static void main(String[] args) {
        int pm25 = 85;
        if(pm25 >= 0 && pm25 <= 35)
            System.out.println("低");
        else if(pm25 >= 36 && pm25 <= 53)
            System.out.println("中");
        else if(pm25 >= 54 && pm25 <= 70)
            System.out.println("高");
        else if(pm25 >= 71)
            System.out.println("非常高");
    }
    
}
