/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author Wilson
 */
public class Ch1_14 {


    public static void main(String[] args) {
        for(int i = 1;i <= 5;i++){
            System.out.println(i);
            if(i == 3) break;
        }
        System.out.println("===============================");
        for(int i = 1;i <= 5;i++){
            if(i == 3) continue;
            System.out.println(i);
        }
    }
    
}
