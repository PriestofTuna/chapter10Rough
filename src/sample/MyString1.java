package sample;

/**
 * Created by lytte on 7/13/2016.
 */
public class MyString1 {
        char chars[];
    public MyString1(char[] chars) {
        this.chars = chars;
        //initializes chars
    }
    public char charAt(int index) {
        return chars[index];
        //returns a single char
    }
    public int length() {
        return chars.length;
        //returns the Strings length,
    }
    public MyString1 substring(int begin, int end) {
        //returns an array of said chars EG begin --- end
        if(end == chars.length) {
            MyString1 myStringSub = new MyString1(chars);
            return myStringSub;
        }
        int zeLength = end - begin;
        char substring[] = new char[++zeLength];
        //The ++ changes ze length in order to show all required chars
        for (int i = begin; i < end; i++) {
            substring[i] = charAt(i);
            //cycles through substring and uses charAt to find the chars.
    }
        MyString1 myString1Sub = new MyString1(substring);
        return myString1Sub;
    }
    public MyString1 toLowerCase() {
        //returns a lower case version of the String by use the Character class
        char toLowerCase[] = new char[chars.length];
        for(int i = 0; i < chars.length; i++) {
            toLowerCase[i] = Character.toLowerCase(chars[i]);
        }
        chars = toLowerCase; //needed?
        MyString1 myString1toLowerCase = new MyString1(toLowerCase);
        return myString1toLowerCase;
    }
    public boolean equals(MyString1 s) {
        // returns false if a character isn't equal
        for(int i = 0; i < chars.length; i++) {
            if(s.chars[i] != chars[i]) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        //returns an array of ints in Char
        String aChar = new Character((char) i).toString();
        MyString1 myString1Value = new MyString1(aChar.toCharArray());
        return myString1Value;
    }
}