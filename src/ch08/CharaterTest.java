package ch08;

public class CharaterTest {

    public static void main(String[] args) {
        char ch1 = 'A';
        System.err.println(ch1);
        System.err.println((int)ch1);

        char ch2 = 66;
        System.err.println(ch2);
        System.err.println((char)ch2);

        int ch3 = 67;
        System.err.println(ch3);
        System.err.println((char)ch3);

        char han = '한';
        char ch = '\uD55C';

        System.err.println(han);
        System.err.println(ch);

    }

}
