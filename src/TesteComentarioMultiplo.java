public class TesteComentarioMultiplo {

    public static void main(String[] args) {
        /*
        De acordo com a precedencia de operadores, o código
        será executado na seguinte ordem:
        Primeiro será resolvido o que está entre parênteses,
        em seguida a multiplicação e ao final a adição.
         */
        System.out.println(1 + (7 % 9) * 3);

    }
}
