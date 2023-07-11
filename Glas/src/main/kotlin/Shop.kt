open class Shop(
    var registrierterUser: MutableList<User>,
    var produkte: MutableList<Artikel> = mutableListOf()
) {

    fun warenkorbProduktHinzufügen(produkt: Artikel) {
        // warenkorb.produktHinzufügen(produkt)
    }

    fun warenkorbProduktEntfernen(produkt: Artikel) {
        // warenkorb.produktEntfernen(produkt)
    }

    fun warenkorbLeeren() {

    }

    fun findeProduktMitNamen() {
       // return produkte.find { it.name == name }
    }
    fun anzeigenArtikel(artikelListe: List<Artikel>) {        //für Display
        println("Artikelliste:")
        for ((index, artikel) in artikelListe.withIndex()) {
            println("$index. ${artikel.name} (${artikel.kategorie}) - Preis: ${artikel.preis} EUR")
        }
    }

    fun anzeigenWarenkorb(warenkorb: List<Artikel>) {           //User Warenkorb
        println("Warenkorb:")
        if (warenkorb.isEmpty()) {
            println("Der Warenkorb ist leer.")
        } else {
            warenkorb.forEachIndexed { index, artikel ->
                println("$index. ${artikel.name} ${artikel.preis} ${artikel.beschreibung}")
            }
        }
    }


}