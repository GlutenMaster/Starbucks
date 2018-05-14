import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.nio.file.*;

public class Main {
	
	private static JFrame frame;
	private static JTextField inputField;
	private static JTextArea outputField;
	private static JPanel panel;
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		 initFrame();
	}
	private static void addActionListener() {
		inputField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
            	if(e.getKeyCode() == KeyEvent.VK_ENTER) {
            		String input = inputField.getText();
            		ScanCompile scanner = new ScanCompile(Paths.get(input));
                }
            }
        });
	}
	private static void initFrame() {
        frame = new JFrame("The Greatest IDE of all time LoL");

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        //inputField.setFont(new java.awt.Font(Font.MONOSPACED, 2, 24));
        //outputField.setFont(new java.awt.Font(Font.MONOSPACED, 2, 24));
        inputField = new JTextField();
        inputField.setPreferredSize(new Dimension(5000, 500));
        inputField.setBorder(new TitledBorder(""));
        panel.add(inputField);
        outputField = new JTextArea();
        outputField.setBorder(new TitledBorder(""));
        outputField.setPreferredSize(new Dimension(3200, 1800));
        outputField.setEditable(false);
        //outputField.setText("LoL ur bad");
        panel.add(outputField);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.revalidate();
         // font size.
        
        frame.repaint();
        addActionListener();
    }
	public static void print(String text) {
		outputField.setText(outputField.getText() + "\n" + text);
		frame.pack();
		frame.revalidate();
		frame.repaint();
	}
}
