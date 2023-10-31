public class AutoDeportivo extends Automovil {
    private boolean esDescapotable;

    public AutoDeportivo() {
    }
    public AutoDeportivo(boolean esDescapotable) {
        this.esDescapotable = esDescapotable;
    }

    public AutoDeportivo(String marca, String modelo, int anoFabricacion, boolean esDescapotable) {
        super(marca, modelo, anoFabricacion);
        this.esDescapotable = esDescapotable;
    }

    public void setEsDescapotable(boolean esDescapotable) {
        this.esDescapotable = esDescapotable;
    }

    public boolean isDescapotable() {
        return esDescapotable;
    }

    @Override
    public void acelerar(){
        System.out.println("Auto deportivo acelerando rápido");
    }
}
