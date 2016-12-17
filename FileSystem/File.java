public class File
{
    private int size;

    public File(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString()
    {
        return "File{" +
                "size=" + size +
                '}';
    }
}
