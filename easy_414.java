public class Solution {
    public int thirdMax(int[] nums) {
        int one=-1,two=-1,three=-1;
        int temp;
        for(int i=0;i<nums.length;i++){
            temp=nums[i];
            
            if(one==temp||two==temp||three==temp) continue;
            
            if(three==-1)
                three=temp;
            else if(two==-1&&three>temp)
            {
                two=three;
                three=temp;
            }
            else if(two==-1&&three<temp)
                two=temp;
            else if(one==-1&&three>temp)
            {
                one=two;
                two=three;
                three=temp;
            }
            else if(one==-1&&two>temp)
            {
                one=two;
                two=temp;
            }
            else if(one==-1&&two<temp)
                one=temp;
            else if(temp>one){
                three=two;
                two=one;
                one=temp;
             }
            else if(temp>two){
                three=two;
                two=temp;
                }
            else if(temp>three)
                three=temp;
        }
        if(two==-1)
            return three;
        else if(one==-1)
            return two;
        else 
            return three;

    }   
}