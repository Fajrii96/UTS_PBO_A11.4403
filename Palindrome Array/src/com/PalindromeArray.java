/* Nama : Syarifuddin Fajri
Nim : A11.2017.10270
Kelompok : A11.4403-PBO
Ujian Tengah Semester PBO */

package com; // package dengan nama direktori com

import java.util.Arrays; // Mengimpor Array ke dalam program
import java.util.Scanner; // Mengimpor scanner ke dalam program 

public class PalindromeArray
{
   public static void main(String[] args) // Fungsi Main
   {
      System.out.println("Masukkan String Array: ");
      Scanner sc = new Scanner(System.in);
      String strInput = sc.nextLine();
      char[] chArray = strInput.toCharArray();
      int size = chArray.length;
      char[] chGiven = Arrays.copyOf(chArray, chArray.length);
      for(int a = 0; a < size / 2; a++) // Fungsi Array
      {
         char temp = chArray[a];
         chArray[a] = chArray[size - a - 1];
         chArray[size - a - 1] = temp;
      }
      System.out.println("Isi Larik Array: " + Arrays.toString(chGiven)); // Menampilkan Larik Array yang di inputkan
      System.out.println("String Palindrome menggunakan Array: " + Arrays.toString(chArray)); // Menampilkan String Array yang sudah diurutkan dari belakang
      if(Arrays.equals(chArray, chGiven)) // Fungsi array.equals yang digunakan untuk mengecek apakah kalimat string berupa polindrome atau tidak
      {
         System.out.println("String Merupakan Palindrome."); // Jika String merupakan Palindrome maka tampilkan "String Merupakan Palindrome"
      }
      else 
      {
         System.out.println("String Bukan Merupakan Palindrome."); // Jika String bukan merupakan Palindrome maka tampilkan "String Bukan Merupakan Palindrome"
      }
      sc.close();
   }
}