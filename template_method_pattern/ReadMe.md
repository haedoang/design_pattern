## Template Method Pattern 이란?

상속을 통해 기능을 확장하는 디자인 패턴으로 변하지 않는 기능을 슈퍼클래스(대부분 추상클래스)에 만들어두고 확장할 기능을 서브클래스에 구현하는 디자인 패턴이다. 슈퍼클래스는 추상 메소드 또는 오버라이드 가능한 메소드를 통해 기본 알고리즘을 담고 있는 `템플릿 메서드`를 만든다. 서브 클래스는 템플릿 메서드를 통해 기능을 확장할 수 있다.

### Template Method Code
#### 슈퍼클래스

```java
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
```
- 템플릿 메서드(Template Method): 슈퍼 클래스의 기본 알고리즘을 템플릿 메서드로 선언한다. `prepareRecipe` 메소드가 템플릿 메서드이며 기본 알고리즘은 변경할 수 없기 때문에 `final`로 선언한다.
- Concrete Method(Complete Method): Template 메소드가 정의된 클래스에 `완전히 정의`되는 메소드로 서브 클래스에서 재정의하지 않는다. 위의 코드에서는 `boilWater`, `pourInCup` 메소드가 해당되며 공통적인 기능을 수행한다고 할 수 있다.
- Abstract Method: 서브 클래스에서 반드시 재정의해야 하는 메서드로 `brew` 메서드가 해당된다.
- hook Method: 서브 클래스에서 선택적으로 오버라이드 할 수 있는 메소드를 말한다.



### 하위 클래스

```java
public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("차를 우려낸다.");
    }
}

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
```
- 하위 클래스는 슈퍼 클래스의 추상 메소드를 구현한다. 또한 선택적으로 hook method를 재정의할 수 있다.


### 사용하는 이유는?
- 중복되는 코드를 줄일 수 있다.
- `헐리우드 원칙`인 `의존성 부패`문제를 방지할 수 있다. 의존성 부패란 의존 관계 체인이 존재할 때 발생한다. 템플릿 메서드 패턴은 하위 요소에서 상위 요소를 의존하지 않는다. 상위 요소의 추상 메소드만 구현할 뿐이다. 을 만족한다.
