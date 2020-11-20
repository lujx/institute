package grammer.my.exception;

/**
 * Play类，播放歌曲.
 *
 * @author qyq
 * @date 2020-06-18 11:13
 **/
public class Player {

  public void play(int index) throws NoThisSongException {
    //播放歌曲大于10的时候抛出异常
    if(index > 10) {
      throw new NoThisSongException("您播放的歌曲不存在");
    }
  }
}
