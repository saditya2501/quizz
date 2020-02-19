package Day_6;

public class FlowControlChallenge
{
    public static void main(String[] args) {

        boolean isJavaNice = true;

        boolean isProgrammingNice = true;

        String result = "";


//a
        /*  if (isProgrammingNice = false | (isJavaNice = false)) {
            result += "1";
        }
        if (isProgrammingNice || isJavaNice) {
            result += "2";
        }
        if (!isProgrammingNice && !isJavaNice) {
            result += "3";
        }
        if ((isProgrammingNice = true) & (isJavaNice = true)) {
            result += "4";
        }
        if (isProgrammingNice || (isJavaNice = false)) {
            result += "5";
        }
*/

        //b
        if (!(isProgrammingNice = false) && !(isJavaNice = false)) {
            result += "3";
        }
        if ((isProgrammingNice = true) & (isJavaNice = true)) {
            result += "4";
        }
        if (isProgrammingNice | (isJavaNice = false)) {
            result += "5";
        }


        //c
        /*
        if (!(isProgrammingNice = true) || !(isJavaNice = false)) {

            result += "3";
        }
        if ((isProgrammingNice = true) & (isJavaNice = true)) {
            result += "4";
        }
        if ((isJavaNice != false) || isProgrammingNice) {
            result += "5";
        }
        */

        //d
        /* if (!(isProgrammingNice = true) || !(isJavaNice = !false)) {
            result += "2";
        }
        if ((isProgrammingNice = true) & !(isJavaNice = !isProgrammingNice)) {
            result += "3";
        }
        if ((isJavaNice = !isJavaNice) && isProgrammingNice) {
            result += "4";
        }
        if ((isProgrammingNice = !false) | isJavaNice) {
            result += "5";
        }*/
        System.out.println(result + isProgrammingNice + isJavaNice);

    }

}