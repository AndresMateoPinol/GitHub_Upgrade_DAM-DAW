package sesion20250312;

/**
 * Clase TemperatureConverter que implementa conversiones de temperatura.
 */
public class TemperatureConverter {

    /**
     * Convierte grados Celsius a Fahrenheit.
     * @param celsius La temperatura en grados Celsius.
     * @return La temperatura equivalente en grados Fahrenheit.
     */
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    /**
     * Convierte grados Fahrenheit a Celsius.
     * @param fahrenheit La temperatura en grados Fahrenheit.
     * @return La temperatura equivalente en grados Celsius.
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Calcula el promedio de dos temperaturas dadas en grados Celsius.
     * @param temp1 La primera temperatura en grados Celsius.
     * @param temp2 La segunda temperatura en grados Celsius.
     * @return El promedio de las dos temperaturas.
     * @throws IllegalArgumentException si alguna de las temperaturas es inferior a -273.15 (cero absoluto).
     */
    public double averageCelsius(double temp1, double temp2) {
        if (temp1 < -273.15 || temp2 < -273.15) {
            throw new IllegalArgumentException("Temperatura en Celsius por debajo del cero absoluto");
        }
        return (temp1 + temp2) / 2;
    }
}
