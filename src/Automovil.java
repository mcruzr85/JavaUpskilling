public abstract class Automovil {
    private String marca;
    private String modelo;
    private int anoFabricacion;

   public Automovil(){
    }
    public Automovil(String marca, String modelo, int anoFabricacion){
     this.marca = marca;
     this.modelo = modelo;
     this.anoFabricacion = anoFabricacion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public abstract void acelerar();
    public String frenar(){
        return "Frenando";
    }
}

