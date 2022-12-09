/*

Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example

s='12:01:00PM'
Return '12:01:00'.

s='12:01:00AM'
Return '00:01:00'.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

string s: a time in 12 hour format

Returns

string: the time in 24 hour format

Input Format

A single string s that represents a time in 12-hour clock format (i.e.:hh:mm:ssAM or hh:mm:ssPM).

Constraints

All input times are valid

Sample Input

07:05:45PM

Sample Output

19:05:45

*/

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int len=s.length();
        String first2char="";
        String last2char="";
        for (int i=0;i<len;i++)
        {
            if(i==0 || i==1)
            {
                first2char=first2char+s.charAt(i);
            }
            if(i==len-2 || i==len-1)
            {
                last2char=last2char+s.charAt(i);
            }
        }
        int convcharintoInt=Integer.parseInt(first2char);
        if(last2char.equalsIgnoreCase("PM") && convcharintoInt<12)
        {
            convcharintoInt=convcharintoInt+12;
        }
        if(last2char.equalsIgnoreCase("AM") && convcharintoInt==12)
        {
            convcharintoInt=convcharintoInt-12;
        }
        String convIntToStr="";
        if(convcharintoInt==0 || convcharintoInt<10){
            convIntToStr="0"+String.valueOf(convcharintoInt);
        }
        else {
        convIntToStr=String.valueOf(convcharintoInt);}
        String remString="";
        for (int j=0;j<len;j++)
        {
            if(j==0 || j==1 || j==len-2 || j==len-1)
            {continue;}
            else
            { remString=remString + s.charAt(j);}
        }
        return (convIntToStr+remString);
    }

}

class Solution {
    public static void main(String[] args){

        String s = "07:05:45PM";
        String result = Result.timeConversion(s);
        System.out.println(result);

    }
}

