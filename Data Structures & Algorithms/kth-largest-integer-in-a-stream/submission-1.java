class KthLargest {
    int k;
    int[] nums;
    PriorityQueue<Integer> heap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        heap = new PriorityQueue<>();
        for(int num: nums){
            heap.add(num);
            if(heap.size() > k){
                heap.remove();
            }
        }
    }
    
    public int add(int val) {
        heap.add(val);
        if(heap.size() > k){
            heap.remove();
        }
        return heap.peek();
    }
}
