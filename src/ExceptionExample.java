public class ExceptionExample {
    int numerador = 10;
    int denominador = 0;
    ExceptionExample(){}

    public ExceptionExample(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void doSomething() throws Exception {

        // Un bloque de código que lanza una excepción
        System.out.println("valor de num es: " + this.numerador + " valor de den es: " + this.denominador);
        System.out.println("Entré al doSomething de la clase ExceptionExample antes de la div x cero");
        int res = numerador/denominador;
    }
    /*
    En este ejemplo, el método `doSomething()` lanza una excepción, y como no la maneja
    ni declara con `throws`, la excepción se propaga al método que lo llamó, en este caso,
     el método `main`.*/

}
