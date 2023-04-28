package com.pedro.vlc;

import org.videolan.libvlc.MediaPlayer;
/**
 * Created by pedro on 25/06/17.
 */
public interface VlcListener {
  void onOpening();

  void onComplete();

  void onError();

  //　event.getBuffering(). Hide if 100, else Show
  void onBuffering(MediaPlayer.Event event);
}
