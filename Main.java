/**
 * Blender Application.
 *
 * @author Josue Hernández - 24770
 * @author Gabriel Hidalgo - 24939
 * @author Oscar Rompich - 24880
 * 
 * @version 1.0
 * @since 2025-01-20
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Blender blender = new Blender();

        int option = 0;

        while (option != 6) {

            System.out.println("\n=============================");
            
            if (blender.IsFull() == true) {
                System.out.println("\nEstado de la licuadora: Llena");
            } else {
                System.out.println("\nEstado de la licuadora: Vacía");
            }
            
            System.out.println("\n=============Menu============ \n\n1. Aumentar Velocidad \n2. Reducir Velocidad \n3. Llenar licuadora \n4. Vaciar Licuadora \n5. Ver Velocidad Actual \n6. Salir");
            System.out.print("\nSeleccione una opcion: ");
            option = sc.nextInt();

            switch (option) {
                case 1:


                    if (blender.IsFull() == true && blender.GetSpeed() < 9)
                    {
                    blender.SpeedUp();
                    System.out.println("Velocidad actual: " + blender.GetSpeed());


                    } else if (blender.IsFull() == false) {

                        System.out.println("La licuadora no esta llena y no se puede aumentar la velocidad");

                    }
                    else {
                        System.out.println("¡No se puede aumentar más la velocidad!");
                    }

                    break;
                
                case 2:

                    if  (blender.GetSpeed() > 0)
                    {
                    blender.SpeedDown();
                    System.out.println("No. de velocidad actual: " + blender.GetSpeed());
                    } else {
                        System.out.println("¡No se mpuede disminuir más la velocidad!");
                    }
                    break;

                case 3:

                if (blender.IsFull() == false) {
                    blender.Fill();
                    System.out.println("La licuadora ha sido llenada");
                
                } else {
                    System.out.println("La licuadora ya estaba llena");

                }           
                
                    break;  
                    
                case 4:

                    if (blender.IsFull() == true) {
                        blender.Empty();
                        System.out.println("La licuadora ha sido vaciada");

                    } else {
                        
                        System.out.println("La licuadora ya estaba vacía");
                    }


                    break;

                case 5:
                    System.out.println("No. velocidad actual: " + blender.GetSpeed());
                    break;
                    
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }        
        sc.close();
    }
}

//no se puede vaciar si no se para o reibnia la velocidad
//protected ?