import java.io.File;

public class FreeSpaceOfDiskDemo {
    public static void main(String[] args) {
        File file = new File("E:");
        long totalspace = file.getTotalSpace();// convert it to megabytes.
        long freeSpace = file.getFreeSpace();

        System.out.println("Total Space in Bytes: " + totalspace);
        System.out.println("Free Space in Bytes: " + freeSpace);
        System.out.println();

        System.out.println("Total Space in KibiBytes: " + (totalspace / 1024));
        System.out.println("Free Space in KibiBytes: " + freeSpace / 1024);
        System.out.println();

        System.out.println("Total Space in Mebibytes: " + (totalspace / 1024) / 1024);
        System.out.println("Free Space in MebiBytes: " + (freeSpace / 1024) / 1024);
        System.out.println();

        System.out.println("Total Space in GigaBytes: " + ((totalspace / 1024) / 1024) / 1024);
        System.out.println("Free Space in GigaBytes: " + ((freeSpace / 1024) / 1024) / 1024);
        System.out.println();

        System.out.println("Total Space in TebiBytes: " + (((totalspace / 1024) / 1024) / 1024) / 1024);
        System.out.println("Free Space in TebiBytes: " + (((freeSpace / 1024) / 1024) / 1024) / 1024);
        // ((((size/1024.0)/1024.0)/1024.0)/1024.0);
    }
}
