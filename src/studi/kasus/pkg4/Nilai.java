/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studi.kasus.pkg4;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Nilai {
    public static void main(String[] args) {
      System.out.println("Masukan nilai ujian: ");
      Scanner input = new Scanner(System.in);
      int nilai= input.nextInt();
     
      if (nilai>=90){ 
          System.out.println("Mendapat= A");
      }else if (nilai>=80){
          System.out.println("Mendapat= B");
      }else if (nilai>=70){
          System.out.println("Mendapat= C");
      }else if (nilai<=70){
          System.out.println("Mendapat= D");
      }
     
       
}}
