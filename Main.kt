//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val a_nevem: String = "ZMarci"
    println ("az én nevem  ${ a_nevem}  !")


    var szam: Float = 30f
    var szam_2: Float = 15f
    println ("${szam.toInt()} + ${szam_2.toInt()} = ${(szam + szam_2).toInt()}" )
    println ("${szam.toInt()} - ${szam_2.toInt()} = ${(szam + szam_2).toInt()}" )
    println ("${szam.toInt()} * ${szam_2.toInt()} = ${(szam + szam_2).toInt()}" )
    println ("${szam.toInt()} / ${szam_2.toInt()} = ${(szam + szam_2).toInt()}" )

print("kérlek irj be alamit:")
var bekert_szöveg = readln()
    if (bekert_szöveg.isEmpty()){
        print("nem adtál meg semmi szöveget")
    } else (bekert_szöveg)

if(!bekert_szöveg.isEmpty()){
    print(bekert_szöveg)
    }
}

