import java.util.Scanner;

public class VideoDurations {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        String[] input = reader.nextLine().split(":");

        Integer wholeVideoHours = 0;
        Integer wholeVideoMinutes = 0;

        while(!input[0].equals("End")) {
                Integer videoDurationInHours = Integer.parseInt(input[0]);
                Integer videoDurationsInMinutes = Integer.parseInt(input[1]);

                wholeVideoHours += videoDurationInHours;
                wholeVideoMinutes += videoDurationsInMinutes;

                input = reader.nextLine().split(":");
            }

        while(wholeVideoMinutes >= 60){
            wholeVideoMinutes-=60;
            wholeVideoHours++;
        }

        if(wholeVideoMinutes < 10){
            System.out.println(wholeVideoHours + ":" + "0" +wholeVideoMinutes);
        }else{
            System.out.println(wholeVideoHours + ":" + wholeVideoMinutes);
        }
    }
}
