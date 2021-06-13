public class MegaBytesConverter {
    public static long printMegaBytesAndKiloBytes(double kiloBytes) {

        if (kiloBytes < 0) {
            return -1;
        }
        return Math.round(kiloBytes % 1024);
    }

    public static void printConversion(double kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            long bitsPerBytes = printMegaBytesAndKiloBytes(kiloBytes);
            System.out.println(kiloBytes + " KB = " +(kiloBytes/1024) + " MB and " +(kiloBytes%1024)+ " KB");
        }
    }
}