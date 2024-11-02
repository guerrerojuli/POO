package parcial02.c22022.ej02;

import java.util.*;

public class MultilingualDictionary {
    private final Language language;
    private final Map<Language, Map<String, String>> dict;

    public MultilingualDictionary(Language language) {
        this.language = language;
        this.dict = new EnumMap<>(Language.class);
    }

    public MultilingualDictionary addTranslation(String word, Language language, String translation) {
        if (this.language.equals(language))
            throw new RuntimeException("Cannot add " + language + " translations");
        dict.putIfAbsent(language, new HashMap<>());
        dict.get(language).putIfAbsent(word, translation);
        return this;
    }

    public String getTranslation(String word, Language language) {
        if (!dict.getOrDefault(language, new HashMap<>()).containsKey(word))
            throw new RuntimeException("No " + language + " translation for " + word);
        return dict.get(language).get(word);
    }

    public int translationsCount(Language language) {
        return dict.getOrDefault(language, new HashMap<>()).size();
    }

    public int removeTranslations(Language language) {
        Map<String, String> translations = dict.remove(language);
        return translations == null ? 0 : translations.size();
    }
}
