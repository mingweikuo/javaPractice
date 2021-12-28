/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author Wilson
 */
public class Ch1_6 {


    public static void main(String[] args) {
        boolean b1 = true,b2 = false;
        System.out.println(b1 && b2); //且運算 必須兩邊都為true
        System.out.println(b1 || b2); //或運算 單邊為true輸出true
        System.out.println(!b1);      //反向!
        System.out.println(b1 ^ b2);  //互斥 一true一false才為true
        
        int c = 1;
        //且的短路現象 左邊false 右邊不執行
        boolean b3 = c > 0 && ++c < 6;
        System.out.println(c);
        
        //或的短路現象 左邊為true 右邊不執行
        boolean b4 = c < 0 || ++c < 7;
        System.out.println(c);
        //是否為null放左邊
        //基本型態比較放左邊 右邊放參考型態的比較
    }
    
}
