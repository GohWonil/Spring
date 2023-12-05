package exam04;


//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PRIVATE)
//@RequiredArgsConstructor
//@EqualsAndHashCode

//@Data //@Getter, Setter, ToString, EqualsAndHashCode     가 한번에 해결
public class Book {
//    private final String title;
    private String title;

//    @NonNull
    private String author;
    private String publisher;

    private  Book(){}

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Book{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", publisher='" + publisher + '\'' +
            '}';
    }

    protected static class Builder{
        private Book instance = new Book();

        public Builder title(String title){
            instance.title = title;

            return this;
        }

        public Builder author (String author){
            instance.author = author;

            return this;
        }

        public Builder publisher(String publisher){
            instance.publisher = publisher;

            return this;
        }

        public Book build(){
            return instance;
        }
    }

//    public Book(String title){
//        this.title = title; @RequiredArgsConstructor로 대체

}
