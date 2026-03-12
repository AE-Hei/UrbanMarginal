package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextArea;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EntreeJeu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtlp;
	private Arene laFenetreArene;
	private ChoixJoueur laFenetreChoixJoueur;
	
	private void btnStart_clic() {
		this.laFenetreArene = new Arene();
		this.laFenetreArene.setVisible(true);
		this.dispose();
	}
	
	private void btnConnect_clic() {
		this.laFenetreChoixJoueur = new ChoixJoueur();
		this.laFenetreChoixJoueur.setVisible(true);
		this.dispose();
	}
	
	private void btnExit_clic1() {
		System.exit(0);
	}
	
	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setTitle("Urban Marginal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 159);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtlp = new JTextField();
		txtlp.setText("127.0.0.1");
		txtlp.setBounds(81, 61, 86, 20);
		contentPane.add(txtlp);
		txtlp.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Start a server");
		lblNewLabel.setBounds(10, 11, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Connect an existing server :");
		lblNewLabel_1.setBounds(10, 36, 142, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("IP server :");
		lblNewLabel_2.setBounds(10, 64, 61, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart_clic();
			}
		});
		
		btnStart.setBounds(187, 7, 89, 23);
		contentPane.add(btnStart);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConnect_clic();
				// TODO Auto-generated method stub
				
			}
		});
		btnConnect.setBounds(187, 60, 89, 23);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit_clic1();
			}
		});
		btnExit.setBounds(187, 94, 89, 23);
		contentPane.add(btnExit);

	}

	protected void btnExit_clic() {
		// TODO Auto-generated method stub
		
	}
}
