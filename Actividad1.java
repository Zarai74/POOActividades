import java.util.Scanner;
public class Actividad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada.
        System.out.print("Ingresa el ID del animal: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Ingresa el nombre del animal: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa el tipo de animal: ");
        String tipo = sc.nextLine();
        System.out.print("Ingresa el color del animal: ");
        String color = sc.nextLine();
        System.out.print("Ingresa el peso del animal (kg): ");
        double peso = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Ingresa el tipo de alimentacion: ");
        String alimentacion = sc.nextLine();

        // Crear objeto Animal
        Animal animal1 = new Animal(id, nombre, tipo, color, peso, alimentacion);

        // Salida.
        System.out.println("\n--- Informacion del Animal ---");
        animal1.mostrarInfo();

        // Uso de metodos
        System.out.println("\n--- Acciones ---");
        animal1.alimentar();
        animal1.revisarSalud();
        animal1.vacunar();

        sc.close();
    }
}

// Clase Animal
class Animal {

    // Atributos
    int ID;
    String nombre;
    String tipo;
    String color;
    double peso;
    String alimentacion;

    // Constructor
    public Animal(int ID, String nombre, String tipo, String color, double peso, String alimentacion) {
        this.ID = ID;
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.peso = peso;
        this.alimentacion = alimentacion;
    }

    // Metodos
    public void alimentar() {
        System.out.println(nombre + " ha sido alimentado.");
    }

    public void revisarSalud() {
        System.out.println("Revisando la salud de " + nombre + ".");
    }

    public void vacunar() {
        System.out.println(nombre + " ha sido vacunado.");
    }

    public void mostrarInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Alimentacion: " + alimentacion);
    }
}
