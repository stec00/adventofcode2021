import java.util.*;

public class Fish2 {
    public static void main(String[] args) {
        List<Integer> fishes = new ArrayList<>(Arrays.asList(1,3,4,1,1,1,1,1,1,1,1,2,2,1,4,2,4,1,1,1,1,1,5,4,1,1,2,1,1,1,1,4,1,1,1,4,4,1,1,1,1,1,1,1,2,4,1,3,1,1,2,1,2,1,1,4,1,1,1,4,3,1,3,1,5,1,1,3,4,1,1,1,3,1,1,1,1,1,1,1,1,1,1,1,1,1,5,2,5,5,3,2,1,5,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,5,1,1,1,1,5,1,1,1,1,1,4,1,1,1,1,1,3,1,1,1,1,1,1,1,1,1,1,1,3,1,2,4,1,5,5,1,1,5,3,4,4,4,1,1,1,2,1,1,1,1,1,1,2,1,1,1,1,1,1,5,3,1,4,1,1,2,2,1,2,2,5,1,1,1,2,1,1,1,1,3,4,5,1,2,1,1,1,1,1,5,2,1,1,1,1,1,1,5,1,1,1,1,1,1,1,5,1,4,1,5,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,5,4,5,1,1,1,1,1,1,1,5,1,1,3,1,1,1,3,1,4,2,1,5,1,3,5,5,2,1,3,1,1,1,1,1,3,1,3,1,1,2,4,3,1,4,2,2,1,1,1,1,1,1,1,5,2,1,1,1,2));

        Map<Integer, Long> fishMap = new HashMap<>();
        for (Integer fish : fishes) {
            Long curVal = fishMap.get(fish);
            fishMap.put(fish, curVal == null ? 1 : curVal + 1);
        }

        for (int day = 0; day < 256; day++) {
            Map<Integer, Long> newFishMap = new HashMap<>();
            Long fishToAdd = 0L;
            for(Map.Entry<Integer, Long> entry : fishMap.entrySet()) {
                Integer key = entry.getKey();
                Long value = entry.getValue();

                key--;
                if (key < 0) {
                    key = 6;
                    fishToAdd = value;
                }

                Long curVal = newFishMap.get(key);
                newFishMap.put(key, curVal == null ? value : value + curVal);
            }

            // Add new fishes
            if (fishToAdd > 0) {
                newFishMap.put(8, fishToAdd);
            }

            fishMap = newFishMap;
        }

        long total = 0;
        for (Long value : fishMap.values()) {
            total += value;
        }

        System.out.println("Answer: " + total);
    }
}