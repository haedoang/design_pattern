package domain;

/**
 * packageName : domain
 * fileName : Coffee
 * author : haedoang
 * date : 2022-01-18
 * description :
 */
public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("커피를 내린다.");
    }

    @Override
    public void addCondiments() {
        System.out.println("시럽을 넣는다.");
    }
}
