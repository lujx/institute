package grammer.myIO;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * 2018/03/06
 * 输入流InputStream：可以从该对象中读出一个字节序列。
 * 输出流OutputStream：可以从该对象中写入一个字节序列。
 * 字节序列的源和目的地通常是文件，还可以是网络连接、内存块。
 * <p>
 * Unicode的每个字符都用多字节表示，所以为处理Unicode码元，
 * 从Reader和Writer中继承出来了一些类，这些类的读写操作都是基于两字节的。
 */
public class Stream {
  
  /**
   *
   */
  public void inputFromConsole() {
    Scanner in = new Scanner(System.in);
    while (!in.hasNext("quit")) {
      //获取下一行
      System.out.println(in.nextLine());
      //获取下个单词，以空白符做分隔
		/*System.out.println(in.next());
		//下个整数
		System.out.println(in.nextInt());*/
    }
    in.close();
  }
  
  public void inputFromFile(){
    String dir = System.getProperty("user.dir");
  
    System.out.println(dir);
    Scanner fileIn= null;
    try {
      fileIn = new Scanner(Paths.get("IO.txt"));
      System.out.println(fileIn.nextLine());
      fileIn.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  
  public static void main(String[] args) throws IOException {
    Stream stream = new Stream();
    stream.inputFromFile();
  }
}
