//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Persona {

   //Atributo

    String nombre;
    int edad;

    //Metodo

    //Metodo contructor
    public Persona (String _nombre, int _edad){
        nombre = _nombre;
        edad = _edad;

    }
    public void mostrarDatos(){
        System.out.println("El nombre es : " + nombre);
        System.out.println("La edad es : " + edad);
    }

    }
