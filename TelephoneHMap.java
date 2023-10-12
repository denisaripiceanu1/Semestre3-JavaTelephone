import java.util.HashMap;
import java.util.Map;

public class TelephoneHMap {

    private HashMap<Character, String> caracteresMap;

    public TelephoneHMap() {
        caracteresMap = new HashMap<>();
        caracteresMap.put('0', "0 ");
        caracteresMap.put('1', "1");
        caracteresMap.put('2', "2abc");
        caracteresMap.put('3', "3def");
        caracteresMap.put('4', "4ghi");
        caracteresMap.put('5', "5jkl");
        caracteresMap.put('6', "6mno");
        caracteresMap.put('7', "7pqrs");
        caracteresMap.put('8', "8tuv");
        caracteresMap.put('9', "9wxyz");
        caracteresMap.put('#', "#,;:");
        caracteresMap.put('*', "*?.");
    }

    public String decoderSaisieSMS(String saisie) {
        if (saisie == null || saisie.isEmpty()) {
            return ""; // Retourne une chaîne vide si la saisie est vide ou nulle
        }

        String message = "";
        char caractereSequence = saisie.charAt(0);
        int nbOcc = 1;

        for (int i = 1; i < saisie.length(); i++) {
            char caractereCourant = saisie.charAt(i);

            if (caractereCourant == caractereSequence) {
                nbOcc++;
            } else {
                if (caractereSequence != '.') {
                    String caracteresTouche = caracteresMap.get(caractereSequence);
                    if (caracteresTouche != null) {
                        char caractereObtenu = caracteresTouche.charAt((nbOcc - 1) % caracteresTouche.length());
                        message += caractereObtenu;
                    } else {
                        message += caractereSequence; // Ajoute le caractère spécial non reconnu
                    }
                }

                caractereSequence = caractereCourant;
                nbOcc = 1;
            }
        }

        String caracteresTouche = caracteresMap.get(caractereSequence);
        if (caracteresTouche != null) {
            char caractereObtenu = caracteresTouche.charAt((nbOcc - 1) % caracteresTouche.length());
            message += caractereObtenu;
        } else {
            message += caractereSequence; // Ajoute le caractère spécial non reconnu
        }

        return message;
    }

}
