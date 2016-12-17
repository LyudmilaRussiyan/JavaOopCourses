import java.util.ArrayList;

public class Directory
{
    ArrayList<File> files=new ArrayList<>();
    ArrayList<Directory> directories=new ArrayList<>();
    private int size;

    public Directory() {

    }
    public Directory(Directory directory,File file){
        this.directories.add(directory);
        this.files.add(file);
        this.size= this.size+ file.getSize();

        for (int i=0;i<directory.files.size();i++) {

            this.size = this.size + directory.files.get(i).getSize();
        }
    }

    public Directory(File... file) {
        for (File f : file) {
            this.files.add(f);
            this.size = this.size + f.getSize();
        }
    }

    public Directory add(Directory d) {
        this.directories.add(d);
        this.size= this.size+ directories.get(directories.size() - 1).getSize();
        return this;
    }

    public void add(File... file) {
        for (File f : file) {
            this.files.add(f);
            this.size = this.size + f.getSize();
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString()
    {
        return "Directory{" +
                "files=" + files +
                ", directories=" + directories +
                ", size=" + size +
                '}';
    }
}
