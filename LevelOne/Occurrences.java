package ClassWork.Assessment.LevelOne;

public class Occurrences {
    public static void main(String[] args) {
        String string = "Mississippi";
        int countS = 0;
        int countI = 0;
        int i = 0;

        while (i < string.length()) {
            char count = string.charAt(i);
            if (count == 's') {
                countS++;
            } else if (count == 'i') {
                countI++;
            }
            i++;
        }

        System.out.println("Number of occurrences of 's': " + countS);
        System.out.println("Number of occurrences of 'i': " + countI);
    }
}


