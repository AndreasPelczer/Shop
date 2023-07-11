


val glas = mutableListOf(
    Artikel("kunstglas", "Vase 'Lost'", true, "ganz toll", 1, 80.90),
    Artikel("kunstglas", "Vase 'Olga'", true, "Wunderbar", 1, 280.90),
    Artikel("kunstglas", "Vase 'Fred'", true, "ganz ganz toll", 1, 810.90),
    Artikel("kunstglas", "Vase 'Grün'", true, "voll toll", 1, 60.90),
    Artikel("kunstglas", "Vase 'Gelb'", true, "ganz gut", 1, 200.90),
    Artikel("kunstglas", "Vase 'Blau'", true, "Fantastico", 1, 180.90),
    Artikel("kunstglas", "KunstUnikat 'Gerd'", true, "Gerd geht immer ", 1, 840.90),
    Artikel("kunstglas", "Kunstflasche '1910'", true, "ganz toll", 1, 99.90),
    Artikel("kunstglas", "Ameise 'Arnold'", true, "furchtbar toll", 1, 30.90),
    Artikel("kunstglas", "Hund 'Herrmann'", true, "wunder toll", 1, 10.90),
    Artikel("laborglas", "Reagenzglas 'Berta'", true, "Säurebeständig", 1000, 1.90),
    Artikel("laborglas", "Petrischale 'Olga'", true, "Industrieglas", 1000, 1.90),
    Artikel("laborglas", "Flasche 'Fred'", true, "ganz ganz toll", 100, 2.90),
    Artikel("laborglas", "Stopfen 'Grün'", true, "voll toll", 100, 0.90),
    Artikel("laborglas", "Stopfen 'Gelb'", true, "ganz gut", 100, 0.90),
    Artikel("laborglas", "Stopfen 'Blau'", true, "Fantastico", 100, 0.90),
    Artikel("laborglas", "Aphothekerflasche", true, "Gerd geht immer ", 100, 3.90),
    Artikel("laborglas", "Abdampfschale '1910'", true, "ganz toll", 100, 9.90),
    Artikel("laborglas", "Messkolben", true, "furchtbar toll", 100, 30.90),
    Artikel("laborglas", "Mörser 'Herrmann'", true, "wunder toll", 10, 10.90)
)
var artikel: MutableList<Artikel> = mutableListOf()

fun main() {

    val warenkorb:MutableList<Artikel> = mutableListOf()

    while (true) {
        println("\nBitte wählen Sie eine Aktion:")
        println("1. Artikel Kunstglas anzeigen")
        println("11 Artikel nach Preis sortiert")
        println("12 Artikel nach Alphabet sortiert")
        println("2. Artikel Laborglas anzeigen")
        println("3. Artikel zum Warenkorb hinzufügen")
        println("4. Artikel aus dem Warenkorb entfernen")
        println("8. Warenkorb anzeigen")
        println("9. Zur Kasse")
        println("0. Beenden")

        val auswahl = readLine()?.toInt()

        when (auswahl) {
            1 -> anzeigenArtikel(glas.filter { it.kategorie == "kunstglas" })
            11 -> {

            }

            2 -> anzeigenArtikel(glas.filter { it.kategorie == "laborglas" })
            3 -> {
                println("Geben Sie die Nummer des Artikels ein, den Sie zum Warenkorb hinzufügen möchten: ")
                val index = readLine()?.toIntOrNull()
                if (index != null && index in 0 until glas.size) {
                    val artikel = glas[index]
                    warenkorb.add(artikel)
                    glas.remove(artikel)
                    println("${artikel.kategorie} wurde zum Warenkorb hinzugefügt.")
                } else {
                    println("Ungültig.")
                }
            }

            4 -> {
                println("Geben Sie die Nr. des Artikels ein, den Sie aus dem Warenkorb entfernen möchten: ")
                val index = readLine()?.toIntOrNull()
                if (index != null && index in 0 until warenkorb.size) {
                    val artikel = warenkorb.removeAt(index)
                    println("${artikel.name} wurde aus dem Warenkorb entfernt.")
                } else {
                    println("Ungültiger Artikel.")
                }
            }

            8 -> anzeigenWarenkorb(warenkorb)
            9 -> bezahlen(warenkorb)
            0 -> break
            else -> println("Ungültige Auswahl. Bitte versuchen Sie es erneut.")
        }

    }
}






