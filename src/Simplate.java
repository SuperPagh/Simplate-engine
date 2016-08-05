import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/**
 * Created by Pagh on 31-Jul-16.
 */
public class Simplate {

    private String template;
    private String[] tags = new String[]{"{%", "%}"};
    private HashMap<String, String> data;

    // Change the tags that enclose words to substitute
    public void changeTags(String start, String end) {


    }

    // Load in an array of datasets
    public void addData(HashMap<String, String>... data) {


    }

    // Initialize the template-string from a filepath
    public void loadTemplateFromFile(String filepath) {


    }

    // Initialize the template-string from a string
    public void loadTemplate(String template) {


    }

    public void saveFile(String filepath, String fileExt) throws FileNotFoundException, UnsupportedEncodingException {

        //Generate file
        //TODO: Add choice for other encoding
        PrintWriter writer = new PrintWriter(filepath + "." + fileExt, "UTF-8");



    }

    // Substitute the found tags with other data
    public String subData() {
        if (this.data == null) {
            throw new IllegalStateException("No data added.");
        }

        //TODO: Mac users might have issues with this, as their line terminator might be different
        String strLinebreaks[] = template.split("\\r\\n|\\n|\\r");



    }

}
