package Notes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel implements ActionListener{
	private JButton btnMenu = new JButton(new ImageIcon("src/Notes/img/menu3.png"));
	private JLabel titulo = new JLabel("Notes");
	public Menu(){
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setBackground(new Color(3,171,244));
		setPreferredSize(new Dimension(444,60));
		
		add(new Espacio(5,60,new Color(3,171,244)));
		
		btnMenu.addActionListener(this);
		btnMenu.setBorder(null);
		add(btnMenu);
		
		//espacio.setPreferredSize(new Dimension(15,60));
		//espacio.setBackground(new Color(3,171,244));
		add(new Espacio(15,60,new Color(3,171,244)));
		
		titulo.setForeground(Color.white);
		titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		add(titulo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Tocaste el btn menu.");
	}
}