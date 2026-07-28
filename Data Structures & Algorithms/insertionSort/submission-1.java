// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> newPairs = new ArrayList<>();
        if (pairs.isEmpty()) {
            //newPairs.add(new ArrayList<>(pairs));
            return newPairs;
        }
        newPairs.add(new ArrayList<>(pairs));
        for (int i = 1; i < pairs.size(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (pairs.get(j).key > pairs.get(j + 1).key) {
                    Collections.swap(pairs, j, j + 1);
                } else {
                    break;
                }
            }
            newPairs.add(new ArrayList<>(pairs));
        }

        return newPairs;
    }
}
