public class Solution {
    public double average(int[] salary) {
        double max = Double.MIN_VALUE,min = Double.MAX_VALUE,sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if(max<salary[i])
                max = salary[i];
            if(min>salary[i])
                min = salary[i];
            sum+=salary[i];
        }
        return 1.0 * (sum - max - min) / (salary.length - 2);
    }
}