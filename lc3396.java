class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);

        while (true) {
            Set<Integer> set = new HashSet<>(list);
            if (set.size() == list.size()) {
                break;
            }
            int toRemove = Math.min(3, list.size());
            for (int i = 0; i < toRemove; i++) {
                list.remove(0);
            }

            count++;
        }
        return count;
}

        


        
    }
