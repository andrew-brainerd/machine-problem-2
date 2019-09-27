package alphabet;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Alphabet Problem\n--------------------");

	    char alpha = 'a';
	    String letterType = "";

	    while (alpha != 'z') {
	        switch(alpha) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y': letterType = "vowel"; break;
                default: letterType = "consonant";
            }

            System.out.println(alpha + " is a " + letterType);

            alpha += 1;
        }
    }
}
