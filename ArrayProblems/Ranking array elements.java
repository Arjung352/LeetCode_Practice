class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // what we can do is copy the elements in a new array then sort it
        int newArr[]= arr.clone();
        Arrays.sort(newArr);
        HashMap<Integer,Integer>rank=new HashMap<>();
        int currRank=1;
        for(int num:newArr){
            if(!rank.containsKey(num)){
                rank.put(num,currRank++);
            }
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=rank.get(arr[i]);
        }
        return arr;
    }
}
/*
{
    rank hashmap would be like this

    Rank:
    10:1,
    20:2,
    30:3,
    40:4,
}
*/