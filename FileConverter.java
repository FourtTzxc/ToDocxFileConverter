import java.io.File;
import java.io.IOException;

public class FileConverter {
    private File nameFile;
    public File convertFile(File pdfFile){
        String fileName = pdfFile.getName();
        try{
            nameFile = File.createTempFile("Word File Converted","docx",FileChoserWindow.fileDirect);
            pdfFile.renameTo(nameFile);
            nameFile.delete();
        }catch (IOException e){
            e.getMessage();
        }
        catch (NullPointerException e){

        }
        return pdfFile;
    }
    public File getNameFile(){
        return nameFile;
    }

}
