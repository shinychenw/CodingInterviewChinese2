public class DuplicationInArray2 {

    public int duplicate(int nums[], int length) {
        if(length <= 0) return -1;
        for(int i=0;i<length;i++) {
            if (nums[i] < 1 || nums[i]>length-1) {
                return -1;
            }
        }
        int start = 1, end = length-1;
        while(start<=end){
            int middle = start+(end-start)/2;
            int count = countRange(nums, length, start, middle);
            if(start == end){
                if(count>1) return start;
                else break;
            }
            if(count>middle-start+1){
                end = middle;
            }
            else
                start = middle + 1;
        }
        return -1;
    }

    public int countRange(int[] nums, int length, int start, int middle) {
        int count = 0;
        for(int i=0;i<length;i++){
            if(nums[i]>=start && nums[i]<=middle){
                count++;
            }
        }
        return count;
    }
}
