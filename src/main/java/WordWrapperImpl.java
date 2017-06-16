import java.util.ArrayList;
import java.util.List;

public class WordWrapperImpl implements WordWrapper {
    public List<String> wrapWords(String string, int maximumCharactersPerLine) {
        ArrayList<String> ListOfLines = new ArrayList<>();
        String [] split = string.split(" ");
        String temp = "";
        int x = 1;
        for(String s: split){
            if((temp.length() + s.length()) <= maximumCharactersPerLine){
                temp += s;
                if(temp.length() + 1 <= maximumCharactersPerLine) {
                    temp += " ";
                }
                if(x == split.length){
                    ListOfLines.add(temp.trim());
                }
            }else{
                ListOfLines.add(temp.trim());
                temp = s + " ";
            }
            x++;
        }

        return ListOfLines;
    }
}
