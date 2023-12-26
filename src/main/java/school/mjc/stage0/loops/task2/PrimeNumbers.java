package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 2;
        while (count <= printToInclusive) {
            int divider = 2;
            boolean prime = true;

            while (divider < count) {
                if (count % divider == 0) {
                    prime = false;
                }
                divider++;
            }

            if (prime) {
                System.out.println(count);
            }

            count++;
        }
    }
}
