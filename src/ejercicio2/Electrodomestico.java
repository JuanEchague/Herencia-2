package ejercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Electrodomestico {
///////////////////////////////Atributos//////////////////////////////////////
    protected double precio;

    protected String color;

    protected char consumoEnergetico;

    protected double peso;
///////////////////////////Constructores//////////////////////////////////////
    public Electrodomestico() {
    }
    
    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
///////////////////////////Getters and Setters////////////////////////////////

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

 /////////////////////////////Metodos//////////////////////////////////////////
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    public void comprobarConsumoEnergetico(String letra) {
       switch (letra.toUpperCase()){
           case "A":
                consumoEnergetico = 'A';
                break;
            case "B":
                consumoEnergetico = 'B';
                break;
            case "C":
                consumoEnergetico = 'C';
                break;
            case "D":
                consumoEnergetico = 'D';
                break;
            case "E":
                consumoEnergetico = 'E';
                break;
            case "F":
                consumoEnergetico = 'F';
                break;
            default:
                consumoEnergetico = 'F';
                break;
       }
    }

    public void comprobarColor(String color) {
       switch (color.toUpperCase()){
           case "BLANCO":
               this.color= "Blanco";
               break;
           case "NEGRO":
               this.color = "Negro";
               break;
           case "ROJO":
               this.color= "Rojo";
               break;
           case "AZUL":
               this.color= "Azul";
               break;
           case "GRIS":
               this.color= "Gris";
               break;
           default:
               this.color= "Blanco";
               break;
       }
    }

    public void crearElectrodomestico() {
        System.out.println("Ingrese el color: ");
        comprobarColor(read.next());
        System.out.println("Ingrese el nivel de consumo electrico(A-F) del electrodomestico: ");
        comprobarConsumoEnergetico(read.next());
        System.out.println("ingrese el peso(kg) del electrodomestico: ");
        this.peso=read.nextDouble();
        precio= 1000;
    }

    public void precioFinal() {
        switch (consumoEnergetico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;

        }
        if (this.peso>=1 && this.peso<=19) {
            this.precio+=100;
        }else if(this.peso>20 && this.peso<=49){
            this.precio+=500;
        }else if(this.peso>50 && this.peso<=79){
            this.precio+=800;
        }else if(this.peso>=80){
            this.precio+=1000;
        }
        
    }
     @Override
    public String toString() {
        return " Precio: " + precio + " Color: " + color + " Consumo: " + consumoEnergetico + " Peso: " + peso;
    }
}
