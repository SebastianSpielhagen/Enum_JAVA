/**
 * Kommentare wurden mittels ChatGPT-4 generiert.
 */

// Unser Code befindet sich im Paket org.spielhagen. Ein Paket in Java hilft uns dabei,
// verwandte Klassen und Schnittstellen logisch zu gruppieren und Namenskonflikte zu verhindern.
package org.spielhagen;

// Wir importieren die Klasse Optional aus dem java.util-Paket. Optional in Java ist eine
// Containerklasse, die dazu dient, zu repräsentieren, dass ein Wert vorhanden oder nicht vorhanden sein kann.
import java.util.Optional;

// Hier definieren wir eine Klasse namens Main. In Java-Applikationen ist die Main-Klasse der Einstiegspunkt
// für die JVM zum Starten der Ausführung des Programms.
public class Main {
    // Die Methode main ist der Einstiegspunkt für unsere Anwendung. Die JVM ruft diese Methode auf, wenn das Programm gestartet wird.
    public static void main(String[] args) {
        // Hier erstellen wir ein neues Objekt der Klasse PersonRepository, das dazu dient,
        // Person-Objekte zu speichern und darauf zuzugreifen.
        PersonRepository repository = new PersonRepository();

        // Nun fügen wir drei Personen zum Repository hinzu. Jede Person hat eine eindeutige ID,
        // einen Namen und einen Lieblingstag der Woche.
        repository.addPerson(new Person(1, "Sebastian", DayOfWeek.MONTAG, Gender.MALE));
        repository.addPerson(new Person(2, "Marianna", DayOfWeek.SONNTAG, Gender.FEMALE));
        repository.addPerson(new Person(3, "Sergej", DayOfWeek.FREITAG, Gender.DIVERSE));

        // Wir durchlaufen die IDs 1 bis 3 mit einer for-Schleife.
        for (int id = 1; id <= 3; id++) {
            // Für jede ID versuchen wir, die entsprechende Person im Repository zu finden.
            // Die Methode findPersonById gibt ein Optional zurück, da es möglich ist, dass keine Person mit der gegebenen ID vorhanden ist.
            Optional<Person> person = repository.findPersonById(id);

            // Optional.ifPresent wird verwendet, um einen Codeblock auszuführen, wenn das Optional einen Wert enthält.
            // In diesem Fall geben wir den Namen der Person und den Typ ihres Lieblingstags aus, wenn die Person gefunden wurde.
            // In diesem Code wird nun auch das Geschlecht jeder Person ausgegeben. Da das Geschlecht ein Enum-Wert ist,
            // wird die Methode p.gender() die Enum-Konstante (MALE, FEMALE oder DIVERSE) zurückgeben.
            person.ifPresent(p -> {
                System.out.println("Name: " + p.name());
                System.out.println("Lieblingstag: " + Weekend.getDayType(p.favoriteDay()));
                System.out.println("Geschlecht: " + p.gender());
            });
        }
    }
}

/**
 * Das Programm erstellt ein PersonRepository, fügt drei Personen hinzu und versucht dann, jede Person anhand
 * ihrer ID zu finden und Informationen über sie auszugeben. Es verwendet die Weekend.getDayType Methode,
 * um zu bestimmen, ob der Lieblingstag der Person ein Wochentag oder ein Wochenende ist.
 */