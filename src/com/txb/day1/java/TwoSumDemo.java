package com.txb.day1.java;
/**
 * ����һ���������飬�����������ֵ�������ʹ������ӵ��ض�Ŀ��
 * @author 13125
 * @time 2019.3.21
 */
public class  TwoSumDemo {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        
        for(i=0; i<nums.length; i++){
            for(j=i+1; j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    if(i!=j){  
                        return new int[] { i, j };
                    }else{
                        ;
                    }
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
