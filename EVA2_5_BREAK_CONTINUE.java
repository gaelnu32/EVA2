/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_break_continue;
import java.util.Scanner;
/**
 *
 * @author lozan
 */
public class EVA2_5_BREAK_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code appication logic here
        //BREAK --> termina el ciclo completamente
        //CONTINUE --> interrumple la repeticion actual
        Scanner captu = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
        if(i == 8)
            break;
        System.out.print(i + " - ");
    }
        System.out.println("");
        for (int i = 1; i < 10; i++) {
        if(i == 8);
        continue;
        System.out.print(i + " - ");
        
    }
    
}
