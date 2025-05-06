package Tema9;

public class Pizza {
    
    //Atributos de clase
    protected static int totalPedidas;
    protected static int totalServidas;

    //Atributos de instancia
    private String tipo;
    private String size;
    private String estado;


    //Constructor
    public Pizza(String tipo, String size){

        this.tipo = tipo;
        this.size = size;
        this.estado = "Pedida";
        totalPedidas++;

    }


    public void sirve(){

        if (this.estado == "Pedida") {
            this.estado = "Servida";
            totalPedidas++;
        } else{
            System.out.println("Esa pizza ya se ha servido");
        }


        this.estado = "Servida";
        totalServidas++;

    }


    public String toString(){
        return "pizza "+ this.tipo + " " + this.size + ", " + this.estado;
    }


    public void setSize(String size){
        this.size = size;
    }
    public String getSize(String size){
        return size;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(String tipo){
        return tipo;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(String estado){
        return estado;
    }

    public static int getTotalPedidas(){
        return totalPedidas;
    }
    public static int getTotalServidas(){
        return totalServidas;
    }


}