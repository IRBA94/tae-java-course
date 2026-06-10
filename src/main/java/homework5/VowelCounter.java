package homework5;

public class VowelCounter {
    public static int countVowels(String s) {
        int count = 0;
        String vowels = "";

        for (int i = 0; i < s.length(); i++) {
            char letter = Character.toLowerCase(s.charAt(i));
            switch (letter) {
                case 'a':
                    case 'e':
                        case 'i':
                            case 'o':
                                case 'u':
                                    vowels += letter + ", ";
                                    count++;
                                    break;
                default:
                                break;

            }
        }
        System.out.println(count + " (" + vowels + ")"); //ხმოვნებიც რომ დაიბეჭდოს, პრინტი შემოვიტანე მეთოდში
        return count;
    }

    public static void main(String[] args) {
       countVowels("Irakli"); //აქ არ ვბეჭდავ, მეთოდს გადავცემ პარამეტრს
    }
}
