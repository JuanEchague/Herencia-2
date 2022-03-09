package ejercicio2;

public class Lavadora extends Electrodomestico {
///////////////////////////////Atributos///////////////////////////////////////
    private double carga;

//////////////////////////////Constructores////////////////////////////////////

    public Lavadora(double precio, String color, char consumoEnergetico, double peso,double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga=carga;
    }

    public Lavadora() {
    }
//////////////////////////Getters and Setters/////////////////////////////////

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

/////////////////////////////////Metodos///////////////////////////////////////
    public void crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Ingrese carga de la lavadora");
        this.carga = read.nextInt();
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precio += 500;
        }
}
}
