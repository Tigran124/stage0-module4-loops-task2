package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive == 1){
            System.out.println(1);
        }else {
            int i = 1;
            while (i <= printToInclusive) {
                int j = 2;
                while (j < i) {
                    if (i % j == 0) {
                        break;
                    }
                    j++;
                }
                if (i == j) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
