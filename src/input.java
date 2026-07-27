//import java.util.Scanner;
//
//public class input {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the Number");
//        int number = scan.nextInt();
//
//        int num = 5;
//
//        if (num > 0) {
//            System.out.println("Positive");
//
//        } else if (num < 0) {
//
//            System.out.println("Negative");
//
//        } else {
//
//
//            System.out.println("The Number is Zero");
//
//        }
//    }
//}
//


//import java.util.Scanner;
//
//   public class input {
//       public static void main(String[] args) {
//
//           Scanner sc = new Scanner(System.in);
//           System.out.println("Enter total Amount:");
//
//           double amount = sc.nextDouble();
//
//           if (amount >= 100) {
//               System.out.println("Shipping is Free");
//
//           } else {
//               if (amount >= 50) {
//                   System.out.println("Shipping cost $5");
//
//               } else {
//                   System.out.println("Shipping cost is $10");
//               }
//               sc.close();
//           }
//       }
//   }
//

//              import java.util.Scanner;
//             public class input {
//                 public static void main(String [] args) {
//
//                     Scanner scan = new Scanner(System.in);
//                     System.out.println("Enter Genre Code");
//                     int code = scan.nextInt();
//
//                     switch (code) {
//                         case 1:
//                             System.out.println("Genre: Action");
//                             break;
//
//                         case 2:
//                             System.out.println("Genre: Comedy");
//                             break;
//
//                         case 3:
//                             System.out.println("Genre: Drama");
//                             break;
//
//                         default:
//                             System.out.println("Invalid genre code");
//
//                     }
//                     scan.close();
//
//                 }



//                  import java.util.Scanner;
//              class input {
//                  public static void main(String [] args) {
//
//                      Scanner sc = new Scanner(System.in);
//                      System.out.print("Enter Age");
//                      int age = sc.nextInt();
//
//                      System.out.println("Do you have Driving license? (true/false)");
//                      boolean license = sc.nextBoolean();
//
//                      if (age > 18 && license) {
//                          System.out.println("Eligible for Drive");
//
//                      } else {
//                          System.out.println("Not Eligible for Driving");
//                      }
//
//                      sc.close();
//                  }
//
//
//                      }



//                    import java.util.Scanner;
//                   class input {
//                       public static void main(String[] args) {
//
//                           Scanner sc = new Scanner(System.in);
//
//                           System.out.print("Enter Product Category(1-Electronics, 2-Clothing);");
//
//                           int category = sc.nextInt();
//
//                           double price = 0;
//
//
//                           if (category == 1) {
//                               price = 1000;
//
//                               System.out.print("Eligible for Discount? (true/false):");
//                               boolean discount = sc.nextBoolean();
//
//                               if (discount) {
//                                   price = price - (price * 0.10);
//
//
//                               } else if (category == 2) {
//                                   price = 500;
//
//                                   System.out.print("Eligible for Discount? (true/false):");
//                                   boolean Discount = sc.nextBoolean();
//
//                                   if (discount) {
//                                       price = price - (price * 0.20);
//                                   }
//
//                               } else {
//                                   System.out.println("Invalid Category");
//                                   return;
//                               }
//
//                               System.out.println("Final Price:"+ price);
//                           }
//                               sc.close();
//                           }
//                       }




//                    import java.util.Scanner;
//            class input {
//                public static void main(String [] args) {
//
//                    Scanner sc = new Scanner(System.in);
//
//                    System.out.print("Enter Marks:");
//                    int marks =sc.nextInt();
//
//                    switch (marks / 10) {
//                        case 10:
//                        case 9:
//                            System.out.println("Grade: A");
//                            break;
//
//                        case 8:
//                            System.out.println("Grade: B");
//                            break;
//
//                        case 7:
//                            System.out.println("Grade C ");
//
//                        case 6:
//                            System.out.println("Grade D");
//                            break;
//
//                         default:
//                             System.out.println("Grade F");
//
//                    }
//                    sc.close();
//
//                }
//                }