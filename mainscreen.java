import java.time.*;
import java.time.format.*;
import javax.swing.*;

//Make the CoffeeOS home screen

public class mainscreen extends JFrame implements ActionListener {

  public coffeeosFrame = new JFrame("CoffeeOS V.1.0.0(Alpha)");
  public getTime() {
    //Find the time to display on the screen
    LocalDateTime localTime = LocalDateTime.now();
    DateTimeFormatter timeToUse = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
  }
  public loginOrMakeAccount() {
    //Make CoffeeOS prompt you to login or sign in
    Text txt = new Text();
    string greeting = "Welcome to CoffeeOS. Log in or create an account.";
    txt.setText(greeting);
    txt.setX(50);
    txt.setY(50);
    submitButton = new JButton("Continue");
    error1 = new JLabel("Please enter text");
    error2 = new JLabel("Please enter again, the password and/or username is incorrect");
    username = new JTextField(16);
    password = new JTextField(16);
    
  }
}
