public class LogLevels {
    
    public static String message(String logLine) {
        return logLine
            .substring(logLine.indexOf(":")+1)
            .trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        return logLine
            .substring(start+1, end)
            .toLowerCase();
    }

    public static String reformat(String logLine) {
        String str = "%s (%s)";
        return String.format(str, message(logLine), logLevel(logLine));
}
}
