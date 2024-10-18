import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random; // eta shtuchka dlya tgo chtobi generirovat ciferki razniye

public class ArraysDimasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> array = new ArrayList<Double>();

        System.out.print("Vvedit kilkist ciforok:");
        int n = scanner.nextInt();

          System.out.print("Vvedi min znachenya : ");
        double min = scanner.nextDouble();
        System.out.print("vvedi max znach : ");
        double max = scanner.nextDouble();
          Random random = new Random();

        for (int i = 0; i < n; ++i) {
            double randomNumber = min + (max - min) * random.nextDouble();
            array.add(randomNumber);
        }
        
        //tut vivod ciferok
        System.out.println("Sgenerovani ciferki:");
        for (int i = 0; i < array.size(); ++i) {
            System.out.println(array.get(i));
        }
        
        double sum = 0;
        for (int i = 0; i < array.size(); ++i) {
            sum += array.get(i);
        }
        double arithmeticMean = sum / array.size();
        
        double product = 1;
        for (int i = 0; i < array.size(); ++i) {
            product *= array.get(i);
        }
        double geometricMean = Math.pow(product, 1.0 / array.size());
        
        System.out.println("Sredne aref: " + arithmeticMean);
        System.out.println("Seredne geom: " + geometricMean);



    }
    
}