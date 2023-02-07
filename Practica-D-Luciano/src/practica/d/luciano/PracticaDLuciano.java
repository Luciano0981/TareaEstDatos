/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.d.luciano;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class PracticaDLuciano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   Codigo1Original codigo1 = new Codigo1Original();
   Codigo2VersionRecursivo Codigo2 = new Codigo2VersionRecursivo();
   /*
        JOptionPane.showMessageDialog(null, "Bienvenido a sistema de calculo");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();
        System.out.print("Ingrese el valor de x: ");
        int x = sc.nextInt();
        double resultado = codigo1.calcExponencial(n, x);
        System.out.println("El resultado del calculo exponecial es: " + resultado);
        
        
        System.out.print("Ingrese el valor de factorial: ");
        int num = sc.nextInt();
        double  resultado1 = codigo1.factorial(num);
         if (num == 0) {
        System.out.println("El numero es incorrecto por lo tanto su valor preteminado es : " + resultado1); 
        }else{ 
        System.out.println("El resultado del calculo Factorial es: " + resultado1);
   }
   
   
*/
        JOptionPane.showMessageDialog(null, "Bienvenido a sistema de calculo2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de n : ");
        int n = sc.nextInt();
        System.out.print("Ingrese el valor de x : ");
        int x = sc.nextInt();
        double resultado = Codigo2.calcExponencial(n, x);
        System.out.println("El resultado del calculo exponecial  es: " + resultado);
        
        
        System.out.print("Ingrese el valor de factorial : ");
        int num = sc.nextInt();
        double  resultado1 = Codigo2.factorial(num);
        if (num == 0) {
           System.out.println("El numero es incorrecto por lo tanto su valor preteminado es : " + resultado1); 
        }else{ 
        System.out.println("El resultado del calculo Factorial es 2: " + resultado1);
    }
    
}
}

