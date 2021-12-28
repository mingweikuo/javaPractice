/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author Wilson
 */
public class Ch1_8 {

    public static void main(String[] args) {
        int v1 = 1;//00001
        int n1 = 4;
        int x1 = v1 << n1;//10000
        System.out.println(x1);//v1如果是1，就是2的n次方
        
        int v2 = 2;//00010
        int n2 = 2;
        int x2 = v2 << n2;//01000
        System.out.println(x2);
        
        int v3 = 32;
        int n3 = 1;
        // v3/2^n3
        //常用!! 除法在電腦很慢
        //如果想除於2次方的類型，請使用>>
        int x4 = v3 >> n3;
        System.out.println(x4);
        
    }
    
}
