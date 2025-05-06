package Tema9;

public class Gato {
    
    String color;
    String raza;
    String sexo;
    int edad;
    double peso;

    
    //Constructor vacio
    public Gato(){

    }


    //Constructor simple
    public Gato(String sexo){
        this.sexo = sexo;
    }



    //Constructor completo
    public Gato(String color, String raza, String sexo, int edad, double peso){
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

}
