package de.chefkoch.api;

import java.util.Locale;

public class IngredientHelper {

	public static String getHumanReadableDouble(Double d) {
        String returnValue = "";
        if (d == 0.0) {
            return "";
        }
        if (d >= 1.0) {
            returnValue = String.format(Locale.getDefault(), "%.0f", Math.floor(d));
            if (d > 20) {
                return returnValue;
            }
        }
        d = d - Math.floor(d);
        if (d == 0.0) {
            return returnValue;
        }
        String fraction = getHumanReadableFraction(d, Math.floor(d) > 0);
        if (fraction.equals("")) {
            return returnValue;
        }
        if (fraction.equals("1")) {
            return String.format(Locale.getDefault(), "%.0f", Math.floor(d) + 1);
        }
        if (returnValue.equals("")) {
            return fraction;
        }
        returnValue = returnValue + " " + fraction;
        return returnValue;
    }
	
	public static String getHumanReadableFraction(Double fraction, Boolean allowZero) {
        String[] strings = { "⅒", "⅛", "¼", "⅓", "⅜", "½", "⅝", "⅔", "¾", "⅞", "1" };
        Double[] values = { 0.1, 0.125, 0.25, 0.3333, 0.375, 0.5, 0.625, 0.6666, 0.75, 0.875, 1.0 };
        Double lastValue = 0.0;
        for (int count = 0; count < strings.length; count++) {
            if (values[count] >= fraction) {
                Double pivot = (values[count] + lastValue) / 2;
                if (fraction > pivot) {
                    return strings[count];
                }
                if (count > 0) {
                    return strings[count];
                }
                if (allowZero) {
                    return String.valueOf(0);
                }
            }
            lastValue = values[count];
        }
        return "";
    }
	
}
