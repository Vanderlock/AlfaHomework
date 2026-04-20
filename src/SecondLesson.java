import java.util.Random;

public class SecondLesson {
    public static void main(String[] args) {
        Random random = new Random();
        int age = random.nextInt(100);
        double amount = -100000 + (200000 * random.nextDouble());
        boolean hasInvitation = true;
        boolean isInBlackList = false;


        //Совершеннолетний ли
        boolean isAdult = age>= 18;
        //Хороший чел, если есть бабки или есть приглашение
        boolean isGoodPayer = false;

        if ((hasInvitation || amount > 50000) && !isInBlackList){
            isGoodPayer = true;
        }
        //По условию задачи сохраняем в переменную значение в черном списке или нет
        boolean isCleanHistory = !isInBlackList;

        if (isAdult && isGoodPayer) {
            //Тут условие: снимать таксу только при положительном балансе
            double tax;
            if (amount > 0) {
                tax = amount * 0.075;
            } else {
                tax = 0;
            }
            System.out.println("Этот чувачек проходит, потому что:");
            System.out.println("Совершеннолетний: " + isAdult);
            System.out.println("Есть приглашение: " + hasInvitation);
            System.out.println("У него на счету: " + amount);
            System.out.println("В черном списке: " + isInBlackList);
            System.out.println("Но обязательный добровольный взнос за вход с него: " + tax);
        } else {
            System.out.println("Этот чувачек не проходит, потому что:");
            System.out.println("Совершеннолетний: " + isAdult);
            System.out.println("Есть приглашение: " + hasInvitation);
            System.out.println("У него на счету: " + amount);
            System.out.println("В черном списке: " + isInBlackList);
        }

    }
}
