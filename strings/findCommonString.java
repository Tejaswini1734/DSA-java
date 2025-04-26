import java.util.*;

class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String, Integer> responseCnt = new HashMap<>();

        for (List<String> eachDayResponses : responses) {
            Set<String> unique = new HashSet<>(eachDayResponses);
            for (String response : unique) {
                responseCnt.put(response, responseCnt.getOrDefault(response, 0) + 1);
            }
        }

        String mostCommon = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : responseCnt.entrySet()) {
            String response = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount || (count == maxCount && response.compareTo(mostCommon) < 0)) {
                mostCommon = response;
                maxCount = count;
            }
        }

        return mostCommon;
    }
}
