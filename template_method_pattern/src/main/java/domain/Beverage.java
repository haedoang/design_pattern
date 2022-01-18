package domain;

/**
 * packageName : domain
 * fileName : Person
 * author : haedoang
 * date : 2022-01-18
 * description :
 */
public abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments(); //hook method
    }

    private void boilWater() {
        System.out.println("물을 끓입니다.");
    }

    protected abstract void brew();


    private void pourInCup() {
        System.out.println("내용물을 컵에 따른다.");
    }

    public void addCondiments() {
        System.out.println("허브를 넣는다.");
    }
}
