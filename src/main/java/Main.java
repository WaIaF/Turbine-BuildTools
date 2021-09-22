import me.tongfei.progressbar.ProgressBar;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args){

        clearScreen();

        Runtime runtime = Runtime.getRuntime();
        String url = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Turbine version to build: ");

        String inputVersion = scanner.nextLine();

        if (inputVersion.equals("1.17.1")){

            clearScreen();
            try (ProgressBar pb = new ProgressBar("Copying Files", 3149)) {

                for (long i = 0; i < pb.getMax(); i++) {
                    pb.stepTo(i);
                    TimeUnit.MILLISECONDS.sleep(10);
                }

                pb.stepTo(pb.getMax());


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clearScreen();
            System.out.println("Complete!");

            try {

                TimeUnit.SECONDS.sleep(3);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

            try (ProgressBar pb = new ProgressBar("Compiling", 3149)) {

                for (long i = 0; i < pb.getMax(); i++) {
                    pb.stepTo(i);
                    TimeUnit.MILLISECONDS.sleep(5);
                }
                pb.stepTo(pb.getMax());


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);

            } catch (IOException e) {

                System.out.println("Ban bi gay");

            }

        } else {

            System.out.println("No Turbine version found");


        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
