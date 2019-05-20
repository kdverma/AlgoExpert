import java.util.Arrays;
import java.util.HashMap;
public class TwoPairSumV3 {
    public static int[] TwoNumberSum(int[] arr, int sumToBeFound) {
        
		HashMap<Integer,Boolean> nums = new HashMap<>();
		for(int num : arr)
		{
			/*
			x+y = sumToBeFound (or)
			y = sumToBeFound - x (current number under loop)
			scan for y in each loop iteration 
			*/
			int potentialMatch = sumToBeFound - num;
			if(nums.containsKey(potentialMatch))
			{
				System.out.println("mil gaya");
				return potentialMatch > num ?new int[]{num,potentialMatch}:new int[]{potentialMatch,num};
			}
			else
			{
				nums.put(num,true);
			}
		}
		
        return new int[0];
    }


    public static void main(String[] args) {
        int pairSumToBeSerched = 5;
        int[] arr = new int[]{4, 7, 3, 2, -1, -11};
        int[] result = TwoNumberSum(arr,pairSumToBeSerched);
        if (result.length > 0) {
            System.out.println("Pair found : " + result[0] + "," + result[1] + " in array " + Arrays.toString(arr));
        } else {
            System.out.println("desired pair sum " + pairSumToBeSerched + " not found in array " + Arrays.toString(arr));
        }
    }
}