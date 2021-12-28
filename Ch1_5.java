/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author Wilson
 */
public class Ch1_5 {

    public static void main(String[] args) {
        int a = 11,b = 20;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println("==================================");
        String str1 = "Ken";  //0x123 位於字串池
        String str2 = "Ken";  //0x123 位於字串池
        String str3 = "Vivian"; //0x124 位於字串池
        String str4 = new String("Ken"); //位於全新區塊 不在字串池
        System.out.println(str1+":"+str2+":"+str3);
        System.out.println(str1 == str2);  //參考型別 比較時 是比較記憶體位址
        System.out.println(str1 == str3);
        System.out.println(str2 == str4);
        System.out.println(str2.equals(str4));  //equals()方法 將字元一個一個拿出來做比較
    }
    
}
