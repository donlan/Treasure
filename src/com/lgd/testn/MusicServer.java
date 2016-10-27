package com.lgd.testn;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MusicServer extends Service {

private MediaPlayer mediaPlayer;

@Override
public IBinder onBind(Intent intent) {
// TODO Auto-generated method stub
return null;
}

@SuppressWarnings("deprecation")
@Override
public void onStart(Intent intent,int startId){
super.onStart(intent, startId);

if(mediaPlayer==null){

// R.raw.mmp����Դ�ļ���MP3��ʽ��
mediaPlayer = MediaPlayer.create(this, R.raw.hap);
mediaPlayer.setLooping(true);
mediaPlayer.start();

}
}

@Override
public void onDestroy() {
// TODO Auto-generated method stub
super.onDestroy();
mediaPlayer.stop();
}
}
