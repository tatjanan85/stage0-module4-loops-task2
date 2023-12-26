package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0;
        while (count <= printToInclusive) {
            int multiplier = 2;
            int result = 1;

            while (multiplier <= count) {
                result = result * multiplier;
                multiplier++;
            }

            System.out.println(result);
            count++;
        }
    }
}
