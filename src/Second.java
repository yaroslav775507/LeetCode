public class Second {
    public int romanToInt(String s) {
        int sum = 0;
        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='I'){
                sum = sum + 1;
            }
            else if(ch == 'V'){
                sum = sum + 5;
            }
            else if(ch == 'X'){
                sum = sum + 10;
            }
            else if (ch == 'L'){
                sum = sum + 50;
            }
            else if (ch == 'C'){
                sum = sum + 100;
            }
            else if (ch == 'D'){
                sum = sum + 500;
            }
            else if (ch == 'M'){
                sum = sum + 1000;
            }
        }
        return sum;
    }
}