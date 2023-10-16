package coordinate.domain;

/**
 * 추상화를 할때 이것을 interface로 추상화 해야할지,
 *                      아니면 abstract로 추상화를 해야할지 고민이 됨..
 *
 * 처음에는 interface로 정의하였으나, 공통적으로 points를 관리하기 위해 abstract 추상클래스로 변경
 */
public abstract class Shape {
    abstract Double getArea();
}
