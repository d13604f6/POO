import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class operacion {

    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //metodos

    //metodos para pedirle al usuario que nos digite dos numeros

    public void Leernumeros() {

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    }

    public void sumar() {
        suma =numero1 + numero2;
    }
    public void restar() {
        resta =numero1 - numero2;
    }
    public void multiplicar() {
        multiplicacion =numero1 * numero2;
    }
    public void dividir() {
        division =numero1 / numero2;
    }
    public void mostrarResultados(){
        System.out.println("La suma es :" +suma);
        System.out.println("La resta es :" +resta);
        System.out.println("La multiplicacion es :" +multiplicacion);
        System.out.println("La division es :" +division);
    }
}
