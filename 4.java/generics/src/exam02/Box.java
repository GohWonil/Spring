package exam02;

public class Box<T extends Fruit> {  //T -> Object, 객체를 만드는 시점 : 투입된 타입으로 형변환 즉, 타입의 객체가 만들어질때(마지막)
  private T item;

//  private static T item2; static에는 T 제네릭(타입)이 사용되지 못한다 처음부터 사용이 가능해서
//  private T[] itme3 = new T[]; 배열에도 T 제네릭(타입) 사용되지 못한다 메모리 할당 공간이 몰라서 사용 불가
  public T getItem(){
    return item;
  }

  public void setItem(T item){
    this.item = item;
  }
  public void printItem(){
    //T -> Object, 객체를 만드는 시점 -> 투입된 타입으로 형변환
    //T -> Fruit, 객체를 만드는 시점 -> 투입된 타입으로 형변환
    item.print();
  }
}
