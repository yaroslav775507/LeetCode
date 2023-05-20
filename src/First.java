import java.util.*;
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int sum = 0;
        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='I'){
                sum = sum+1;
            }
            if (ch=='V'){
                sum = sum+5;
            }
            if (ch=='X'){
                sum = sum+10;
            }
            if (ch=='L'){
                sum = sum+50;
            }
            if (ch=='C'){
                sum = sum+100;
            }
            if (ch=='D'){
                sum = sum+500;
            }
            if (ch=='M'){
                sum = sum+1000;
            }
        }
        System.out.println(sum);
    }
}
