package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class Controller {
    @FXML TextField inputS;
    @FXML TextArea output;
    @FXML TextField inputS2;
    @FXML TextField inputiS;
    @FXML TextField inputiE;
    @FXML
    public void work(ActionEvent actionEvent) {
            String take = inputS.getText();
            String secondTake = inputS2.getText();
            int start = Integer.parseInt(inputiS.getText());
            int end = Integer.parseInt(inputiE.getText());

            char testChar[] = secondTake.toCharArray();
            //testChar is used in myString1Test in order to show an object equal or not
            char chars[] = take.toCharArray();
            int subTest = start;
            //built to test substring
            int subTestEnd = end;
            //tests substring's end statement
            MyString1 myString1 = new MyString1(chars);

            MyString1 equalsString1 = new MyString1(testChar);
            MyString1 equalsString2 = new MyString1(chars);
            //takes in the value from the TextFields
            int val = (int) (myString1.valueOf(5).chars[0]);
            //converts the string char num to int, arbitrary value, not inputed
            MyString1 myString1Test = new MyString1(testChar);
            //this is an alternate object that tests the equals method
            MyString1 passTester = myString1Test.valueOf(5);
            //assigns passTester to myStringTest.valueOf(int). arbitrary 5 given
            MyString1 passTesterSub = myString1.substring(subTest, subTestEnd);
            int out = passTester.chars[0];
            String toStringLowerCase = "";
            String toStringSubString = "";
            //these Strings take in the values for lower case and substring(Convert from char for output)
            for (int i = 0; i < myString1.length(); i++) {
                toStringLowerCase += myString1.toLowerCase().chars[i];
                //loop for lower case
            }
            for (int i = 0; i < passTesterSub.length(); i++) {
                toStringSubString += passTesterSub.chars[i];
                //loop for subString from char to String
            }

            //the below is the output to a TextArea.
            output.setText("value of " + out + "\n" + "Equals? " +
                    equalsString1.equals(equalsString2) + "\n" + "lower Case " +
                    toStringLowerCase + "\n" + "substring " +
                    toStringSubString + "\n" + "length " +
                    myString1.length() + "\n" + "charAt start " +
                    myString1.charAt(start));
            //all of the fields are initialized above, except those not returning Objects.

    }
}
