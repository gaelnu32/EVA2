/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_usuario_pwd;
import java.util.Scanner;

/**
 *
 * @author lozan
 */
public class EVA2_9_USUARIO_PWD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String user;
        String contra;
        Scanner captu = new Scanner(System.in);
       
        
        
        
        do{
        System.out.println("Ingrese su usuario:");
        user = captu.nextLine();   
        System.out.println("Ingrese su contraseña:");
        contra = captu.nextLine();   
            
        }while(!(user.equals("añañin") && contra.equals("añañin2")));     
         System.out.println("Welcum");   
        }
    }


