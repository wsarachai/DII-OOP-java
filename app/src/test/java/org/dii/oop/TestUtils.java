package org.dii.oop;

public class TestUtils {
    public static boolean startWith(String base, String compare) {
        if (OsUtils.isWindows()) {
            base = base.replace("\n", "\r\n");
        }
        return base.trim().startsWith(compare);
    }
}
