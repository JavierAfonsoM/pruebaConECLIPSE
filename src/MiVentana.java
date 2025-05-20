import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class MiVentana extends JFrame implements ActionListener{


private static final long serialVersionUID = 1L;
private JPanel contentPane;
private JButton button1;
private JButton button2;
private JButton button3;
private JButton button4;
private JButton button5;
private JButton button6;
private JButton button7;
private JButton button8;
private JButton button9;
private JButton button10;
private JButton button11;
private JButton buttonIgual;
private JButton buttonSuma;
private JButton buttonResta;
private JButton buttonMultipli;
private JButton buttonDivision;
private JButton buttonRaiz;
private JTextField texField_insertadodeDatos;
private JButton buttonlimpiar;
private JLabel label_muestraValores_Arriba;
///////////////////////////////////// A QUI ME DEFINO MIS VARIABLES QUE USARE PARA REALIZAR LAS //OPERACIONES//////////////////
String memoria1="";
String memoria2="";
String signo="";
String muestra_resultado_en_Text;
float resultadoSuma=0;
float resultadoResta=0;
float resultadoMultiplicacion=0;
float resultadoDivision=0;
float resultadoRaiz=0;
float numero1=0;
float numero2=0;





/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
MiVentana frame = new MiVentana();
frame.setVisible(true);
frame.setEnabled(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
* prueba
* dadad
* 
* da
* da
* dd
 * @return 
*/
public void calculadora() {
setResizable(false);
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
setBounds(100, 100, 401, 318);
contentPane = new JPanel();
setContentPane(contentPane);
contentPane.setLayout(null);
setTitle("calculadora");
setLocationRelativeTo(null);///////////////////////////////ESTO ES PARA MOSTRAR LA CALCULADORA EN EL MEDIO DEL //ORDENADOR//////////////////////


texField_insertadodeDatos = new JTextField();
texField_insertadodeDatos.setFont(new Font("Tahoma", Font.BOLD, 14));
texField_insertadodeDatos.setForeground(Color.BLACK);
texField_insertadodeDatos.setBackground(Color.WHITE);
texField_insertadodeDatos.setHorizontalAlignment(SwingConstants.CENTER);
texField_insertadodeDatos.setColumns(10);
texField_insertadodeDatos.setBounds(58, 43, 280, 34);
contentPane.add(texField_insertadodeDatos);

button1 = new JButton("1");
button1.setFont(new Font("Tahoma", Font.BOLD, 13));
button1.addActionListener(this);
button1.setBounds(58, 99, 62, 23);
contentPane.add(button1);


button2 = new JButton("2");
button2.setFont(new Font("Tahoma", Font.BOLD, 13));
button2.addActionListener(this);
button2.setBounds(132, 99, 62, 23);
contentPane.add(button2);

button3 = new JButton("3");
button3.setFont(new Font("Tahoma", Font.BOLD, 13));
button3.addActionListener(this);
button3.setBounds(204, 99, 62, 23);
contentPane.add(button3);

button4 = new JButton("4");
button4.setFont(new Font("Tahoma", Font.BOLD, 13));
button4.addActionListener(this);
button4.setBounds(58, 133, 62, 23);
contentPane.add(button4);

button5 = new JButton("5");
button5.setFont(new Font("Tahoma", Font.BOLD, 13));
button5.addActionListener(this);
button5.setBounds(132, 133, 62, 23);
contentPane.add(button5);

button6 = new JButton("6");
button6.setFont(new Font("Tahoma", Font.BOLD, 13));
button6.addActionListener(this);
button6.setBounds(204, 133, 62, 23);
contentPane.add(button6);

button7 = new JButton("7");
button7.setFont(new Font("Tahoma", Font.BOLD, 13));
button7.addActionListener(this);
button7.setBounds(58, 167, 62, 23);
contentPane.add(button7);

button8 = new JButton("8");
button8.setFont(new Font("Tahoma", Font.BOLD, 13));
button8.addActionListener(this);
button8.setBounds(132, 167, 62, 23);
contentPane.add(button8);

button9 = new JButton("9");
button9.setFont(new Font("Tahoma", Font.BOLD, 13));
button9.addActionListener(this);
button9.setBounds(204, 167, 62, 23);
contentPane.add(button9);

button10 = new JButton("0");
button10.setFont(new Font("Tahoma", Font.BOLD, 13));
button10.addActionListener(this);
button10.setBounds(58, 201, 62, 23);
contentPane.add(button10);

button11 = new JButton(".");
button11.setFont(new Font("Tahoma", Font.BOLD, 14));
button11.setBounds(132, 201, 62, 23);
button11.addActionListener(this);
contentPane.add(button11);

buttonlimpiar = new JButton("C");
buttonlimpiar.setFont(new Font("Tahoma", Font.BOLD, 13));
buttonlimpiar.addActionListener(this);
buttonlimpiar.setBounds(204, 201, 62, 23);
contentPane.add(buttonlimpiar);

buttonIgual = new JButton("=");
buttonIgual.setFont(new Font("Tahoma", Font.BOLD, 17));
buttonIgual.addActionListener(this);
buttonIgual.setBounds(58, 235, 208, 23);
contentPane.add(buttonIgual);

buttonSuma = new JButton("+");
buttonSuma.setFont(new Font("Tahoma", Font.BOLD, 13));
buttonSuma.addActionListener(this);
buttonSuma.setBounds(276, 99, 62, 23);
contentPane.add(buttonSuma);

buttonResta = new JButton("-");
buttonResta.setFont(new Font("Tahoma", Font.BOLD, 18));
buttonResta.addActionListener(this);
buttonResta.setBounds(276, 133, 62, 23);
contentPane.add(buttonResta);

buttonMultipli = new JButton("x");
buttonMultipli.setFont(new Font("Tahoma", Font.BOLD, 13));
buttonMultipli.addActionListener(this);
buttonMultipli.setBounds(276, 167, 62, 23);
contentPane.add(buttonMultipli);

buttonDivision = new JButton("\u00F7");
buttonDivision.setFont(new Font("Tahoma", Font.BOLD, 13));
buttonDivision.addActionListener(this);
buttonDivision.setBounds(276, 201, 62, 23);
contentPane.add(buttonDivision);

buttonRaiz = new JButton("\u221A");
buttonRaiz.setFont(new Font("Tahoma", Font.BOLD, 13));
buttonRaiz.addActionListener(this);
buttonRaiz.setBounds(276, 235, 62, 23);
contentPane.add(buttonRaiz);

label_muestraValores_Arriba = new JLabel("");
label_muestraValores_Arriba.setFont(new Font("Tahoma", Font.BOLD, 9));
label_muestraValores_Arriba.setHorizontalAlignment(SwingConstants.RIGHT);
label_muestraValores_Arriba.setBounds(48, 18, 259, 14);
contentPane.add(label_muestraValores_Arriba);




}

public void actionPerformed(ActionEvent e) {
//DecimalFormat df = new DecimalFormat("0.00");//esto es para que se muestre solo 2 decimales los instancio //tambien arriba


if(((JButton)e.getSource()).equals(button1)){
texField_insertadodeDatos.setText(""+texField_insertadodeDatos.getText()+"1"); //Aqui le digo que ponga el //texto( y a la vez que me consiga lo que hay dentro y le añada la cadena +1)
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText());
}

if(((JButton)e.getSource()).equals(button2)){
texField_insertadodeDatos.setText(""+texField_insertadodeDatos.getText()+"2");
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText());

}
if(((JButton)e.getSource()).equals(button3)){
texField_insertadodeDatos.setText(""+texField_insertadodeDatos.getText()+"3");
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText());
}

if(((JButton)e.getSource()).equals(button4)){
texField_insertadodeDatos.setText(""+texField_insertadodeDatos.getText()+"4");
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText());
}
if(((JButton)e.getSource()).equals(button5)){
texField_insertadodeDatos.setText(""+texField_insertadodeDatos.getText()+"5");
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText());
}
if(((JButton)e.getSource()).equals(button6)){
texField_insertadodeDatos.setText(""+texField_insertadodeDatos.getText()+"6");
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText());
}
if(((JButton)e.getSource()).equals(button7)){
texField_insertadodeDatos.setText(""+texField_insertadodeDatos.getText()+"7");
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText());
}
if(((JButton)e.getSource()).equals(button8)){
texField_insertadodeDatos.setText(""+texField_insertadodeDatos.getText()+"8");
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText());
}
if(((JButton)e.getSource()).equals(button9)){
texField_insertadodeDatos.setText(""+texField_insertadodeDatos.getText()+"9");
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText());
}
if(((JButton)e.getSource()).equals(button10)){
texField_insertadodeDatos.setText(""+texField_insertadodeDatos.getText()+"0");
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText());
}
if(((JButton)e.getSource()).equals(button11)){
texField_insertadodeDatos.setText(""+texField_insertadodeDatos.getText()+".");
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText());
}


////////////////  OPERADORES///////////////////////////////////////////////

if(((JButton)e.getSource()).equals(buttonSuma)){
if(texField_insertadodeDatos.getText().equals("")){////////Aqui hago un control si texField_insertadodeDatos //esta vacio osea ,no se ha pulsado ningun boton

System.runFinalization();//////////////////////////////////// la operacion no hace nada
texField_insertadodeDatos.setText("");//Y establesco el campo vacio para poder meter cadenas(memoria1)

}else{

signo = "Suma";///Aqui me he declarado signo como un String y que si apreto el boton de suma operacion //contendra la cadena "Suma" y asi lo mismo  para los demás operadores.

memoria1 = texField_insertadodeDatos.getText(); ///Aqui agarro el string que contienne la cadena //texField_insertadodeDatos y se lo meto a memoria1

numero1 = Float.parseFloat(memoria1);//Aqui convierto de String de memoria1 a float y se lo meto numero1 //(Aqui  he declarado numero1 como float arriba para poder sumar mas adelante)

label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText()+" +");  ////Aqui he puesto una //label para ver como se esta haciendo la operacion es una copia de texField_insertadodeDatos

texField_insertadodeDatos.setText("");//////establesco el campo vacio para poder meter cadenas (memoria2)

}
}
////////////////////////////////////////////////////////
if(((JButton)e.getSource()).equals(buttonResta)){      
if(texField_insertadodeDatos.getText().equals("")){///Aqui hago un control si textfiledmostrar esta vacio //hacer lo siguiente


System.runFinalization();                               ///Aqui si no hay numero1 la operacion no hace nada
texField_insertadodeDatos.setText("");

}else{

signo = "Resta";
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText()+" -");
memoria1 = texField_insertadodeDatos.getText();
numero1 = Float.parseFloat(memoria1);
texField_insertadodeDatos.setText(""); ///establesco el campo vacio para poder meter cadenas (memoria2)

}
}
//////////////////////////////////////////////////////////////////
if(((JButton)e.getSource()).equals(buttonMultipli)){
if(texField_insertadodeDatos.getText().equals("")){

System.runFinalization();
texField_insertadodeDatos.setText("");

}else{

signo = "Multiplicacion";
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText()+" x");
memoria1 = texField_insertadodeDatos.getText();
numero1 = Float.parseFloat(memoria1);
texField_insertadodeDatos.setText("");

}
}
///////////////////////////////////////////////////////////////////////////
if(((JButton)e.getSource()).equals(buttonDivision)){
if(texField_insertadodeDatos.getText().equals("")){

System.runFinalization();
texField_insertadodeDatos.setText("");

}else{

signo = "Division";
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText()+" /");
memoria1 = texField_insertadodeDatos.getText();
numero1 = Float.parseFloat(memoria1);
texField_insertadodeDatos.setText("");

}
}
//////////////////////////////////////////////////////////////////////////
if(((JButton)e.getSource()).equals(buttonRaiz)){
if(texField_insertadodeDatos.getText().equals("")){

System.runFinalization();
texField_insertadodeDatos.setText("");

}else{

signo = "Raiz";
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText()+" \u221A");
memoria1 = texField_insertadodeDatos.getText();
numero1 = Float.parseFloat(memoria1);
texField_insertadodeDatos.setText("");

}
}
///////////////////////////Ojo el Boton igual ////////////////////////////////////////

if(((JButton)e.getSource()).equals(buttonIgual)){             //cuando aprete el boton igual

operacion();                                                //llamo al metodo operacion

texField_insertadodeDatos.setText(muestra_resultado_en_Text); //muestro el resultado por pantalla

label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText());

signo="Suma";// Aqui pongo que signo es suma este es un truco por si quiero seguir usando el //resultado //obtenido de las operaciones anteriores (de division resta  multi y suma)

numero1=0;// Y limpio mi numero1 y numero2  dejandolos a 0 para poder seguir haciendooperaciones
numero2=0;
}
if(((JButton)e.getSource()).equals(buttonlimpiar)){///Aqui limpio todo para seguir metiendo cadenas

texField_insertadodeDatos.setText("");
label_muestraValores_Arriba.setText(""+texField_insertadodeDatos.getText());


}


}
/////////////AQUI CONSTRUYO UN METODO QUE SE LLAMA OPERACION/////////////////////////////////////
public void operacion(){
if (signo == "Suma"){    // Aqui hago la comparacion y si la cadena contiene "Suma" hacer lo siguiente

memoria2 = texField_insertadodeDatos.getText();///Aqui agarro el string que continene la cadena //texField_insertadodeDatos y se lo meto a memoria2 (nota aqui ya se apreto el boton + la pantalla se quedo //limpia y se volvio a meter cadena)

numero2=Float.parseFloat(memoria2); //Aqui convierto de String de memoria2 a float y se lo meto numero2

resultadoSuma = numero1+numero2;// Aqui le digo que el resultadosSuma= es la suma del numero1 de arriba + //numero2 de abajo

muestra_resultado_en_Text = Float.toString(resultadoSuma);/// Aqui me hago una variable String //muestraresultadoentext esto para poder mostrar en pantalla  y convierto el resultadosuma de float a String

texField_insertadodeDatos.setText(muestra_resultado_en_Text);




}else if(signo == "Resta"){

memoria2 = texField_insertadodeDatos.getText();
numero2=Float.parseFloat(memoria2);
resultadoResta = numero1-numero2;
muestra_resultado_en_Text = Float.toString(resultadoResta);
texField_insertadodeDatos.setText(muestra_resultado_en_Text);




}else if(signo == "Multiplicacion"){

memoria2 = texField_insertadodeDatos.getText();
numero2=Float.parseFloat(memoria2);
resultadoMultiplicacion = numero1*numero2;
muestra_resultado_en_Text = Float.toString(resultadoMultiplicacion);
texField_insertadodeDatos.setText(muestra_resultado_en_Text);





}else if(signo == "Division"){

memoria2 = texField_insertadodeDatos.getText();
numero2=Float.parseFloat(memoria2);
resultadoDivision = numero1/numero2;
muestra_resultado_en_Text = Float.toString(resultadoDivision);
texField_insertadodeDatos.setText(muestra_resultado_en_Text);


}else if (signo == "Raiz"){
//     memoria2 = texFieldmostrar.getText(); /////en este caso no necesito memoria2 por eso la elimino
//     numero2=Float.parseFloat(memoria2);//////// tampoco uso el numero2
resultadoRaiz=(float) (Math.sqrt(numero1)) ;
muestra_resultado_en_Text = Float.toString(resultadoRaiz);
texField_insertadodeDatos.setText(muestra_resultado_en_Text);


}


}



}