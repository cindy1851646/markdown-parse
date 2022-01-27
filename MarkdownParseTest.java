import static org.junit.Assert.*;
import org.junit.*;

<<<<<<< HEAD
=======
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

>>>>>>> e395b86c82c3343dc33aefcfa83d2ac99770a778
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
<<<<<<< HEAD
}
=======

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    
}
>>>>>>> e395b86c82c3343dc33aefcfa83d2ac99770a778
