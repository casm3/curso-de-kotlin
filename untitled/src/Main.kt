//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* Sobre Kotlin
- Kotlin é uma linguagem estaticamente tipada desenvolvida pela JetBrains
- Lançada em 2016 e projetada para interoperar com Java
- Amplamente utilizada para desenvolvimento Android e backend
- É concisa e segura, evitando problemas comuns em Java
- Multiplataforma e apoiada pela Google desde 2017
 */
fun main() { // Declara função principal, ponto de entrada do programa
    val name: String = "Carlos"
    var greeting: String = "Olá, Kotlin!"
    println("Hello, $name!") // Função println responsável por imprimir texto no console
    // cifrão pode ser usado para acessar valor como em uma template string
    println(greeting)
}

/* Elementos Básicos:
- Funções: Funções são declaradas com a palavra-chave fun.
- Variáveis: Podem ser declaradas usando val (imutável) ou var (mutável).
    - val name: String = "Kotlin"
    - var age: Int = 1
- Comentários: Comentários de uma linha começam com // e de múltiplas linhas com /* */.
 */

/* Condicionais
if (age > 0) {
    println("Kotlin é incrível!")
} else {
    println("Algo está errado!")
}
 */

/*TODO
- Exercício 1: Personalize o Hello, World!
    - Modifique o programa "Hello, World!" para imprimir o seu nome ao invés de "World".
    - Exemplo de saída: Hello, [SeuNome]!
- Exercício 2: Trabalhando com Variáveis
    - Crie uma variável greeting que armazene a mensagem "Olá, Kotlin!" e a imprima usando println.
 */
