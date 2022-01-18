package domain;

/**
 * packageName : domain
 * fileName : Main
 * author : haedoang
 * date : 2022-01-18
 * description :
 */
public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Beverage tea = new Tea();

        coffee.prepareRecipe();

        System.out.println("===================");

        tea.prepareRecipe();
    }
}
