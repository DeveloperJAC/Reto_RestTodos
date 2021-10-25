package co.com.sofka.util;

public enum Title {
    TITLE1("delectus aut autem"),
    TITLE2("quis ut nam facilis et officia qui"),
    TITLE3("fugiat veniam minus"),
    TITLE4("et porro tempora"),
    TITLE5("laboriosam mollitia et enim quasi adipisci quia provident illum"),
    TITLE6("qui ullam ratione quibusdam voluptatem quia omnis");



    private final String value;

    public String getValue() {
        return value;
    }

    Title(String value) {
        this.value = value;
    }
}
