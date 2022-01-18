package domain;

/**
 * packageName : domain
 * fileName : Tea
 * author : haedoang
 * date : 2022-01-18
 * description :
 */
public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("차를 우려낸다.");
    }
}
