import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class ReadFileRandomly {
        public static void main(String[] args) throws IOException {

            Path path = Paths.get("D:", "bosc_work", "random_work", "twoip.txt");

            List<String> list = Files.readAllLines(path);

            // 获取集合大小
            int size = list.size();

            for(int i = 0; i < 10000; i++){
                // 获取随机数
                int random = new Random().nextInt(size);
                // 得到一行
                String str = list.get(random);
                // 输出
                System.out.println("str = " + str);
            }
        }
}
