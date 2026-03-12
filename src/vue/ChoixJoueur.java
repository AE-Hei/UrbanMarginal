package vue;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChoixJoueur extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private Arene laFenetreArene;
	
	private void lblPrecedent_clic() {
		System.out.println("précédent");
	}
	
	private void lblSuivant_clic() {
		System.out.println("suivant");
	}
	
	private void lblGo_clic() {
		this.laFenetreArene = new Arene();
		this.laFenetreArene.setVisible(true);
		this.dispose();
	}

	/**
	 * Create the frame.
	 */
	public ChoixJoueur() {
		setTitle("Choice");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setPreferredSize(new Dimension(400, 275));
		this.pack();
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(141, 244, 121, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPrecedent = new JLabel("");
		lblPrecedent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblPrecedent_clic();
			}
		});
		lblPrecedent.setBounds(65, 146, 29, 40);
		contentPane.add(lblPrecedent);
		
		JLabel lblSuivant = new JLabel("");
		lblSuivant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblSuivant_clic();
			}
		});
		lblSuivant.setBounds(299, 146, 29, 40);
		contentPane.add(lblSuivant);
		
		JLabel lblGo = new JLabel("");
		lblGo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				lblGo_clic();
			}
		});
		lblGo.setBounds(309, 197, 65, 67);
		contentPane.add(lblGo);
		
		JLabel lblFond = new JLabel("");
		String chemin = "fonds/fondchoix.jpg";
		String resource = getClass().getClassLoader().getResource(chemin).getPath();
		lblFond.setIcon(new ImageIcon(resource));
		lblFond.setBounds(0, 0, 400, 275);
		contentPane.add(lblFond);

	}

}
