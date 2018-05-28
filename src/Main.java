
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        GeneratedAudiofile generatedAudiofile = new GeneratedAudiofile();
        generatedAudiofile.createaudiofile(digit);
    }






}


