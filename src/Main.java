import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] monthRain = new int[30];
        fillRainfall(monthRain);

        int sum = getTotal(monthRain);
        int wetDayCount = countWetDays(monthRain);
        double average = sum / 30.0;
        String seasonMessage = classifyMonth(sum);

        System.out.println("NAMULONGE FARM RAINFALL MONITOR - BECKY");
        System.out.println();

        for (int index = 0; index < monthRain.length; index++) {
            System.out.println("Day " + (index + 1) + " rainfall: " + monthRain[index] + " mm");
        }

        System.out.println();
        System.out.println("Total: " + sum + " mm");
        System.out.println("Average: " + average + " mm");
        System.out.println("Wet days above 30 mm: " + wetDayCount);
        System.out.println("Classification: " + seasonMessage);
    }

    public static void fillRainfall(int[] monthRain) {
        Random random = new Random();

        for (int i = 0; i < monthRain.length; i++) {
            monthRain[i] = random.nextInt(61);
        }
    }

    public static int getTotal(int[] monthRain) {
        int sum = 0;

        for (int i = 0; i < monthRain.length; i++) {
            sum = sum + monthRain[i];
        }

        return sum;
    }

    public static int countWetDays(int[] monthRain) {
        int wetDayCount = 0;

        for (int i = 0; i < monthRain.length; i++) {
            if (monthRain[i] > 30) {
                wetDayCount = wetDayCount + 1;
            }
        }

        return wetDayCount;
    }

    public static String classifyMonth(int sum) {
        if (sum <= 300) {
            return "Dry";
        } else if (sum >= 600) {
            return "Flood-risk";
        } else {
            return "Normal";
        }
    }
}
