package co.za.cput.CRP_Obey;

/**
 *
 */
public class WordFile {
    private File file = new File();

    public String containsWords()
    {
        return file.getContents("words");
    }
}
