package ClassWork;

public class CalculateValueOfPi {
    public static void main(String[] args) {
        CalculatePiValue();
    }
    public static void CalculatePiValue() {
        double pi = 0;
        int count = 1;
        double denominator = 1;

        for (int i = 1; i <= 137059; i += 1) {
            if (count % 2 == 0){
                pi -= 4 / denominator;
                count ++;
                denominator += 2;
            }
            else if (count % 2 == 1) {
                pi += 4 / denominator;
                count ++;
                denominator += 2;
            }
            System.out.println(i + "\t" + pi);
        }
    }
}