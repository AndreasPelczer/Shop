open class User(
    var name:String,
    var passwort:String,
    var eMail:String,
    var telefonnummer:String,

    ) {
    var warenkorb:Warenkorb = Warenkorb()

    fun login():Boolean{
        //Loginzeug
        return false
    }

    fun registrieren():Boolean{
        //Registrierzeug
        return true
    }

    fun zumWarenkorbHinzufügen(produkt: Artikel){
        warenkorb.produktHinzufügen(produkt)
    }

    fun ausWarenkorbEntfernen(produkt: Artikel){
        warenkorb.produnktEntfernen(produkt)
    }

    fun gesamtSummeWarenkorb(): Double {
        return warenkorb.gesamtSumme()
    }

   open fun bezahlen(warenkorb: List<Artikel>) {
        println("Gesamtpreis des Warenkorbs: ${warenkorb.sumByDouble { it.preis }} EUR")
        println("Bitte wählen Sie eine Zahlungsmethode:")
        println("1. Kreditkarte")
        println("2. PayPal")
        println("3. Barzahlung")

        val zahlungsmethode = readLine()

        when (zahlungsmethode) {
            "1" -> println("Sie haben die Zahlungsmethode Kreditkarte gewählt.")
            "2" -> println("Sie haben die Zahlungsmethode PayPal gewählt.")
            "3" -> println("Sie haben die Zahlungsmethode Barzahlung gewählt.")
            else -> println("Ungültige Auswahl. Die Zahlung wurde abgebrochen.")
        }

    }

}