import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {

        String[] petyasBasket = {"курица", "бананы", "творог"};
        String[] kolyasBasket = {"курица", "бананы", "творог"};
        String[] terentiusBasket = {"пиво", "пельмени", "ласка магия черного"};

// 1. Сравните между собой корзины по количеству товаров:
// 1) Пети и Коли
        System.out.println(petyasBasket.length == kolyasBasket.length);
// 2) Пети и Терентия
        System.out.println(petyasBasket.length == terentiusBasket.length);

// 2. Сравните между собой корзины по их составу:
// 1) Пети и Коли
        System.out.println(Arrays.equals(petyasBasket, kolyasBasket));
// 2) Пети и Терентия
        System.out.println(Arrays.equals(petyasBasket, terentiusBasket));

// 3. Проведите ценное исследование - привлекают ли пользователей товары с более длинными названиями?
// Для этого выведите среди всех покупок Пети, Коли и Терентия товары:
        String[][] fullMatrix = {petyasBasket, kolyasBasket, terentiusBasket};
// 1) с самым длинным названием
        String resultLongestString = fullMatrix[0][0];
        for (String[] arr : fullMatrix) {
            for (String s : arr) {
                if (s.length() > resultLongestString.length()) {
                    resultLongestString = s;
                }
            }
        }
        System.out.println("Самое длинное название: " + resultLongestString);

// 2) с самым коротким названием
        String resultShortestString = fullMatrix[0][0];

        for (String[] arr : fullMatrix) {
            for (String s : arr) {
                if (s.length() < resultShortestString.length()) {
                    resultShortestString = s;
                }
            }
        }
        System.out.println("Самое короткое название: " + resultShortestString);

// 3) среднюю длину названия товара среди всех представленных товаров
        int totalLength = 0;
        int count = 0;

        for (String[] arr : fullMatrix) {
            for (String str : arr) {
                if (str != null) {
                    totalLength += str.length();
                    count++;
                }
            }
        }
        double avg = (count > 0) ? (double) totalLength / count : 0;
        System.out.println("Средняя длина: " + avg);

//    Задай массив с тремя любыми паролями (строки).
//            Проверь что каждый из паролей:
//    длиннее 8 символов
//    не начинается с символа 1
//    не заканчивается символом z
//    не содержит последовательность "1234"
//    не содержит последовательность "qwerty"
//    Результат проверки выведи на экран в формате:
//    "пароль 'значение_пароля' прошел проверку: true/false"

        String[] passwords = {"correCtPass", "1ncorrectPass", "QWErTYpassword"};

        for (String p : passwords) {
            boolean ok = p.length() > 8 &&
                    !p.startsWith("1") &&
                    !p.toLowerCase().endsWith("z") &&
                    !p.contains("1234") &&
                    !p.toLowerCase().contains("qwerty");
            System.out.printf("пароль '%s' прошел проверку: %b%n", p, ok);
        }
    }
}
