public class Lecture40 {
    public static void main(String[] args){
        int value = 3;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 4;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");

        }

        //Challenge
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found
        char myChar = 'B';

        switch (myChar){
            case 'A':
                System.out.println("A found");
                break;

            case 'B':
                System.out.println("B found");
                break;

            case 'C':
                System.out.println("C found");
                break;

            case 'D':
                System.out.println("D found");
                break;

            case 'E':
                System.out.println("E found");
                break;

            default:
                System.out.println("Not found");
                break;
        }
    }
}
