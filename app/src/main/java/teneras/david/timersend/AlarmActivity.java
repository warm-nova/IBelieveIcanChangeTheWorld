package teneras.david.timersend;

import android.app.Activity;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

/**
 * Created by lidecai on 2015/10/28.
 */
public class AlarmActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new AlertDialog.Builder(AlarmActivity.this).setTitle("定时器").setMessage("时间到了~").setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                AlarmActivity.this.finish();
            }
        }).show();
    }
}
