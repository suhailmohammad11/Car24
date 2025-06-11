package Car24;


import java.util.Scanner;

public class UserInterface {

    public static CarInfo extractDetails(String carDetails) {
        String[] parts = carDetails.split(":");
        if (parts.length == 4) {
            return new CarInfo(parts[0], parts[1], parts[2], parts[3]);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Car Details");
        String input = sc.nextLine();

        CarInfo car = extractDetails(input);
        if (car == null) {
            System.out.println("Invalid Details");
            return;
        }

        String result = car.checkAvailability();

        if (result.equals("Invalid Details")) {
            System.out.println("Invalid Details");
        } else {
            System.out.println("Car Id : " + car.getCarId());
            System.out.println("Car Name : " + car.getCarName());
            System.out.println("Car Type : " + car.getCarType());
            System.out.println("City : " + car.getCity());
            System.out.println(result);
        }

        sc.close();
    }
}
