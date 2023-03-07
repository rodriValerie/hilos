
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
public class Principal {
       public static void main(String[] Dar10){
        Calculadora calcu=new Calculadora();
	Sonido repro= new Sonido();
        calcu.setBounds(0,0,400,330);
        calcu.setVisible(true);
        calcu.setResizable(false);
        calcu.setLocationRelativeTo(null);
    }
}