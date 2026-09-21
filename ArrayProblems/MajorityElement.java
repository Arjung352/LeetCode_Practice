class MajorityElement {
    public int majorityElement(int[] nums) {
        // Using hashmap
        HashMap<Integer,Integer>hash=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        for(int key:hash.keySet()){
            if(hash.get(key)>n/2){
                return key;
            }
        }
        return 0;
    }
}