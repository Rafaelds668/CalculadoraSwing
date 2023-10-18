package ui;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * VentanaCalculadora es una clase que implementa una calculadora básica usando la biblioteca Swing.
 * Esta calculadora realiza operaciones de suma, resta, multiplicación y division
 */
public class VentanaCalculadora extends JFrame {
    private JPanel main;
    private JTextField txtSalida;
    private JButton buttonAC;
    private JButton buttonResta;
    private JButton buttonMultiplicar;
    private JButton buttonDividir;
    private JButton buttonIgual;
    private JButton buttonBorrar;
    private JButton button7;
    private JButton button4;
    private JButton button1;
    private JButton buttonVacio2;
    private JButton buttonSuma;
    private JButton button8;
    private JButton button5;
    private JButton button2;
    private JButton button0;
    private JButton buttonVacio1;
    private JButton button9;
    private JButton button6;
    private JButton button3;
    private JButton buttonComa;

    //Variables para las opera
    double num1, num2, result;
    //Variable para obtener el tipo de operación
    String operation;

    //Constructor
    public VentanaCalculadora(){
        //ActionListener boton AC
        buttonAC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText("");
            }
        });
        //ActionListener boton 9
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+button9.getText());
            }
        });
        //ActionListener boton 8
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+button8.getText());
            }
        });
        //ActionListener boton 7
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+button7.getText());
            }
        });
        //Action Listener boton 6
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button6.getText());
            }
        });
        //Action Listener boton 5
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button5.getText());
            }
        });
        //Action Listener boton 4
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button4.getText());
            }
        });
        //Action Listener boton 3
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button3.getText());
            }
        });
        //Action Listener boton 2
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button2.getText());
            }
        });
        //Action Listener boton 1
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button1.getText());
            }
        });
        //Action Listener boton 0
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonBorrar.setEnabled(true);
                txtSalida.setText(txtSalida.getText()+ button0.getText());
            }
        });

        //Action Listener boton (coma)
        buttonComa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Controlar que el numero ya tenga una coma
                if(!txtSalida.getText().contains(".")){
                    txtSalida.setText(txtSalida.getText() + buttonComa.getText());
                }
            }
        });
        //ActionListener boton sumar
        buttonSuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(txtSalida.getText());
                operation = "+";
                txtSalida.setText("");
            }
        });
        //Action listener boton restar
        buttonResta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(txtSalida.getText());
                operation = "-";
                txtSalida.setText("");
            }
        });
        //Action listener boton multiplicar
        buttonMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(txtSalida.getText());
                operation = "*";
                txtSalida.setText("");
            }
        });
        //Action listener boton dividir

        buttonDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(txtSalida.getText());
                operation = "/";
                txtSalida.setText("");
            }
        });
        //Action listener boton borrar
        buttonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String retroceso = null;
                //Controlar que borre solo si hay algo
                if (txtSalida.getText().length()>0){
                    StringBuilder sb = new StringBuilder(txtSalida.getText());
                    //Borrar el ultimo elemento del texto
                    sb.deleteCharAt(txtSalida.getText().length() - 1);
                    retroceso = String.valueOf(sb);
                    txtSalida.setText(retroceso);
                }
            }
        });
        //Action listener boton igual
        buttonIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(txtSalida.getText());
                buttonBorrar.setEnabled(false);


                switch (operation){
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }

                txtSalida.setText(String.valueOf(result));

                //Para que el resultado salga entero o double
                if(result % 1 == 0){
                    txtSalida.setText(String.valueOf((int) result));
                }else{
                    txtSalida.setText(String.valueOf(result));
                }
            }
        });
    }
    /**
     * Metodo principal para ejecutar la Aplicación de la calculadora
     * Crea una instancia de la calculadora y muestra la
     ventana principal
     *
     * @param args Los argumentos de la linea de comandos
     (no se utilizan en esta aplicación)
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaCalculadora");
        frame.setContentPane(new VentanaCalculadora().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400, 500);
        frame.setResizable(false);
    }
}
