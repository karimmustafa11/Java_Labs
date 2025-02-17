import java.util.StringTokenizer;


class index1 {


public static void main (String[] args) {

 String str = "ITI develops people and ITI house of developers and ITI for people";

    String substring = "ITI";

       StringTokenizer tokenizer = new StringTokenizer(str, substring);

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken().trim());
        }
    }

}