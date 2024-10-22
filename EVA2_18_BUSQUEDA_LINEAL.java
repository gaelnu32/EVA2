/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_busqueda_lineal;

import java.util.Scanner;
/**
 *
 * @author lozan
 */
public class EVA2_18_BUSQUEDA_LINEAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos = {10, 50, 85, 73, 1, 25, 43, 5, 0, 6};
        int valor, posi = -1;
        Scanner captu = new Scanner(System.in);
        System.out.println("valor a buscar:");
        valor = captu.nextInt();
        for (int i = 0; i < datos.length; i++) {
            if(valor == datos[1]){
                //Regresar la posi
                posi = i;
                //detener el ciclo
                break;
                
            }
            
        }
        if (posi == -1)
            System.out.println("VALOR NO ENCONTRADO");
        else 
            System.out.println("El valor esta en la posicion" + posi);
    }
    
    
}
