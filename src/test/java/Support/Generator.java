package Support;

import sun.java2d.pipe.SpanShapeRenderer;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

public class Generator {
    public static String dataAndTimeToFile(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("yyyyMMddhhmmss").format(ts);

    }
}
