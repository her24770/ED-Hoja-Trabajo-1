import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Blender blender = new Blender();

        int option = 0;

        while (option != 5) {
            
            if (blender.IsFull() == true) {
                System.out.println("\n\nEstado de la licuadora: Llena");
            } else {
                System.out.println("\n\nEstado de la licuadora: Vacía");
            }
            
            System.out.println("\n============Menu=========== \n\n1. Aumentar Velocidad \n2. Reducir Velocidad \n3. Llenar licuadora \n4. Vaciar Licuadora \n5. Salir");
            System.out.print("\nSeleccione una opcion: ");
            option = sc.nextInt();

            switch (option) {
                case 1:


                    if (blender.IsFull() == true && blender.GetSpeed() < 9)
                    {
                    blender.SpeedUp();
                    System.out.println("Velocidad actual: " + blender.GetSpeed());

                    } else {
                        System.out.println("La licuadora no esta llena o no se puede aumentar la velocidad");

                    }

                    break;
                
                case 2:

                    if  (blender.GetSpeed() > 0)
                    {
                    blender.SpeedDown();
                    System.out.println("Velocidad actual: " + blender.GetSpeed());
                    } else {
                        System.out.println("No se mpuede disminuir más la velocidad");
                    }
                    break;

                case 3:

                    blender.Fill();

                    break;  
                    
                case 4:
                    blender.Empty();
                    break;
                    
                case 5:
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