package Enum;

public enum Level {
    STANDARD("Ini standard le"),
    PREMIUM("Ini Premium Le"),
    VIP("Ini VIP Le");

    private String description;

    Level(String description) {
        this.description = description;
    }

    String getDescription() {
        return description;
    }
}
