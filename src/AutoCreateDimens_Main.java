import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * 根据一个已知的dimens文件生成各sw文件
 */
public class AutoCreateDimens_Main {

    public static void main(String[] args) {
        int wudthDp = 360; // 已知的文件的宽度dp
        DimensParser parser = new DimensParser();
        try {
            //文件目录 项目的dimens目录下
            List<DimenValues> list = parser.parse(
                new FileInputStream(Config.path + File.separator + "dimens.xml"));
            DimensCreator creator = new DimensCreator(Config.path, list, wudthDp);
            creator.createAll();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
