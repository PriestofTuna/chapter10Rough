package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class Controller {
    @FXML TextField input;
    @FXML TextArea output;
    @FXML
    public void work(ActionEvent actionEvent) {
        String take = input.getText();
        char testChar[] = {'q', 'a', '9', 'u'};
        //testChar is used in myString1Test in order to show an object as equal yea or nay
        char chars[] = take.toCharArray();
        int subTest = 0;
        //built to test substring at 0 as start
        int subTestEnd = take.length() / 2;
        //tests substring's end statement by pulling a .length of the input and lowering it by any amount
        //
        MyString1 myString1 = new MyString1(chars);
        //takes in the value from the TextField
        int val = (int)(myString1.valueOf(5).chars[0]);
        //converts the string char num to int.
        MyString1 myString1Test = new MyString1(testChar);
        //this is an alternate object that tests the equals method
        MyString1 passTester = myString1Test.valueOf(5);
        //assigns passTester to myStringTest.valueOf(int). arbitrary 5 given
        MyString1 passTesterSub = myString1.substring(subTest, subTestEnd);
        int out = passTester.chars[0];
        String toStringLowerCase ="";
        String toStringSubString = "";
        //these Strings take in the values for lower case and substring(Convert from char for output)
        for(int i = 0; i < myString1.length(); i++) {
            toStringLowerCase += myString1.toLowerCase().chars[i];
            //loop for lower case
        }
        for(int i = 0; i < passTesterSub.length(); i++) {
            toStringSubString += passTesterSub.chars[i];
            //loop for subString from char to String
        }

        //the below is the output to a TextArea.
        output.setText("value of " + out + "\n" + "Equals? " +
                myString1.equals(myString1Test) + "\n" + "lower Case " +
                toStringLowerCase + "\n" + "substring " +
                toStringSubString + "\n" + "length " +
                myString1.length() + "\n" + "charAt " +
                myString1.charAt(1));
        //all of the fields are initialized above, except those not returning Objects.

    }
}
