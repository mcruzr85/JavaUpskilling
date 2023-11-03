import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        try{
            Automovil deportivo1 = new AutoDeportivo("Ford" , "K", 2005, false);
            Automovil familiar1 = new AutoFamiliar("Fiat" , "Mobi", 1990, 8);
            Circulo miCirculo = new Circulo();

            System.out.println("aqui voy de nuevo, mi primer proyecto!");
            System.out.println("accediendo al año de auto 1: " + deportivo1.getAnoFabricacion());
            System.out.println("auto familiar " + familiar1.getMarca());
     /* ejercicio de la tarea m1c1
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el radio del círculo:");
       // double radio = Double.parseDouble(entrada.nextLine());
        double radio = entrada.nextDouble();
        System.out.println("El área del circulo es: " + miCirculo.calcularArea(radio));
        System.out.println("La circunferencia del círculo es: " + miCirculo.calcularCircunferencia(radio));
         entrada.close();
*/
          ExceptionExample ex = new ExceptionExample();
          ex.doSomething();// Llamada al método que lanza una excepción

        }catch(Exception ex){
            System.out.println("Entró al catch del main, mensaje: " + ex.getMessage());
        }


    }
}