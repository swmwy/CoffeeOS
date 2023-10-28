import java.time.*;
import java.time.format.*;
import javax.swing.*;

//Make the CoffeeOS home screen

public class mainscreen {
  public getTime() {
    LocalDateTime localTime = LocalDateTime.now();
    DateTimeFormatter timeToUse = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
  }
  public loginOrMakeAccount() {
    Text txt = new Text();
    string greeting = "Welcome to CoffeeOS. Log in or create an account.";
    txt.setText(greeting);
    txt.setX(50);
    txt.setY(50);
  }
}
