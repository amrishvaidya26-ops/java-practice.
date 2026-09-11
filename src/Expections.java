//import java.io.FileReader;
//import java.io.IOException;
//
//public class Expections {
//
//  public static class Exceptions {
//
//      public static void main(String [] args){
//
//          try {
//
////         (1.)   Arthematic Exception
//
//              int a = 10 / 0;
//
//
////              (2). ArrayIndexoutofBoundsException
//
//              int arr[] = {10, 20, 30};
//              System.out.println(arr[5]);
//
////              (3.) NumberformatExpection
//
//              int num = Integer.parseInt("abc");
//
//
////              (4.)  NullPointerException
//
//              String str = null;
//              System.out.println(str.length());
//
//
////              // 5. IOException
//            FileReader file = new FileReader("data.txt");
//            file.close();
//
//          } catch (ArithmeticException e) {
//          System.out.println("Error: Cannot divide by zero.");
//          } catch (ArrayIndexOutOfBoundsException e) {
//              System.out.println("Error: Invalid array index.");
//          } catch (NumberFormatException e) {
//              System.out.println("Error : Invalid number format.");
//          } catch (NullPointerException e) {
//              System.out.println("Error: String is null.");
//          } catch (IOException e) {
//              System.out.println("Error: File not found.");
//          }
//
//          System.out.println("Program continues...");
//      }
//  }
//
//}
