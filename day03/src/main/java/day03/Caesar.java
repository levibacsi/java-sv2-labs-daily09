package day03;

import java.util.Arrays;

public class Caesar extends Encryption {

    private int offset;

    public Caesar(int offset) {
        if (offset < 0) {
            throw new IllegalArgumentException("Offset must be positive");
        } else {
            this.offset = offset;
        }
    }

    @Override
    public String encrypts(String input) {
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char c: chars){
            if ((c >= 97 && c <= 122-offset) || (c >= 65 && c <= 90-offset)) {
                c += offset;
            }
            else if (c >= 122-offset && c <= 122){
                c = (char) (96 + offset - (122 - c));
            }

            else if (c >= 90-offset && c <= 90){
                c = (char) (64 + offset - (90 - c));
            }

            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Caesar caesar = new Caesar(13);


        System.out.println(Character.hashCode('a'));
        System.out.println(Character.hashCode('z'));
        System.out.println(Character.hashCode('u'));
        System.out.println(Character.hashCode('A'));
        System.out.println(Character.hashCode('Z'));
        System.out.println(Character.hashCode('U'));
        System.out.println(Character.hashCode(' '));

        System.out.println(caesar.encrypts("abcde uvwxy z"));
        System.out.println(caesar.encrypts("ABCDE UVWXY Z"));
    }
}
