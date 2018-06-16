package main;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.nio.file.*;

public class Main {
	
	private static JFrame frame;
	private static JTextField inputField;
	private static JTextArea outputField;
	private static JPanel panel;
	static ScanCompile test = new ScanCompile("");
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		 initFrame();
	}
	private static void addActionListener() {
		inputField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
            	if(e.getKeyCode() == KeyEvent.VK_ENTER) {
            		String line = inputField.getText();
            		//ScanCompile scanner = new ScanCompile((input));
            		test.parseLine(line);
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
        
        String FONT = "Dialog";
        
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        inputField = new JTextField();
        inputField.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 50) );
        inputField.setPreferredSize(new Dimension(5000, 500));
        inputField.setBorder(new TitledBorder(""));
        panel.add(inputField);
        outputField = new JTextArea();
        outputField.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 50));
        outputField.setBorder(new TitledBorder(""));
        outputField.setPreferredSize(new Dimension(3200, 1800));
        outputField.setEditable(false);
        panel.add(outputField);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.revalidate();
        frame.repaint();
        addActionListener();
    }
	public static void print(String text) {
		outputField.setText(outputField.getText() + "\n" + text + "\n");
		frame.pack();
		frame.revalidate();
		frame.repaint();
	}
	public static void linePrint(String text) {
		outputField.setText(outputField.getText() + text);
		frame.pack();
		frame.revalidate();
		frame.repaint();
	}
}
