import javax.swing.*;
import java.util.Random;

public class NumberGussing {

    int userNo;
    int attempt = 0;

    public NumberGussing() {
        JOptionPane.showMessageDialog(null, "NOTE :-You Try Only 12 Times OtherWise You Loss The Game", "INFORMATION",
                JOptionPane.INFORMATION_MESSAGE);
        try {
            Random r = new Random();
            int randomNum = r.nextInt(100) + 1;
            while (userNo != randomNum) {
                if (attempt == 12) {

                    JOptionPane.showMessageDialog(null,
                            "You Loss The Game,Because Your Time Is Over,Your Number is " + "(" + randomNum + ")"
                                    + "that is you Can't Find",
                            "LOSS", JOptionPane.CLOSED_OPTION);
                    JOptionPane.showMessageDialog(null, "THANK YOU VISIT AGAIN", "Number Guessing Game",
                            JOptionPane.CLOSED_OPTION);
                    break;

                }
                String s = JOptionPane.showInputDialog(null, "Guessing a Number Between 1-100", "Number Guessing Game",
                        JOptionPane.PLAIN_MESSAGE);
                userNo = Integer.parseInt(s);

                if (userNo > randomNum) {
                    JOptionPane.showMessageDialog(null, "Your Guess Number is too Large,Try Again", "Hints",
                            JOptionPane.PLAIN_MESSAGE);
                    attempt++;
                } else if (userNo < randomNum) {
                    JOptionPane.showMessageDialog(null, "Your Guess Number is Too Small,Try Again", "Hints",
                            JOptionPane.PLAIN_MESSAGE);
                    attempt++;

                } else if (userNo == randomNum) {
                    JOptionPane.showMessageDialog(null, "Congratulation Your Guessing is correct", "Winner",
                            JOptionPane.PLAIN_MESSAGE);
                    attempt++;
                    JOptionPane.showMessageDialog(null, "You Take " + attempt + " Times To Got A Number", "Alert",
                            JOptionPane.INFORMATION_MESSAGE);
                    if (attempt == 1) {
                        JOptionPane.showMessageDialog(null, "Excellent,Your Score is 100 ", "Winner",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                    if (attempt == 2) {
                        JOptionPane.showMessageDialog(null, "Very Good,Your Score is 90", "Winner",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                    if (attempt == 3) {
                        JOptionPane.showMessageDialog(null, "Good,Your Score is 80", "Winner",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                    if (attempt == 4) {
                        JOptionPane.showMessageDialog(null, "Well Try,Your Score is 70", "Winner",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                    if (attempt == 5) {
                        JOptionPane.showMessageDialog(null, "Good Job,Your Score is 60", "Winner",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                    if (attempt == 6) {
                        JOptionPane.showMessageDialog(null, "Better Luck Next Time,Your Score is 50", "Winner",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                    if (attempt == 7) {
                        JOptionPane.showMessageDialog(null, "You Won at Seven Time,Your Score is 40", "Winner",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                    if (attempt == 8) {
                        JOptionPane.showMessageDialog(null, "You Won at Eight Time,Your Score is 30", "Winner",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                    if (attempt == 9) {
                        JOptionPane.showMessageDialog(null, "You Won At Ningth Time,Your Score is 20", "Winner",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                    if (attempt == 10) {
                        JOptionPane.showMessageDialog(null, "You Won at Tenth Time,Very Bad,Your Score is 10", "Winner",
                                JOptionPane.PLAIN_MESSAGE);
                        break;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Your Guessing Number is Incorrect,Please Try Again", "Winner",
                            JOptionPane.ERROR_MESSAGE);
                    attempt++;
                }
            }
            System.exit(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unknow Error Occour,INPUT ONLY NUMBERS", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void main(String[] args) {
        new NumberGussing();
    }

}
