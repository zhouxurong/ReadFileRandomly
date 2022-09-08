import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;

public class ReadFileRandomlyTwo {
    public static void main(String[] args) throws IOException {
        //写入的文件
        Path path = Paths.get("D:", "bosc_work", "random_work", "readfilerandomly.txt");

        //通过OutputStream写内容到文件
        Path outputPath = Paths.get("D:", "bosc_work", "random_work");
        //目录不存在的话创建目录
        if (! Files.exists(outputPath)) {
            Files.createDirectory(outputPath);
        }
        //将输出文件放入到新加的目录下
        Path outPath = outputPath.resolve("result.txt");
        boolean fileExists = Files.exists(outPath);
        OutputStream outputStream;
        if (fileExists) {
            outputStream = Files.newOutputStream(outPath, StandardOpenOption.APPEND);
        } else {
            outputStream = Files.newOutputStream(outPath, StandardOpenOption.CREATE);
        }

        List<String> list = Files.readAllLines(path);
        int size = list.size();
        for(int i = 0; i < 10000; i++){
            //Double random = Math.random();
            int random = new Random().nextInt(size);
            System.out.println(list.get(random));
        }
    }
}
