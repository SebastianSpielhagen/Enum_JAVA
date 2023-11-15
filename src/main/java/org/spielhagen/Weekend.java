/**
 * Kommentare wurden mittels ChatGPT-4 generiert.
 */

// Das Paket, in dem diese Klasse definiert ist
package org.spielhagen;

// Definition der Klasse 'Weekend'
public class Weekend {
    // Die statische Methode 'getDayType' gibt einen String zurück, der den Typ des übergebenen Tages angibt.
    // 'DayOfWeek' ist wahrscheinlich ein Enum, das die Tage der Woche repräsentiert.
    public static String getDayType(DayOfWeek day) {
        // Ein switch-Ausdruck wird verwendet, um zu bestimmen, welchen String zurückzugeben.
        return switch (day) {
            // Wenn der Tag 'SAMSTAG' oder 'SONNTAG' ist, gibt die Methode "Weekend" zurück.
            case SAMSTAG, SONNTAG -> "Weekend";
            // Für alle anderen Tage gibt die Methode die toString-Repräsentation des Tages zurück.
            default -> day.toString();
        };
    }
}

/**
 * Die Weekend Klasse hat eine statische Methode namens getDayType, die einen DayOfWeek Wert als Argument annimmt und
 * einen String zurückgibt, der den Typ des Tages angibt. Wenn der übergebene Tag SAMSTAG oder SONNTAG ist, gibt die
 * Methode "Weekend" zurück. Ansonsten gibt sie die toString-Repräsentation des DayOfWeek Werts zurück.
 *.
 * Die Methode verwendet die "enhanced" switch-Anweisung (eingeführt in Java 14), die es ermöglicht, den Wert direkt
 * zurückzugeben. In diesem Fall wird entweder "Weekend" oder die toString-Repräsentation des DayOfWeek Werts
 * zurückgegeben.
 *.
 * Da die Methode getDayType statisch ist, kann sie ohne Erstellung einer Instanz der Weekend Klasse aufgerufen werden.
 * Zum Beispiel: String dayType = Weekend.getDayType(day);
 */