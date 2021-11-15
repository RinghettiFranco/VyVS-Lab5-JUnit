import java.util.Locale;

public class Word {

    public String concatenate(String s1, String s2){
        return s1 + s2;
    }

    public String subStringFrom(int index, String s){
        return s.substring(index);
    }

    public String wordPairity(String s){
        if(s.length()%2 == 0){
            return "Par";
        } else {
            return "Impar";
        }
    }

    public boolean allCaps(String s){
        return s.equals(s.toUpperCase(Locale.ROOT));
    }
}
