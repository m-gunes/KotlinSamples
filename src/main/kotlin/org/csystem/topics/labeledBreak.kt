package org.csystem.topics


/*---------------------------------------------------------------------------------------------------------------------
    Etiketli break (labeled break) kullanımı. Dikkat break@<etiket ismi> *deyimi boşluk içeremez.
    Etiket bildirimi sonunda @ atomu yazılmalıdır. Etiket ismi ile @ atomu bitişik olarak yazılmalıdır.
---------------------------------------------------------------------------------------------------------------------*/
fun main() {
    EXIT_LOOP@
    for (i in 10..20) {
        for (k in 2..34) {
            println("($i, $k)")
            if ((i + k) % 11 == 0)
                break@EXIT_LOOP
        }
    }

    println("Tekrar yapıyor musunuz?")

    EXIT_FIRST_LOOP@
    for (i in 10..30) {
        EXIT_SECOND_LOOP@
        for (j in 45..89) {
            for (k in 2..34) {
                println("($i, $j, $k)")
                if ((i + j + k) % 11 == 0)
                    break@EXIT_SECOND_LOOP

                if ((i + j + k) % 13 == 0)
                    break@EXIT_FIRST_LOOP
            }
        }
    }

    println("Tekrar yapıyor musunuz?")
}