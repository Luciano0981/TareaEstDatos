/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parted.segunda.clase.luciano;

/**
 *
 * @author Luis
 */
public class ParteDSegundaClaseLuciano {
  public double calcExponencial(int n, int x){
        if (n == 0) {
            return 1;
        }
        return (Math.pow(x, n) / factorial(n)) + calcExponencial(n-1, x);
    }
    
    public double factorial (int num){
        if (num == 0) {
            return 1;
            
        }
        return num * factorial(num-1);
    }  
    
    
    
}


 
    
    

