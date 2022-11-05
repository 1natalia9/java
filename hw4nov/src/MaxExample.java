public class MaxExample {
    public static void main (String args[]){
        int array[] = new int[]{12, 1, 32, 90, 10, 11, 30, 49, 33, 34, 27, 7, 21};

        int max = getMax(array);
        System.out.println("Maximum Value is: "+max);


    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }

}
