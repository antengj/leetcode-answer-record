/**
 * @title 535. TinyURL 的加密与解密
 * @link https://leetcode-cn.com/problems/encode-and-decode-tinyurl/
 * @description
 *      TinyURL是一种URL简化服务， 比如：当你输入一个URL https://leetcode.com/problems/design-tinyurl 时，
 *      它将返回一个简化的URL http://tinyurl.com/4e9iAk.
 *
 *      要求：设计一个 TinyURL 的加密 encode 和解密 decode 的方法。你的加密和解密算法如何设计和运作是没有限制的，
 *      你只需要保证一个URL可以被加密成一个TinyURL，并且这个TinyURL可以用解密方法恢复成原本的URL。
 * @topic 哈希表 数学
 */
package cc.techtips.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyurl {
    public static void main(String[] args) {
        Codec codec = new EncodeAndDecodeTinyurl().new Codec();
        System.out.println(codec.encode("https://www.163.com"));
        System.out.println(codec.decode("http://tinyurl.com/1936475835"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * 解题思路:
     *   将url的hashcode做为key, url做为value存入HashMap
     * 结果:
     *   执行耗时:9 ms,击败了33.45% 的Java用户
     *   内存消耗:39.9 MB,击败了12.50% 的Java用户
     */
    public class Codec {

        private Map<Integer, String> map = new HashMap<>();

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            String shortUrl = "http://tinyurl.com/" + longUrl.hashCode();
            map.put(longUrl.hashCode(), longUrl);
            return shortUrl;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            String longUrlHashCode = shortUrl.replace("http://tinyurl.com/", "");
            return map.get(Integer.parseInt(longUrlHashCode));
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}