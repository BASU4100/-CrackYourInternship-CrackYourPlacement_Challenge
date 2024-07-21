import java.lang.Math.*;
class Solution {
    public String intToRoman(int num) {
        int len= (String.valueOf(num)).length();
        int power= (int)Math.pow(10,len-1);
        String sol="";
        while (num>0)
        {
            int digit = num/power;
            int number = digit*power;
            sol = sol + Roman(number);
            num%=power;
            power/=10;
        }
        return sol;
    }
    public static String Roman(int number)
    {
        String sol="";
            if (number==4 || number==40 || number==400 || number==9 || number==90 || number==900)
            {
                if (number==4)
                    sol="IV";
                else if (number==40)
                    sol="XL";
                else if (number==400)
                    sol="CD";
                else if (number==9)
                    sol="IX";
                else if (number==90)
                    sol="XC";
                else 
                    sol="CM";
            }
            else if (number/1000>=1)
            {
                for (int i=0;i<number/1000;i++)
                {
                    sol+="M";
                }
            }
            else if (number/500>=1 || number/100>=1)
            {
                for (int i=0;i<number/500;i++)
                {
                    sol+="D";
                }
                number%=500;
                if (number/100>=1)
                {
                    for (int i=0;i<number/100;i++)
                    {
                        sol+="C";
                    }
                }
            }
            else if (number/50>=1 || number/10>=1)
            {
                for (int i=0;i<number/50;i++)
                {
                    sol+="L";
                }
                number%=50;
                if (number/10>=1)
                {
                    for (int i=0;i<number/10;i++)
                    {
                        sol+="X";
                    }
                }
            }
            else
            {
                for (int i=0;i<number/5;i++)
                {
                    sol+="V";
                }
                number%=5;
                if (number/1>=1)
                {
                    for (int i=0;i<number/1;i++)
                    {
                        sol+="I";
                    }
                }
            }
        return sol;
    }
}
