import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class GamePanel extends JPanel implements ActionListener {
   private static final long serialVersionUID = 1L;
   
   int randomNumber = new Random().nextInt(10) + 1;
   int numGuesses = 0;

   JTextField textField = new JTextField(5);
   JButton button = new JButton("Guess");
   JLabel label = new JLabel(numGuesses + " guesses");

   GamePanel() {
       setBackground(Color.WHITE);
       add(textField);
       add(button);
       add(label);
       button.addActionListener(this);
   }

   public void actionPerformed(ActionEvent e) {
       String textFieldText = textField.getText();

       if (Integer.parseInt(textFieldText) 
                                        == randomNumber) {
           button.setEnabled(false);
           textField.setText
                       (textField.getText() + " Yes!");
           textField.setEnabled(false);
       } else {
           textField.setText("");
           textField.requestFocus();
       }
       
       numGuesses++;
       String guessWord = 
           (numGuesses == 1) ? " guess" : " guesses";
       label.setText(numGuesses + guessWord);
   }
}
