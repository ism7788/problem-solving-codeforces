import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<=2)
            System.out.println(n);
        else {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        Map<Integer, Integer> result = countOccurrences(array);
            int maxOccurrenceNumber = findMaxOccurrenceNumber(result);

            if(result.get(maxOccurrenceNumber)-result.get(maxOccurrenceNumber+1)==0) {
                System.out.println(n+1);
                return;
            }

            int count=result.get(maxOccurrenceNumber);
      count+=result.get(maxOccurrenceNumber-1);
      count+=result.get(maxOccurrenceNumber+1);
        System.out.println(++count);
    }
    }
//1  1 3  3
    // 2 2 2 2 2
    public static Map<Integer, Integer> countOccurrences(int[] array) {
        // Create a map to store the counts
        Map<Integer, Integer> occurrencesMap = new HashMap<>();

        // Iterate through the array
        for (int num : array) {
            // Update the count in the map
            occurrencesMap.put(num, occurrencesMap.getOrDefault(num, 0) + 1);
        }

        return occurrencesMap;
    }

    public static int findMaxOccurrenceNumber(Map<Integer, Integer> occurrencesMap) {
        int maxOccurrence = 0;
        int numberWithMaxOccurrence = 0;

        // Iterate through the map entries
        for (Map.Entry<Integer, Integer> entry : occurrencesMap.entrySet()) {
            int occurrence = entry.getValue();

            // Update maxOccurrence and numberWithMaxOccurrence if a higher occurrence is found
            if (occurrence > maxOccurrence) {
                maxOccurrence = occurrence;
                numberWithMaxOccurrence = entry.getKey();
            }
        }

        return numberWithMaxOccurrence;
    }
}
