import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Automovil deportivo1 = new AutoDeportivo("Ford" , "K", 2005, false);
        Automovil familiar1 = new AutoFamiliar("Fiat" , "Mobi", 1990, 8);
        Circulo miCirculo = new Circulo();

        System.out.println("aqui voy de nuevo, mi primer proyecto!");
        System.out.println("accediendo al año de auto 1: " + deportivo1.getAnoFabricacion());
        System.out.println("auto familiar " + familiar1.getMarca());

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el radio del circulo:");
        double radio = Double.parseDouble(entrada.nextLine());
        System.out.println("El área del circulo es: " + miCirculo.calcularArea(radio));
        System.out.println("La circunferencia del circulo es: " + miCirculo.calcularCircunferencia(radio));




    }
}