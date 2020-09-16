package utils;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liangze
 * @create 2020-07-25 上午10:16
 */
public class EmojiKit {

    public static boolean hasEmoji(String content){
        Pattern pattern = Pattern.compile("[\ud83c\udc00-\ud83c\udfff]|[\ud83d\udc00-\ud83d\udfff]|[\u2600-\u27ff]");
        Matcher matcher = pattern.matcher(content);
        if(matcher.find()){
            return true;
        }
        return false;
    }

}





