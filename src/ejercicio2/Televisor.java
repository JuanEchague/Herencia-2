package ejercicio2;

public class Televisor extends Electrodomestico {
/////////////////////////////////////Atributos/////////////////////////////////
    private int resolucion;

    private boolean sintonizador;
///////////////////////////////////Constructores//////////////////////////////

    public Televisor(double precio, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizador) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion=resolucion;
        this.sintonizador=sintonizador;
    }
    
    
    public Televisor() {
    }
///////////////////////////Getters and Setters/////////////////////////////////

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
///////////////////////////////////Metodos////////////////////////////////////
    public void crearTelevisor() {
        super.crearElectrodomestico();
         System.out.println("Ingrese resolucion del televisor en pulgadas");
        this.resolucion = read.nextInt();
        System.out.println("su televisor tiene sintonizador?(s/n): ");
        String aux=read.next();
        do {
             if (aux.equalsIgnoreCase("s")) {
            this.sintonizador = true;
        } else if (aux.equalsIgnoreCase("n")){
            this.sintonizador = false;
        }
        } while (!aux.equalsIgnoreCase("s")&& !aux.equalsIgnoreCase("n"));
        
        
       
        
    }
@Override
    public void precioFinal() {
         super.precioFinal();
        if (this.resolucion>40) {
            this.precio=this.precio*1.3;
        }
        if (sintonizador) {
            this.precio+=500;
        }
    }
}
