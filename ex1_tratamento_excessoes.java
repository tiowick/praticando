package Direct_7;

import javax.swing.*;

// Divisão de dois valores;
public class ex1_tratamento_excessoes {
    public static void main(String[] args) {
        boolean continueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            // tratamento de erros;
            
            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um numero inteiro: " + e.getMessage());

            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossivel dividir numero por 0! " + e.getMessage());

            }
            finally {
                System.out.println("Chegou no finnal!");
            }
        } while (continueLooping);



        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return  a / b;
    }
}
