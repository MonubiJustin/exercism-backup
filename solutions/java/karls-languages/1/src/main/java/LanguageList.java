import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.size() == 0;
    }

    public void addLanguage(String language) {
       languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
       return languages.contains(language);
    }

    public boolean isExciting() {
    var upperCase = languages.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());

        return upperCase.contains("JAVA") || upperCase.contains("KOTLIN");

    }  
}
