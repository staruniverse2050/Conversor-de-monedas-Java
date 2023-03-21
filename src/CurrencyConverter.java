import javax.swing.*;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Definir las tasas de cambio
        double usdToEur = 0.84;
        double usdToGbp = 0.72;
        double usdToJpy = 109.73;
        double usdToKrw = 1177.54;
        double usdToCop = 3800;

        // Pedir al usuario la cantidad y la moneda de origen
        double amount = 0;
        String currencyFrom = "";

        do {
            String amountString = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:");
            amount = Double.parseDouble(amountString);

            String[] currencies = {"USD", "EUR", "GBP", "JPY", "KRW", "COP"}; // Agregar COP
            currencyFrom = (String) JOptionPane.showInputDialog(null, "Selecciona la moneda de origen:",
                    "Moneda de origen", JOptionPane.QUESTION_MESSAGE, null, currencies, currencies[0]);

            // Calcular la cantidad equivalente en USD
            double amountUsd = 0;
            switch (currencyFrom) {
                case "USD":
                    amountUsd = amount;
                    break;
                case "EUR":
                    amountUsd = amount / usdToEur;
                    break;
                case "GBP":
                    amountUsd = amount / usdToGbp;
                    break;
                case "JPY":
                    amountUsd = amount / usdToJpy;
                    break;
                case "KRW":
                    amountUsd = amount / usdToKrw;
                    break;
                case "COP": // Agregar case para COP
                    amountUsd = amount / usdToCop;
                    break;
            }

            // Pedir al usuario la moneda de destino
            String currencyTo = (String) JOptionPane.showInputDialog(null, "Selecciona la moneda de destino:",
                    "Moneda de destino", JOptionPane.QUESTION_MESSAGE, null, currencies, currencies[0]);

            // Calcular la cantidad equivalente en la moneda de destino
            double amountConverted = 0;
            switch (currencyTo) {
                case "USD":
                    amountConverted = amountUsd;
                    break;
                case "EUR":
                    amountConverted = amountUsd * usdToEur;
                    break;
                case "GBP":
                    amountConverted = amountUsd * usdToGbp;
                    break;
                case "JPY":
                    amountConverted = amountUsd * usdToJpy;
                    break;
                case "KRW":
                    amountConverted = amountUsd * usdToKrw;
                    break;
                case "COP": // Agregar case para COP
                    amountConverted = amountUsd * usdToCop;
                    break;
            }

            // Mostrar el resultado al usuario
            JOptionPane.showMessageDialog(null, " Usted tiene $" + String.format("%.2f", amountConverted) + " " + currencyTo);

        } while (JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Continuar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

        // Mostrar mensaje de programa terminado
        JOptionPane.showMessageDialog(null, "Programa terminado");
    }
}

