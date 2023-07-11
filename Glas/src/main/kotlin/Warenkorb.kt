open class Warenkorb {
    val warenkorb:MutableList<Artikel> = mutableListOf()

    fun produktHinzufügen(produkt: Artikel){
        warenkorb.add(produkt)
    }

    fun produnktEntfernen(produkt: Artikel){
        warenkorb.remove(produkt)
    }

    fun gesamtSumme():Double{
        return warenkorb.sumOf { it.preis }
    }
}