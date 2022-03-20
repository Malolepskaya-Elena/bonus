public class Main {
    public static void main(String[] args) {

        int account = 100;
        int refill = 1100;

        int bonus = refill > 1000 ? refill / 100: 0;
        int finalAccount = account + refill + bonus;
        System.out.println("Ваш бонус составил: " + bonus + "руб.");
        System.out.println("Итого сумма на счету: " + finalAccount + "руб.");
        
    }
}