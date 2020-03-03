public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        // Стоимость билета в копейках
        int price = 1000_00;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}