import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int speedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> speed = IntStream.range(0, speedCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).map(String::trim).map(Integer::parseInt).collect(Collectors.toList());

        int pos = Integer.parseInt(bufferedReader.readLine().trim());

        int result = collision(speed, pos);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static int collision(List<Integer> speed, int pos) {
        int count = 0;
        int targetSpeed = speed.get(pos);
        
        // Loop through all particles to the left of the particle at index pos
        for (int i = 0; i < pos; i++) {
            if (speed.get(i) > targetSpeed) {
                count += 1;
            }
        }
        
        // Loop through all particles to the right of the particle at index pos
        for (int i = pos + 1; i < speed.size(); i++) {
            if (speed.get(i) < targetSpeed) {
                count += 1;
            }
        }
        
        return count;
    }
}