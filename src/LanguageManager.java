import java.util.Scanner;

public enum LanguageManager {
    INSTANCE;

    private Language language;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void huehue(){
        System.out.println("Zmenit jazyk?..");
        String nextLine = InputManager.INSTANCE.getString();
        if (nextLine.equals("ces")) {
            LanguageManager.INSTANCE.setLanguage(Language.CESTINA);
        } else if (nextLine.equals("eng")) {
            LanguageManager.INSTANCE.setLanguage(Language.ENGLISH);
        }
    }
}
