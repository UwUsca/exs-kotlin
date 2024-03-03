package exercicios

class ex1 {
// 1. Crie uma função que receba um número inteiro e retorne verdadeiro se o número for par e falso caso contrário.
    fun ehPar(numero: Int): Boolean{
        print("$numero é par? ")
        return numero % 2 == 0
    }
// 2. Crie uma função que receba um array de inteiros e retorne o maior número.
    fun maiorInt(inteiros: Array<Int>): Int{
        print("O maior número dos inteiros é: ")
        return inteiros.max()
    }

// 3. Crie uma classe chamada "Pessoa" com os atributos "nome" e "idade". Em seguida, crie uma lista de objetos "Pessoa" e ordene a lista em ordem alfabética pelo atributo "nome".
    fun ordemAlfabetica(){
        val p1 = Pessoa("Lilithzinha", 6)
        val p2 = Pessoa("Dianinha", 7)
        val p3 = Pessoa("Nalinha", 5)

        val listaP = listOf(p1, p2, p3)

        val ordemAlfa = listaP.sortedBy { it.nome }

        println("Pessoas em ordem alfabetica:")
        for (p in ordemAlfa){
            println("Nome: ${p.nome}, Idade: ${p.idade}")
        }
    }


// 4. Crie uma função que receba uma string e retorne verdadeiro se a string for um palíndromo (ou seja, pode ser lida da mesma forma de trás para frente).
    fun ehPalindromo(palavra: String): Boolean{
        val arvalap = palavra.reversed()
        println("A palavra '$palavra' eh um palindromo? ")
        return palavra.lowercase() == arvalap.lowercase()
    }

// 5. Implemente uma função lambda que retorne o maior valor entre dois números.
    val funcaoLambda: (Int, Int) -> Int = {a , b -> if (a > b) a else b}


// 6. Crie uma classe "ContaBancaria" com os atributos "saldo" e "limite". Adicione um método chamado "saque" que
//    recebe um valor como parâmetro e subtrai do saldo da conta. Se o valor do saque for maior que o saldo da conta,
//    o método deve lançar uma exceção com a mensagem "Saldo insuficiente".
    fun realizarSaque(){
        val conta = ContaBancaria(5000.0, 5000.00)
        conta.getSaldoLimite()
        println("Tentativa de 7000")
        conta.saque(7000.0)
        println("Tentativa de 2000")
        conta.saque(2000.0)
    }


// 7. Crie uma função que receba uma lista de strings e retorne a string mais longa da lista.
    fun maiorString(lista: Array<String>){
        val indexLista= mutableListOf<Int>()
        for(i in lista){
            indexLista.add(i.length)
        }
        println(lista[indexLista.indexOf(indexLista.max())])
    }


// 8. Crie uma classe "Funcionario" com os atributos "nome", "idade" e "salario". Crie uma função que receba uma
// lista de funcionários e retorne o funcionário com o maior salário.
    fun maiorSalario(){
        val f1 = Funcionario("Sergio", 19, 25000.0)
        val f2 = Funcionario("Cleber", 24, 18000.0)
        val f3 = Funcionario("Roberta", 22, 29000.0)

        val fs = arrayOf(f1, f2, f3)
        val fMaiorSalario = fs.maxBy{ it.salario }

        println("O funcionário com o maior salário é: ${fMaiorSalario.nome} com ${fMaiorSalario.idade} anos, e com um salário de: ${fMaiorSalario.salario}")
    }

// 9. Crie uma função que receba uma lista de números inteiros e retorne uma lista com os números em ordem crescente,
// sem usar o método de ordenação da linguagem.
    fun ordemSemFun(lista: MutableList<Int>){
        println("Lista original: $lista")
        val n = lista.size

        for( i in 0 until n -1){
            for (j in 0 until n - i - 1){
                if(lista[j] > lista [j+1]){
                    val aux = lista[j]
                    lista[j] = lista[j + 1]
                    lista[j + 1] = aux
                }
            }
        }
        println("Lista ordenada: $lista")
    }

// 10. Crie uma classe "Triangulo" com os atributos "base" e "altura". Adicione um método chamado "area" que calcula
// e retorna a área do triângulo.
    fun calcArea(){
        val t1 = Triangulo(15.3, 35.1)
        println("A área de um triangulo com base ${t1.base} e altura ${t1.altura} é: ${"%.1f".format(t1.area())}")
    }


// 11. Crie uma função que receba uma lista de strings e retorne uma lista com todas as strings que começam com a letra
//     "A", em ordem alfabética.
    fun apenasAemOrdem(lista: Array<String>){
        println("Lista original: ${lista.toList()}")
        val strComA = lista.filter { it.startsWith("A", ignoreCase = true) }
        val strOrd = strComA.sorted()
        println("Lista Ordenada de palavras com A: $strOrd")
    }

// 12. Utilize um mapa para representar um dicionário de palavras e suas traduções.
    fun dicionario(palavra: String){
        val enToPt  = mapOf(
            "cat" to "gato",
            "dog" to "cachorro"
        )

        if(enToPt.containsKey(palavra)){
            val traducao = enToPt[palavra]
            println("A tradução de $palavra é $traducao")
        } else {
            println("Palavra não encontrada no dicionario")
        }
    }

// 13. Crie uma função de ordem superior chamada operacaoMatematica que aceita dois números e uma função lambda.
//     A função operacaoMatematica deve aplicar a função lambda aos dois números e retornar o resultado.
//     Em seguida, crie algumas funções lambda para realizar operações matemáticas, como soma, subtração,
//     multiplicação e divisão. Use a função de ordem superior para realizar essas operações com diferentes pares de números.
    fun operacaoMatematica(num1: Double, num2: Double, operacao: (Double, Double) -> Double): Double{
        return operacao(num1, num2)
    }

//14. Crie uma função de extensão chamada isPalindromo para a classe String que verifica se a string é um palíndromo.
// A função deve ignorar espaços em branco e ser case-insensitive (não distinguir maiúsculas de minúsculas).
// Em seguida, use essa função para verificar se algumas palavras são palíndromos.
    fun String.isPalindromo(palavra: String): Boolean {
        val cleanText = palavra.replace("\\s".toRegex(), "").lowercase()
        val txeTnaelc = cleanText.reversed()
        return cleanText == txeTnaelc
    }

//15. Vamos criar um programa que utilize funções de alta ordem para operar em um array de números inteiros.
// Você deve criar funções de alta ordem para realizar as seguintes operações: filtrarPares: Uma função que filtra
// e retorna apenas os números pares do array; dobrarValores: Uma função que dobra o valor de cada número no array;
// somarValores: Uma função que calcula a soma de todos os valores no array. Em seguida, crie um array de números
// inteiros e utilize as funções de alta ordem para realizar essas operações.
    fun filterPairs(lista: IntArray): IntArray{
        return lista.filter { it % 2 == 0 }.toIntArray()
    }
    fun doubleValues(lista: IntArray): IntArray{
        return lista.map { it * 2 }.toIntArray()
    }
    fun sumValues(lista: IntArray): Int{
        return lista.sum()
    }
}

data class Pessoa(val nome: String, val idade: Int)

class ContaBancaria(var saldo: Double, var limite: Double){
    fun getSaldoLimite(){
        println("A conta possui um saldo de: $saldo / e um limite de: $limite")
    }
    fun saque(valor: Double){
        if(saldo > valor){
            saldo -= valor;
            println("Novo saldo: $saldo")
        } else {
            println("Saldo insuficiente")
        }
    }
}

data class Funcionario(val nome: String, val idade: Int, val salario: Double)

class Triangulo(val base: Double, val altura: Double){
    fun area(): Double{
        return (base*altura)/2
    }
}