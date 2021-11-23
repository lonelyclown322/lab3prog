package utilities;

public enum Home {

    PyatachokHome("дом Пяточка"), RabbitHome("дом Кролика"),
    PoohHome("дом Винни-Пуха"), TigerHome("дом Тигры"),
    RooHome("дом Кенги и Ру"), KengaHome("дом Кенги и Ру");
    private final String homeName;

    Home(String s) {
        this.homeName = s;
    }

    public String getHomeName() {
        return homeName;
    }
}
