/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lfa.star;

public class Star {

    public static void main(String[] args) {

        for (int i = 1; i <= 15; i+=2) {
            for (int k = 0; k < 10 - i / 2; k++) {  //(10-i/2) is self generated formula others can modify it
                System.out.print("_");              //"_" represents space
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
