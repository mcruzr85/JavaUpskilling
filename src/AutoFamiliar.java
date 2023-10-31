public class AutoFamiliar extends Automovil{
    private int cantAsientos;

    public AutoFamiliar(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public AutoFamiliar(String marca, String modelo, int anoFabricacion, int cantAsientos) {
        super(marca, modelo, anoFabricacion);
        this.cantAsientos = cantAsientos;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    @Override
    public void acelerar(){
        System.out.println("Auto familiar ...acelerando despacio, cuide su familia");
    }
}
