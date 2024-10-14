package Main;

import ej01.Calculo;
import ej02.Carro;
import ej03.Caracteres;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public static JFrame frame;
    public static JButton[] botones;

    public static void main(String[] args) {
      
        String titulo = "Lab02: Algoritmos de ordenamiento";

       
        String opciones[] = {"Programa 1 de calculo", "Programa 2 linea de caracteres","Metodos de ordenamiento","Empresa de carros"};

        final int numop = opciones.length;

        
        frame = new JFrame(titulo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 50 * numop);
        frame.setLayout(new BorderLayout());

        
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(numop, 1)); 

        
        botones = new JButton[numop];


