package classroom.mcq.switchCase;

public class SwitchCaseChallenge {
    public static void main(String[] args) {

        int formulaNumber = 50;

        String formula = "";

//a

     /*   switch(formulaNumber) {
            case 30:
                formula += "Zn";
                break;
            case 50:
                formula += "Mn";
            case 10:
                formula += "Ne";
            case 5:
                formula += "H";
                break;
            default:
                formula += "He";
        }*/

//b
     /*   switch(formulaNumber) {
            case 30:
                formula += "Zn";
                break;
            case 10:
                formula += "O";
            case 50:
                formula += "Mn";
            case 5:
                formula += "Ne";
            default:
                formula += "He";
        }*/
        //c
       /* switch(formulaNumber) {
            case 50:
                formula += "Mn";
            case 10:
                formula += "Ne";
                break;
            case 30:
                formula += "Zn";
            case 5:
                formula += "O";
            default:
                formula += "H";
        }*/
        //d
        switch(formulaNumber) {
            case 20:
                formula += "Mn";
            case 60:
                formula += "Ne";
                break;
            case 50: case 10:
                formula += "Mn";
            case 5: case 90:
                formula += "Ne";
            default:
                formula += "H";
        }
        System.out.println(formula);

    }

}
