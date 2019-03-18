public class DuplicationInArray1 {

    public boolean duplicate(int nums[], int length) {
        if(length <= 0) return false;
        for(int i=0;i<length;i++) {
            if (nums[i] < 0 || nums[i]>=length) {
                return false;
            }
        }

        for(int i=0;i<length;i++) {
            while(nums[i]!=i) {
                if(nums[i] == nums[nums[i]]){
                    return true;
                }
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return false;
    }
}
