fun main()
{
    /*
    1- Definição do diâmetro da tubulação de sucção e recalque, adotar velocidades compatíveis com o escoamento na
    água, visando diâmetros econômicos em relação a perda de energia. Escolher diâmetros padronizados (comerciais);
    */


    // Cálculo dos diâmetros de recalque e de sucção

    println ("**** Cálculando diâmetros de recalque e de sucção ****")

    print ("Informe o período de funcionamento da bomba por dia: ")
    val T = (readln().toDouble()/24)

    print ("Informe a vazão em metros cúbicos por segundo (m³/s): ")
    val Q = Math.sqrt(readln().toDouble())

    val D = Math.pow(T, 0.25) * 1.3 * Q


    println("O diâmetro da tubulação de recalque e de sucção é ${"%.3f".format(D)} m ou ${"%.2f".format(D * 1000)} mm ")

}