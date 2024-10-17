/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_validar;
import java.util.Scanner;
/**
 *
 * @author lozan
 */
public class EVA2_8_VALIDAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Numero correspondiente al dia (1 - 7):");
        dia = captu.nextInt(); 
        do{
           
   }while(dia < 1 || dia > 7);
 
  switch(dia){
      case 1:
          System.out.println("Lunes");
          break;//ultima instruccion fin del caso
 
      case 2:
            System.out.println("Martes");
          break;//ultima instruccion fin del caso
 
      case 3:
          System.out.println("Miercoles");
          break;//ultima instruccion fin del caso
 
      case 4:
          System.out.println("Jueves");
          break;//ultima instruccion fin del caso
 
      case 5:
          System.out.println("Viernes");
          break;//ultima instruccion fin del caso
 
      case 6:
          System.out.println("Sabado");
          break;//ultima instruccion fin del caso
 
      case 7:
          System.out.println("Domingo");
          break;//ultima instruccion fin del caso
 
     
  }      
}
}