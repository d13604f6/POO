//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Persona {
    //Atributos

    String nombre;
    int edad;
    String dni;
    //Metodos

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    //metodos
    public void correr(){
        System.out.println("Soy " + nombre+"tengo "+edad+" anos y estoy corriendo una maraton");
    }
    public void correr(int km){
        System.out.println("He corrido " + km + "Kilometros");
    }
}
