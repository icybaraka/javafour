/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Myclass {



    public static void main(String args[]) {
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter the size of the array");
 int size = scan.nextInt();
 int[]array = new int[15];
 for(int i=0;i<15;i++){
     System.out.println("Enter the element");
     array[i] = scan.nextInt(15);
 }
 scan.close();
 for(int i=0;i<array.length;i++){
     System.out.println(array[i]);
 }
    }
}
