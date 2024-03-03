import exercicios.*;

fun main() {
    //Exercicios 28/02
    val ex1 = ex1();
    // 1. Crie uma função que receba um número inteiro e retorne verdadeiro se o número for par e falso caso contrário.
    println("Exercício 1: ")
    println(ex1.ehPar(24))

    // 2. Crie uma função que receba um array de inteiros e retorne o maior número.
    println("\nExercício 2: ")
    println(ex1.maiorInt(arrayOf<Int>(5, 2, 10, 8, 3)))

    //3. Crie uma classe chamada "Pessoa" com os atributos "nome" e "idade". Em seguida, crie uma lista de objetos "Pessoa"
    //   e ordene a lista em ordem alfabética pelo atributo "nome".
    println("\nExercício 3: ")
    ex1.ordemAlfabetica()

    // 4. Crie uma função que receba uma string e retorne verdadeiro se a string for
    //    um palíndromo (ou seja, pode ser lida da mesma forma de trás para frente).
    println("\nExercício 4: ")
    println(ex1.ehPalindromo("Ana"))

    // 5. Implemente uma função lambda que retorne o maior valor entre dois números.
    println("\nExercício 5: ")
    print(ex1.funcaoLambda(25,28))
    println(" eh o maior numero entre eles")

    // 6. Crie uma classe "ContaBancaria" com os atributos "saldo" e "limite". Adicione um método chamado "saque" que
    //    recebe um valor como parâmetro e subtrai do saldo da conta. Se o valor do saque for maior que o saldo da conta,
    //    o método deve lançar uma exceção com a mensagem "Saldo insuficiente".
    println("\nExercício 6: ")
    ex1.realizarSaque()

    // 7. Crie uma função que receba uma lista de strings e retorne a string mais longa da lista.
    println("\nExercício 7: ")
    print("A maior palavra da lista é: ")
    ex1.maiorString(arrayOf("Maçã", "Bananas", "Cereja", "Uva"))

    // 8. Crie uma classe "Funcionario" com os atributos "nome", "idade" e "salario". Crie uma função que receba uma
    //    lista de funcionários e retorne o funcionário com o maior salário.
    println("\nExercício 8: ")
    ex1.maiorSalario()

    // 9. Crie uma função que receba uma lista de números inteiros e retorne uma lista com os números em ordem
    //    crescente, sem usar o método de ordenação da linguagem.
    println("\nExercício 9: ")
    ex1.ordemSemFun(mutableListOf(5, 2, 8, 1, 9, 3))

    // 10. Crie uma classe "Triangulo" com os atributos "base" e "altura". Adicione um método chamado "area" que calcula
    //     e retorna a área do triângulo.
    println("\nExercício 10: ")
    ex1.calcArea()

    // 11. Crie uma função que receba uma lista de strings e retorne uma lista com todas as strings que começam com a letra
    //     "A", em ordem alfabética.
    println("\nExercício 11: ")
    ex1.apenasAemOrdem(arrayOf("Abacaxi", "Banana", "Maçã", "Amora", "Uva", "Abóbora"))

    // 12. Utilize um mapa para representar um dicionário de palavras e suas traduções.
    println("\nExercício 12: ")
    ex1.dicionario("cat")

    // 13. Crie uma função de ordem superior chamada operacaoMatematica que aceita dois números e uma função lambda.
    //     A função operacaoMatematica deve aplicar a função lambda aos dois números e retornar o resultado.
    //     Em seguida, crie algumas funções lambda para realizar operações matemáticas, como soma, subtração,
    //     multiplicação e divisão. Use a função de ordem superior para realizar essas operações com diferentes pares de números.
    println("\nExercício 13: ")
    val soma: (Double, Double) -> Double = { a, b -> a + b }
    val subtracao: (Double, Double) -> Double = { a, b -> a - b }
    val multiplicacao: (Double, Double) -> Double = { a, b -> a * b }
    val divisao: (Double, Double) -> Double = { a, b -> if (b != 0.0) a / b else Double.NaN }

    println("Soma: ${ex1.operacaoMatematica(10.0, 5.0, soma)}")
    println("Subtração: ${ex1.operacaoMatematica(10.0, 5.0, subtracao)}")
    println("Multiplicação: ${ex1.operacaoMatematica(10.0, 5.0, multiplicacao)}")
    println("Divisão: ${ex1.operacaoMatematica(10.0, 5.0, divisao)}")

    //14. Crie uma função de extensão chamada isPalindromo para a classe String que verifica se a string é um palíndromo.
    //    A função deve ignorar espaços em branco e ser case-insensitive (não distinguir maiúsculas de minúsculas).
    //    Em seguida, use essa função para verificar se algumas palavras são palíndromos.
    println("\nExercício 14: ")
    fun String.isPalindromo(): Boolean {
        val cleanText = this.replace("\\s".toRegex(), "").lowercase()
        val txeTnaelc = cleanText.reversed()
        return cleanText == txeTnaelc
    }
    val p_1 = "radar"
    val p_2 = "Ame a ema"
    val p_3 = "cachorro"
    println("$p_1 eh um palíndromo? ${p_1.isPalindromo()}")
    println("$p_2 eh um palíndromo? ${p_2.isPalindromo()}")
    println("$p_3 eh um palíndromo? ${p_3.isPalindromo()}")

    //15. Vamos criar um programa que utilize funções de alta ordem para operar em um array de números inteiros.
    //    Você deve criar funções de alta ordem para realizar as seguintes operações: filtrarPares: Uma função que filtra
    //    e retorna apenas os números pares do array; dobrarValores: Uma função que dobra o valor de cada número no array;
    //    somarValores: Uma função que calcula a soma de todos os valores no array. Em seguida, crie um array de números
    //    inteiros e utilize as funções de alta ordem para realizar essas operações.
    println("\nExercício 15: ")
    println("Todos os números: ${intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).joinToString()}")
    println("Números Pares: ${ex1.filterPairs(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).joinToString()}")
    println("Números Dobrados: ${ex1.doubleValues(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).joinToString()}")
    println("Soma dos Valores: ${ex1.sumValues(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))}")
}