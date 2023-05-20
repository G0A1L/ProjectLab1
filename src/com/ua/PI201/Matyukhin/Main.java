/** Программа для поиска слов-палиндромов
 *  @author Daniil Matyukhin PI-201
 *  @ver 1.0
 */

package com.ua.PI201.Matyukhin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PalindromeFinder aa=new PalindromeFinder("Довод илья был таков: он непонятен");
        System.out.println(aa.palindromeIsDoing());
    }
}