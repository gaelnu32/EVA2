/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_paress;
import java.util.Scanner;

/**
 *
 * @author lozan
 */
public class EVA2_6_PARESS {

  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
          Scanner captu = new Scanner(System.in);
    System.out.println("Inicio");
    num1 = captu.nextInt();
    captu.nextLine();
    System.out.println("Fin:");
    num2 = captu.nextInt();
    for (int i = num1; 1 <= num2; i++){
        int modulo = i % 2;//resultado de la division
        if(modulo == 0)//verdad -->> sea impar, para detener la 
            continue;
        System.out.print(i + " - ");
    }
        // TODO code application logic here
    }
    
}
