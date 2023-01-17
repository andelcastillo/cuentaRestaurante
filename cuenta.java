import java.util.Scanner;

public class cuenta{

    public static void main(String[]args){

        int burguer=12, burguerqueso=15, burguerdoble=17, patatas=5, cerveza=6,
        refresco=5, cafe=6, can_burguer, can_burguerqueso, can_burguerdoble, can_patatas,
        can_cerveza, can_refresco, can_cafe, cuenta;

        Scanner lector= new Scanner(System.in);

        System.out.println("Ingrese la cantidad de hamburguesas: ");
        can_burguer=lector.nextInt();
        System.out.println("Ingrese la cantidad de hamburguesas con queso: ");
        can_burguerqueso=lector.nextInt();
        System.out.println("Ingrese la cantidad de hamburguesas dobles: ");
        can_burguerdoble=lector.nextInt();
        System.out.println("Ingrese la cantidad de patatas consumidas: ");
        can_patatas=lector.nextInt();
        System.out.println("Ingrese la cantidad de cervezas consumidas: ");
        can_cerveza=lector.nextInt();
        System.out.println("Ingrese la cantidad de refrescos consumidos: ");
        can_refresco=lector.nextInt();
        System.out.println("Ingrese la cantidad de café consumidos: ");
        can_cafe=lector.nextInt();

        cuenta = can_burguer * burguer + can_burguerqueso * burguerqueso +
        can_burguerdoble*burguerdoble + can_patatas*patatas + can_cerveza*cerveza + 
        can_refresco*refresco + can_cafe*cafe;

        System.out.println("El total de la cuenta es: " + cuenta + " euros.");










    }
}