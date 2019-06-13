import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GuessingGame extends JFrame
{
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	
	public void checkGuess()
	{
		String guessText = txtGuess.getText();
	}
	
	public GuessingGame() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Miguels' Ho-Lo Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Miguel's Hi-Lo Guessing Game");
		lblTitle.setFont(new Font("Calibri", Font.BOLD, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(12, 30, 408, 28);
		getContentPane().add(lblTitle);
		
		JLabel lblPrompt = new JLabel("Guess a number between 1 and 100:");
		lblPrompt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrompt.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblPrompt.setBounds(47, 89, 248, 28);
		getContentPane().add(lblPrompt);
		
		txtGuess = new JTextField();
		txtGuess.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtGuess.setText("100");
		txtGuess.setHorizontalAlignment(SwingConstants.CENTER);
		txtGuess.setBounds(307, 90, 43, 26);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.setFont(new Font("Calibri", Font.BOLD, 16));
		btnGuess.setBounds(167, 146, 97, 25);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("Enter a number above and click Guess!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("Calibri", Font.PLAIN, 16));
		lblOutput.setBounds(12, 201, 408, 20);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
}
