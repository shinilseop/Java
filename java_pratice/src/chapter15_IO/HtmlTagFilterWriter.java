package chapter15_IO;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class HtmlTagFilterWriter extends FilterWriter {

    StringWriter tmp = new StringWriter();
    boolean inTag = false;

    /**
     * Create a new filtered writer.
     *
     * @param out a Writer object to provide the underlying stream.
     * @throws NullPointerException if <code>out</code> is <code>null</code>
     */
    protected HtmlTagFilterWriter(Writer out) {
        super(out);
    }

    public void write(int c) throws IOException {
        char ch = (char)c;
        if (c == '<') {
            inTag = true;
        } else if (c == '>' && inTag) {
            inTag = false;
            tmp = new StringWriter();
            return;
        }

        if (inTag) {
            tmp.write(ch);
        } else {
            out.write(ch);
        }
    }

    public void close() throws IOException {
        out.write(tmp.toString());
        super.close();
    }
}
