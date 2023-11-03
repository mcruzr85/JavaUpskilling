public class ExceptionPropagExplicita {

    int num = 10, den = 0;

    ExceptionPropagExplicita(){
    }

    public ExceptionPropagExplicita(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public void doSomething2(){
        try{
            int res = this.num/this.den;

        }catch(ArithmeticException ex){

            System.out.println("Entró al catch del DoSomethin2");
          //  throw new CustomException("Error aritmetico " + ex.getMessage());
        }
    }
}
/*
* En este ejemplo, la excepción `ArithmeticException` se captura en el método
* `doSomething2()`, se personaliza el mensaje y se lanza una nueva excepción
*  (`CustomException`) con un mensaje mejorado.*/