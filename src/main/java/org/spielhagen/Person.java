/**
 * Kommentare wurden mittels ChatGPT-4 generiert.
 */

// Das Paket, in dem diese Klasse definiert ist
package org.spielhagen;

// Definition der 'Person' Record-Klasse
// Jetzt hat die Person-Record neben der ID, dem Namen und dem Lieblingstag auch ein Geschlecht. Das Geschlecht ist
// vom Typ Gender, einem Enum, das die Werte MALE, FEMALE und DIVERSE hat.
public record Person(int id, String name, DayOfWeek favoriteDay, Gender gender) {}

/**
 * Die Person-Klasse ist hier als ein record definiert. Ein Record ist eine spezielle Art von Klasse in Java,
 * die hauptsächlich dazu dient, unveränderliche Daten zu halten. Records wurden in Java 16 eingeführt und sind
 * besonders nützlich, wenn Sie eine Klasse mit nur Datenfeldern und ohne zusätzliches Verhalten benötigen.
 * .
 * In diesem Fall hat die Person-Klasse drei Felder: id (vom Typ int), name (vom Typ String) und favoriteDay
 * (vom Typ DayOfWeek, der wahrscheinlich ein Enum ist).
 * .
 * Die record-Definition generiert automatisch die folgenden Methoden für jedes Feld:
 * - Einen Konstruktor, der alle Felder als Parameter nimmt.
 * - Getter-Methoden für alle Felder (die Methoden haben den gleichen Namen wie die Felder, z.B. id(), name(), favoriteDay()).
 * - equals() und hashCode() Methoden, die auf allen Feldern basieren.
 * - Eine toString() Methode, die alle Felder enthält.
 * .
 * Da es sich um ein record handelt, sind alle Felder final und können nach der Erstellung des Objekts nicht mehr
 * geändert werden. Dies macht Person-Objekte unveränderlich.
 */
