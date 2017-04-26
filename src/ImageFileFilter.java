import javax.swing.filechooser.FileFilter;
import java.io.File;

class ImageFileFilter extends FileFilter {

    String extension;

    public ImageFileFilter(String extension) {
        this.extension = extension;
    }

    public boolean accept(File file) {
        if (file.isDirectory())
            return true;

        String fileName = file.getName();
        int index = fileName.lastIndexOf('.');

        if (index > 0 && index < fileName.length() - 1) {
            String extension = fileName.substring(index + 1).toLowerCase();
            if (extension.equals(this.extension))
                return true;
        }
        return false;
    }

    public String getDescription() {
        if (extension.equals("jpg"))
            return "JPEG File (*.jpg)";
        if (extension.equals("tif"))
            return "TIFF File (*.tif)";
        return "";
    }
}
