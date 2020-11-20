package grammer.my.exception;

/**
 * Player的测试类.
 *
 * @author qyq
 * @date 2020-06-18 11:18
 **/
public class PlayerTest {
  public static void main(String[] args) {
    Player player = new Player();
    try {
      //当播放歌曲大于10的时候抛出异常
      player.play(12);
    } catch (NoThisSongException e) {
      //打印异常消息
      System.out.println(e.getMessage());
    }
  }
}
