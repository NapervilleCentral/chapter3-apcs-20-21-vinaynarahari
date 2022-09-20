import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num, num1, num2, num3;
   
    System.out.print("Enter four numbers: ");

    num = scan.nextInt();
    num1 = scan.nextInt();
    num2 = scan.nextInt();
    num3 = scan.nextInt();

    if (num == num1 && num2 == num3 ||
        num == num2 && num1 == num3 ||
        num == num3 && num1 == num2)
      System.out.print("There are 2 pairs");
    else
      System.out.print("No 2 pairs");
  }
}