import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStatistics2 {
	public static void main(String[] args){
        String txtFileName = "Object Oriented Porgramming/Tutorial/Quote(Pris).txt";
        String docFileName = "Object Oriented Porgramming/Tutorial/Quote(Pris).docx";
        printFileSizeNIO(txtFileName, docFileName);
    }

    private static void printFileSizeNIO(String txtFileName, String docFileName) {
        Path path = Paths.get(txtFileName);
        Path path2 = Paths.get(docFileName);
        try{
            long txtSize = Files.size(path);
            long docSize = Files.size(path2);
            System.out.println("The size in bytes for the txt file is " + String.format("%,d bytes", txtSize));
            System.out.println("The size in bytes for the docx file is " + String.format("%,d bytes", docSize));
            System.out.println("The ratio of txt file size to docx file  size is " + txtSize + " : " + docSize);
        }

