
/**

Problem link : https://leetcode.com/problems/two-sum/ 

**/

import java.io.*;

public class TwoSum
{
	public static void main(String []args)throws IOException
	{
		TwoSum two = new TwoSum();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the array size : ");

		int nums[] = new int[Integer.parseInt(br.readLine())];
		
		for (int i=0;i<nums.length;i++)
		{
			nums[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("Enter the target : ");

		int target = Integer.parseInt(br.readLine());
		int [] res = two.targetSum(nums,target);

		System.out.println("The indeces are "+res[0]+" and "+res[1]);
	}

	static int[] targetSum(int []nums, int target)
	{
		int []result = new int[2];

		for (int i=0;i<nums.length-1;i++)
		{
			for (int j=i+1;j<nums.length;j++)
			{
				if (nums[i] + nums[j] == target)
				{
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}
}