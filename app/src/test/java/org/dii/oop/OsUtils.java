package org.dii.oop;

public class OsUtils {
    private static String OS = null;
    public static String getOsName()
    {
        if(OS == null) { OS = System.getProperty("os.name"); }
        return OS;
    }
    public static boolean isWindows()
    {
        return getOsName().startsWith("Windows");
    }

    public static boolean isMaxOs() {
        return getOsName().startsWith("Mac OS X");
    }
}
