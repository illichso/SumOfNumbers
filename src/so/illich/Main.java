package so.illich;

public class Main {

    public static void main(String[] args) {
        int inputArray[] = {1, 2, 3, 4, 5};
        int valueToCompare = 6;
//        int inputArray[] = {1, 3, 4, 5, 6, 7, 9, 10, 11, 12, 14, 15, 101};
//        int valueToCompare = 12;
        int result[][] = new int[(inputArray.length / 2)][2];
        int resultArrayIndex = 0;


        for (int currentIndex = 0; currentIndex < inputArray.length; currentIndex++) {
            if (inputArray[currentIndex] > valueToCompare) {
                break;
            }
            int lowIndex = currentIndex;
            int highIndex = inputArray.length - 1;
            while (lowIndex <= highIndex) {
                int middleIndex = (lowIndex + highIndex) / 2;
                if(middleIndex == currentIndex){
                    currentIndex = inputArray.length;
                    break;
                }
                if (inputArray[currentIndex] + inputArray[middleIndex] < valueToCompare) {
                    lowIndex = middleIndex + 1;
                } else if (inputArray[currentIndex] + inputArray[middleIndex] > valueToCompare) {
                    highIndex = middleIndex - 1;
                } else if (inputArray[currentIndex] + inputArray[middleIndex] == valueToCompare) {
                    result[resultArrayIndex][0] = currentIndex;
                    result[resultArrayIndex][1] = middleIndex;
                    resultArrayIndex++;
                    break;
                }
            }
        }
        System.out.println("For value [" + valueToCompare + "] indexes are:");
        for (int i = 0; i < resultArrayIndex; i++) {
            System.out.println("" + result[i][0] + ":" + result[i][1]);
        }
    }
}
