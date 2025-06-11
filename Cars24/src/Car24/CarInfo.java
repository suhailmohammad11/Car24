package Car24;

public class CarInfo {
    private String carId;
    private String carName;
    private String carType;
    private String city;

    public CarInfo(String carId, String carName, String carType, String city) {
        this.carId = carId;
        this.carName = carName;
        this.carType = carType;
        this.city = city;
    }

    public String getCarId() {
        return carId;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarType() {
        return carType;
    }

    public String getCity() {
        return city;
    }

    public String checkAvailability() {
        String car = "";
        double price = 0.0;

        String carNameLower = carName.toLowerCase();
        String carTypeLower = carType.toLowerCase();
        String cityLower = city.toLowerCase();

        // Validate car name
        if (!(carNameLower.equals("nissan") || carNameLower.equals("ford"))) {
            return "Invalid Details";
        }

        // Validate car type
        if (!(carTypeLower.equals("sedan") || carTypeLower.equals("suv") || carTypeLower.equals("muv"))) {
            return "Invalid Details";
        }

        // Validate city
        if (!(cityLower.equals("newyork") || cityLower.equals("denver") || cityLower.equals("losangels"))) {
            return "Invalid Details";
        }

        // Fetch availability based on car name and type
        if (carNameLower.equals("nissan")) {
            switch (carTypeLower) {
                case "sedan": car = "Kicks"; price = 8400.0; break;
                case "suv": car = "Magnite"; price = 10800.0; break;
                case "muv": car = "Terrano"; price = 14400.0; break;
            }
        } else if (carNameLower.equals("ford")) {
            switch (carTypeLower) {
                case "sedan": car = "Figo"; price = 4802.0; break;
                case "suv": car = "Eco Sport"; price = 9605.0; break;
                case "muv": car = "Endeavour"; price = 21600.0; break;
            }
        }

        return "Available car and price is: " + car + " and $" + price;
    }
}
