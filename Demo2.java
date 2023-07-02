public class Demo2 {
    public static void main(String[] args) {
        
        // nums[0][0] = 3;
        // nums[0][1] = 9;
        // nums[1][0] = 1;
        // nums[1][1] = 5;
        // nums[2][0] = 8;
        // nums[2][1] = 4;
        int nums [][] =  {
                            {3,9,6,1},
                            {1,5,5,7},
                            {8,4,7,8}
                        };
        for (int i=0; i<=2; i++) 
        {
            for(int j=0; j<nums[i].length; j++) 
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
