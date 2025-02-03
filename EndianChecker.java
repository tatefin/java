import java.nio.ByteBuffer;
public class EndianChecker {
    public static String checkEndian() {
        int num = 0x1;
        ByteBuffer buffer = ByteBuffer.allocate(4);
        buffer.putInt(num);
        byte[] bytes = buffer.array();
        if (bytes[0] == 0) {
            return "Big-endian";
        } else {
            return "Little-endian";
        } 
     } 
  }
