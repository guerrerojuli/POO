package parcial02.c22022.ej02;

public class MultilingualDictionaryTester {
    public static void main(String[] args) {
        // Se instancia un diccionario multilingüe donde se pueden agregar traducciones
        // de palabras en español a palabras en otros lenguajes.
        MultilingualDictionary mlD = new MultilingualDictionary(Language.SPANISH);


        // Se agrega la traducción de objeto a object en inglés
        mlD.addTranslation("objeto", Language.ENGLISH, "object");


        // Se consulta la traducción de objeto en inglés
        System.out.println(mlD.getTranslation("objeto", Language.ENGLISH)); // object


        // Como ya existe una traducción para la palabra objeto en inglés no tiene efecto
        mlD.addTranslation("objeto", Language.ENGLISH, "thing");
        System.out.println(mlD.getTranslation("objeto", Language.ENGLISH)); // object


        mlD.addTranslation("programación", Language.ENGLISH, "programming")
                .addTranslation("programación", Language.FRENCH, "programmation")
                .addTranslation("lenguaje", Language.FRENCH, "la langue")
                .addTranslation("línea", Language.ENGLISH, "line");


        System.out.println(mlD.getTranslation("lenguaje", Language.FRENCH)); // la langue


        // Indica la cantidad de traducciones al inglés
        System.out.println(mlD.translationsCount(Language.ENGLISH)); // 3
        System.out.println(mlD.translationsCount(Language.FRENCH)); // 2
        System.out.println(mlD.translationsCount(Language.SPANISH)); // 0
        System.out.println(mlD.translationsCount(Language.ITALIAN)); // 0


        // Remueve todas las traducciones al francés e indica cuántas traducciones removió
        System.out.println(mlD.removeTranslations(Language.FRENCH)); // 2
        System.out.println(mlD.translationsCount(Language.FRENCH)); // 0
        System.out.println(mlD.removeTranslations(Language.ITALIAN)); // 0


        try {
            // Falla porque no existe una traducción al francés de la palabra lenguaje
            mlD.getTranslation("lenguaje", Language.FRENCH);
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // No FRENCH translation for lenguaje
        }

        try {
            // Falla porque no se agregó una traducción al italiano de la palabra objeto
            mlD.getTranslation("objeto", Language.ITALIAN);
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // No ITALIAN translation for objeto
        }


        // Se instancia un diccionario multilingüe donde se pueden agregar traducciones
        // de palabras en inglés a palabras en otros lenguajes.
        MultilingualDictionary mlD2 = new MultilingualDictionary(Language.ENGLISH);
        mlD2.addTranslation("object", Language.SPANISH, "objeto");
        System.out.println(mlD2.translationsCount(Language.SPANISH)); // 1


        try {
            // Falla porque no se pueden agregar traducciones al inglés
            // porque mlD2 es un diccionario de palabras en inglés
            mlD2.addTranslation("foo", Language.ENGLISH, "bar");
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Cannot add ENGLISH translations
        }
    }


}
