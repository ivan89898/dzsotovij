public class Main {
    public static void main(String[] args) {
        double startingCount = 10.00; // началькое количество рублей на текущем счёте клиента
        double refill = 1500.00; // сумма, на которую клиент пополнил счёт
        double bonus = 0.01; // бонус
        if ((refill > 1000.00)) {
            System.out.println("Количество бонусных рублей:" + (refill * bonus));
        } else {
            System.out.println("Не начислено бонусных рублей");
        }
        System.out.println("Итоговый счёт:" + (startingCount + refill+ refill * bonus) + " рублей");

    }
}
