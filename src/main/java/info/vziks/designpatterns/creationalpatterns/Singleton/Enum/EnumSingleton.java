package info.vziks.designpatterns.creationalpatterns.Singleton.Enum;

public enum EnumSingleton {
    INSTANCE;
    String string;

    EnumSingleton() {
        this.string = "Singleton";
    }

    public void setString(String string) {
        this.string = string;
    }
}
