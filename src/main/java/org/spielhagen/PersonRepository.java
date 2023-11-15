/**
 * Kommentare wurden mittels ChatGPT-4 generiert.
 */

// Das Paket, in dem diese Klasse definiert ist
package org.spielhagen;

// Importieren der benötigten Klassen und Schnittstellen aus anderen Paketen
import java.util.*;

// Definition der Klasse 'PersonRepository'
public class PersonRepository {
    // 'personMap' ist eine private Instanzvariable, die eine Zuordnung von Integer-IDs zu Person-Objekten speichert.
    // Das 'final'-Schlüsselwort bedeutet, dass 'personMap' nach der Initialisierung nicht mehr geändert werden kann.
    private final Map<Integer, Person> personMap = new HashMap<>();

    // Die 'addPerson'-Methode erlaubt es, ein Person-Objekt zum Repository hinzuzufügen.
    // Die ID der Person wird als Schlüssel verwendet und das Person-Objekt selbst als Wert.
    public void addPerson(Person person) {
        personMap.put(person.id(), person);
    }

    // Die 'findPersonById'-Methode ermöglicht es, ein Person-Objekt anhand seiner ID zu suchen.
    // Wenn die Person im Repository gefunden wird, wird ein 'Optional' mit der Person zurückgegeben.
    // Wenn die Person nicht gefunden wird, gibt die Methode ein leeres 'Optional' zurück.
    public Optional<Person> findPersonById(int id) {
        return Optional.ofNullable(personMap.get(id));
    }
}

/**
 * Die PersonRepository-Klasse dient als Speicher für Person-Objekte. Sie verwendet eine HashMap, in der die IDs der
 * Personen als Schlüssel und die Person-Objekte selbst als Werte gespeichert werden. Die addPerson-Methode ermöglicht
 * das Hinzufügen von Personen zum Repository, und die findPersonById-Methode ermöglicht das Suchen von Personen anhand
 * ihrer ID. Die findPersonById-Methode gibt ein Optional<Person> zurück, das die gefundene Person enthält, oder ein
 * leeres Optional, wenn keine Person mit der angegebenen ID gefunden wurde.
 */