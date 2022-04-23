package solved;
import java.util.*;
public class EncodeAndDecodeTinyURL {

	Map<String,String>encodeMap=new HashMap<>();
    Map<String,String>decodeMap=new HashMap<>();
    String baseDomain="http://tinyurl.com/";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(!encodeMap.containsKey(longUrl)){
            String shortUrl=baseDomain+String.valueOf(encodeMap.size()+1);
            encodeMap.put(longUrl,shortUrl);
            decodeMap.put(shortUrl,longUrl);
        }
        return encodeMap.get(longUrl);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return decodeMap.get(shortUrl);
    }
}
