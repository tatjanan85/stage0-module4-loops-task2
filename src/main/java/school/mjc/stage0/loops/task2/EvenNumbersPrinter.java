package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int count = 0;

        while (count <= printTillInclusive) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }
    }
}
