import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame
{
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	
	public void checkGuess()
	{
		String guessText = txtGuess.getText();
		String message = "";
		int guess = Integer.parseInt(guessText);
		if (guess < theNumber)
		{
			message = guess + " is too low. Try again.";
		}
		else if (guess > theNumber)
		{
			message = guess + " is too high. Try again.";
		}
		else
		{
			message = guess + " is correct. You win! Let's play again!";
			newGame();
		}
		lblOutput.setText(message);
		txtGuess.requestFocus();
		txtGuess.selectAll();
	}
	
	public void newGame()
	{
		this.theNumber = (int)(Math.random() * 100 + 1);
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
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		txtGuess.setFont(new Font("Calibri", Font.PLAIN, 16));
		txtGuess.setText("100");
		txtGuess.setHorizontalAlignment(SwingConstants.CENTER);
		txtGuess.setBounds(307, 90, 43, 26);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkGuess();
			}
		});
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
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450,300));
		theGame.setVisible(true);
	}
}
