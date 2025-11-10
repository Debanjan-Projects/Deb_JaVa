public class Parameter {
    public static void main(String[] args) {//argument.or jab asli vaalue diya jata hain .ohh hota hain argument .
        System.out.println(sumTwoNumbers(4, 7));
        System.out.println(sumTwoNumbers(5, 9));
        System.out.println(sumTwoNumbers(-67, 67));
    }

    public static int sumTwoNumbers(int firstNum, int secondNum ) {//parameter //jav definition declare kara jaye tab ohh hota hain parameter .
        System.out.println("First Number received: " + firstNum);
        System.out.println("Second Number received: " + secondNum);
        return firstNum + secondNum;
    }
}
