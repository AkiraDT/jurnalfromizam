/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
import java.util.Scanner;
public class Jurnal
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n;
    System.out.print("Masukan Nilai n = ");
    n=in.nextInt();
    System.out.println("Jumlah Nilai Fibonacci = " +Fibonaci(n));
  }
    static int Fibonaci(int n)
  {
    if ((n == 1)||(n==2))
    return (1);
      else
    return (Fibonaci(n-1)+Fibonaci(n-2));
  }
}


//SUDAH DI EDIT
