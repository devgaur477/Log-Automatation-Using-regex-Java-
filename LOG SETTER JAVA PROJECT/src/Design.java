import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.jar.JarFile;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Design extends JFrame {

	/**
	 * Launch the application.
	 */
	Excel c = new Excel();
	FinalExcel f = new FinalExcel();
	//Filechooser file = new Filechooser();
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Design frame = new Design();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Design() {
		setTitle("LOG CONVERTOR ");
		addHierarchyBoundsListener(new HierarchyBoundsAdapter() {
			@Override
			public void ancestorMoved(HierarchyEvent e) {
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setSize(800, 800);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblLogConvertor = new JLabel("Convertor\r\n");
		lblLogConvertor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblLogConvertor.setBounds(5, 10, 113, 44);
		
		panel.add(lblLogConvertor);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(5, 186, 426, 72);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					f.NewConvertor();
					//c.Convertor();
					//c.Convertor();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		panel.add(btnStart);
		
		JButton btnUpload = new JButton("upload ");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Filechooser file = new Filechooser();
//				
//				try {
//					file.pickme();
//				} catch (FileNotFoundException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				
			
				
			}
		});
		btnUpload.setBounds(150, 26, 85, 66);
		panel.add(btnUpload);
	}
}
