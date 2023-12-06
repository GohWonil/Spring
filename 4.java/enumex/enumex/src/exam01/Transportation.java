package exam01;

public enum Transportation {
  BUS("버스", 1400) {
    @Override
    public int getTotal(int preson) {
      return this.price * preson;
    }
  },
  SUBWAY("지하철", 1450) {
    @Override
    public int getTotal(int preson) {
      return this.price * preson;
    }
  },
  TAXI("택시", 4500) {
    @Override
    public int getTotal(int preson) {
      return this.price * preson;
    }
  };
  private final String title;
  protected final int price;
  private Transportation(String title, int price) { //private는 생략이 가능하다
    this.title = title;
    this.price = price;
  }
  public String getTitle(){
    return title;
  }
  public abstract int getTotal(int preson);
}
