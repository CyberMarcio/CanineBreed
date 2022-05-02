class Dog {
    var cor: String = ""
    var porte: String = ""
    var cordosOlhos: String = ""

}

fun main(){
    val dog = Dog ()
    dog.cor = "marrom"
    dog.porte = "pequeno"
    dog.cordosOlhos = "pretos"

    print("a cor do pelo é: ")
    println(dog.cor)
    print("o porte é: ")
    println(dog.porte)
    print("seus olhos são: ")
    println(dog.cordosOlhos)

}