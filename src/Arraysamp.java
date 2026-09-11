public class Arraysamp {


    public class Main {

        public static void main(String[] args) {

            int[] arr = {10, 25, 7, 45, 18};

            int largest = arr[0];

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }

            System.out.println("Largest element = " + largest);
        }
    }
}
//-------------------------------------------------------------------------------------------------------

//  Question 2

//    public class Main {
//
//        public static void (String[] args) {
//
//            int[] arr = {10, 25, 7, 45, 18};
//
//            int smallest = arr[0];
//
//            for (int i = 1; i < arr.length; i++) {
//
//                if (arr[i] < smallest) {
//                    smallest = arr[i];
//                }
//            }
//
//            System.out.println("Smallest element = " + smallest);
//        }
//    }
//}
//---------------------------------------------------------------------------------------------------------

//       Question no 3


//    public class Main {
//
//        public static void (String[] args) {
//
//            int[] arr = {10, 20, 30, 40, 50};
//
//            int sum = 0;
//
//            for (int i = 0; i < arr.length; i++) {
//                sum = sum + arr[i];
//            }
//
//            double average = (double) sum / arr.length;
//
//            System.out.println("Sum = " + sum);
//            System.out.println("Average = " + average);
//        }
//    }
//}
//--------------------------------------------------------------------------------------------------------------


// Question 4


//    public class Main {
//
//        public static void (String[] args) {
//
//            int[] arr = {10, 15, 20, 7, 8, 13};
//
//            int evenCount = 0;
//            int oddCount = 0;
//
//            for (int i = 0; i < arr.length; i++) {
//
//                if (arr[i] % 2 == 0) {
//                    evenCount++;
//                } else {
//                    oddCount++;
//                }
//            }
//
//            System.out.println("Even elements = " + evenCount);
//            System.out.println("Odd elements = " + oddCount);
//        }
//    }
//}
//---------------------------------------------------------------------------------------------------------

//  Question no 5

//    public class Main {
//
//        public static void (String[] args) {
//
//            int[] arr = {10, 20, 30, 40, 50};
//
//            int start = 0;
//            int end = arr.length - 1;
//
//            while (start < end) {
//
//                // Swap
//                int temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//
//                start++;
//                end--;
//            }
//
//            // Print reversed array
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//}
//--------------------------------------------------------------------------------------------------------

//Question no 6


//    public class Main {
//
//        public static void (String[] args) {
//
//            int[] arr = {10, 25, 7, 45, 18};
//
//            int largest = arr[0];
//            int secondLargest = arr[0];
//
//            for (int i = 1; i < arr.length; i++) {
//
//                if (arr[i] > largest) {
//                    secondLargest = largest;
//                    largest = arr[i];
//                } else if (arr[i] > secondLargest && arr[i] != largest) {
//                    secondLargest = arr[i];
//                }
//            }
//
//            System.out.println("Second largest = " + secondLargest);
//        }
//    }
//}
//
//-----------------------------------------------------------------------------------------------------------

//Question no 7

//
//
//    public class Main {
//
//        public static void (String[] args) {
//
//            int[] arr = {10, 20, 30, 40, 50};
//
//            int target = 30;
//            boolean found = false;
//
//            for (int i = 0; i < arr.length; i++) {
//
//                if (arr[i] == target) {
//                    System.out.println("Element found at index " + i);
//                    found = true;
//                    break;
//                }
//            }
//
//            if (!found) {
//                System.out.println("Element not found");
//            }
//        }
//    }
//}
//---------------------------------------------------------------------------------------------------------

//Question no 8


    class main {
        public static void main(String[] args) {

            int[] arr = {10, 20, 10, 30, 10, 40, 20};

            int target = 10;
            int count = 0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == target) {
                    count++;
                }
            }

            System.out.println("10 occurs " + count + " times");
        }
    }

//--------------------------------------------------------------------------------------------------------

//Question no 8

    class XYZ{

public static void main(String[] args) {

    int[] arr = {10, 20, 30, 10, 40, 20, 50};

    for (int i = 0; i < arr.length; i++) {

        for (int j = i + 1; j < arr.length; j++) {

            if (arr[i] == arr[j]) {
                System.out.println("Duplicate = " + arr[i]);
            }
        }
    }
}
             }
//          }
//      }
//-------------------------------------------------------------------------------------------------------------

//Question no 9

    class Main {
        public static void main(String[] args) {

            int[] arr1 = {10, 20, 30};
            int[] arr2 = {40, 50, 60};

            int[] merged = new int[arr1.length + arr2.length];

            // Copy first array
            for (int i = 0; i < arr1.length; i++) {
                merged[i] = arr1[i];
            }

            // Copy second array
            for (int i = 0; i < arr2.length; i++) {
                merged[arr1.length + i] = arr2[i];
            }

            // Display merged array
            for (int i = 0; i < merged.length; i++) {
                System.out.print(merged[i] + " ");
            }
        }
    }
