public class StringManipulator {
    private String word1;
    private String word2;

    public StringManipulator(){
        word1 = "hello";
        word2 = "world";
    }
    public StringManipulator(String x, String y){
        word1 = x;
        word2 = y;
    }
    public String combineStrings(){
        return word1 + word2;
    }
    public int getCombinedLength(){
        return word1.length() + word2.length();
    }
    public String firstHalf(){
        int half = word1.length() / 2;
        return word1.substring(0, half);
    }
    public int indexOfFirstLetter(){
        return word1.indexOf(word2.substring(0,1));
    }
    public String swapFirstAndSecondHalf(){
        int half = word1.length() / 2;
        String firstPart = word1.substring(0, half);
        String secondPart = word1.substring(half);
        return secondPart + firstPart;
    }
}
