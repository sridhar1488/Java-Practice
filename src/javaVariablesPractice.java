import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class javaVariablesPractice {

    public static void main(String[] args) {

        int a=20;
        int b=30;
        int c=a+b;

        System.out.println("Addition sum is:" + c);

        String originalStr = "Hello";
        String reversedStr = "";

   //     for (int i = 0; i < originalStr.length(); i++) {
   //        reversedStr = originalStr.charAt(i) + reversedStr;
   //         System.out.println(reversedStr);
   //     }

   //    System.out.println("Reversed string: "+ reversedStr);

        for(int i =originalStr.length()-1;i>=0;i--)

        {
            System.out.print(originalStr.charAt(i));

        }


    }
}
