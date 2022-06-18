package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double F = temperatureCelsius * 1.8 + 32;
        System.out.println(F);
    }
    public static void main(String[] args) {
        TemperatureConverter convertedTemp = new TemperatureConverter();
        convertedTemp.toFahrenheit(37);
    }
}
