import java.util.Scanner;
public class Ex3{
    public static void main(String[] args) {

        Scanner lector=new Scanner(System.in);
        final int NUM_ALUMNES=300;
        int menu1;
        int menu2;
        Alumnes [] alumnes=new Alumnes[NUM_ALUMNES];
        do{
            //menu1
            System.out.println("*******************");
            System.out.println("**Gestion Alumnos**");
            System.out.println("*******************");
            System.out.println("1.Nuevo alumno");
            System.out.println("2.Baja de alumno");
            System.out.println("3.Consultas");
            menu1=lector.nextInt();
            lector.nextLine();

            switch (menu1) {
                case 0:
                    System.out.println("Hasta luego");
                break;
                case 1:

                break;
                case 2:
                
                break;
                case 3: 
                    do{
                        //menu2
                        System.out.println("*************");
                        System.out.println("**Consultas**");
                        System.out.println("*************");
                        System.out.println("1.Por grupo");
                        System.out.println("2.Por edad");
                        System.out.println("3.Por nia");
                        System.out.println("4.Por apellidos");
                        System.out.println("------------------");
                        System.out.println("0.Volver al menu principal");
                        menu2=lector.nextInt();
                        lector.nextLine();

                    }while(menu2!=0); 
            
                default:
                    System.out.println("El numero introducido no es correcto, por favor intente de nuevo");
                break;
            }

                
                

            



            //menu2
            System.out.println("*************");
            System.out.println("**Consultas**");
            System.out.println("*************");
            System.out.println("1.Por grupo");
            System.out.println("2.Por edad");
            System.out.println("3.Por nia");
            System.out.println("4.Por apellidos");
            System.out.println("------------------");
            System.out.println("0.Volver al menu principal");

            

        }while(menu1!=0);
        

    }
}