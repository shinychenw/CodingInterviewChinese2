/**
 * @ClassName ReplaceSpaces
 * @Description TODO
 * @Author yuchenwang
 * @Date 2019-04-22 15:44
 * @Version 1.0
 **/
public class ReplaceSpaces {
    public String replaceBlank(String str, int length) {

        if(str == null || length <= str.length()){
            return str;
        }

        char[] ch = new char[length];
        int originalLength = str.length();
        int numberOfBlank = 0;
        for(int i = 0; i < originalLength; i++){
            if(str.charAt(i) == ' '){
                numberOfBlank++;
            }
        }
        int newLength = originalLength + numberOfBlank * 2;
        if(newLength > length){
            return str;
        }

        int indexOfOriginal = originalLength - 1;
        int indexOfNew = newLength - 1;

        while(indexOfOriginal >=0){
            if(str.charAt(indexOfOriginal) == ' '){
                ch[indexOfNew--] = '0';
                ch[indexOfNew--] = '2';
                ch[indexOfNew--] = '%';

            }
            else {
                ch[indexOfNew--] = str.charAt(indexOfOriginal);
            }

            indexOfOriginal--;
        }

        return String.copyValueOf(ch).trim();
    }

    public ReplaceSpaces() {
    }
}
