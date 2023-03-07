
import javax.swing.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Calculadora extends JFrame implements ActionListener{
    
    private JTextField text1, text2;
    private JButton button1, button2, button3, button4, button5, button6;
    private JLabel label1, label2, label3;
 
    public Calculadora(){
        setLayout(null);
       
        button1 = new JButton ("+");
        button1.setBounds(180,10,50,30);
        add(button1);
        button1.addActionListener(this);        
        button2 = new JButton ("-");
        button2.setBounds(180,40,50,30);
        add(button2);
        button2.addActionListener(this);
        button3 = new JButton ("x");
        button3.setBounds(180,70,50,30);
        add(button3);
        button3.addActionListener(this);
        button4 = new JButton ("/");
        button4.setBounds(180,100,50,30);
        add(button4);
        button4.addActionListener(this);
        button5 = new JButton ("Clear");
        button5.setBounds(180,130,100,30);
        add(button5);
        button5.addActionListener(this);
	button6 = new JButton ("Pulsame");
        button6.setBounds(180,170,50,30);
        add(button6);
        button6.addActionListener(this);
        
        
        label1 = new JLabel(" Valor 1");
        label1.setBounds(20,5,100,30);
        add(label1);
        label2 = new JLabel(" Valor 2");
        label2.setBounds(20,35,100,30);
        add(label2);
        label3 = new JLabel("Resultado: ");
        label3.setBounds(10,80,100,30);
        add(label3);
        
        text1 = new JTextField();
        text1.setBounds(90,10,50,20);
        add(text1);
        text2 = new JTextField();
        text2.setBounds(90,40,50,20);
        add(text2);
      }   
           @Override      
            public void actionPerformed(ActionEvent event) {
            if(event.getSource()== button1){
               int valor1=0,valor2=0, resultado=0;
               valor1=Integer.parseInt(text1.getText());
               valor2=Integer.parseInt(text2.getText());
               resultado= valor1+valor2;
               label3.setText("Resultado: "+resultado);
            }
             if(event.getSource()== button2){
               int valor1=0,valor2=0, resultado=0;
               valor1=Integer.parseInt(text1.getText());
               valor2=Integer.parseInt(text2.getText());
               resultado= valor1-valor2;
               label3.setText("Resultado: "+resultado);
            }
              if(event.getSource()== button3){
               int valor1=0,valor2=0, resultado=0;
               valor1=Integer.parseInt(text1.getText());
               valor2=Integer.parseInt(text2.getText());
               resultado= valor1*valor2;
               label3.setText("Resultado: "+resultado);
            }
               if(event.getSource()== button4){
               float valor1=0,valor2=0, resultado=0;
               valor1=Float.parseFloat(text1.getText());
               valor2=Float.parseFloat(text2.getText());
               resultado= valor1/valor2;
               label3.setText("Resultado: "+resultado);
            }
               if(event.getSource()== button5){
               text1.setText("");
               text2.setText("");
               label3.setText("Resultado: ");
            }
               Sonido repro=new Sonido();
               if(event.getSource() == button6){
            repro.ReproducirSonido("C:\\Users\\57317\\Downloads\\Java\\Hilos\\Me.wav");
               }
        }
    }