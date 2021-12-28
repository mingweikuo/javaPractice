/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author Wilson
 */
public class Ch1_7 {


    public static void main(String[] args) {
        int v1 = 10,v2 = 25;
        System.out.println(v1 & v2);
        System.out.println(v1 | v2);
        //01010
        //11001
        
        // & 去背、過濾
            //01000
        // | 遊戲光線強度、融合
            //11011
        
        System.out.println(v1 ^ v2);
        //互斥 加解密運算
        int v3 = v1 ^ v2;
        //10011
        System.out.println(v3 ^ v1);//A拿到的是v2加密的
        System.out.println(v3 ^ v2);//B拿到的是v1加密的
    }
    
}
