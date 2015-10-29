package teneras.david.timersend;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button setTime;
    Calendar currentTime = Calendar.getInstance();
    EditText sendnumber;
    EditText sendmessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTime=(Button)findViewById(R.id.setTime);
        sendnumber=(EditText)findViewById(R.id.sendNumber);
        sendmessage=(EditText)findViewById(R.id.sendMessage);

        sendmessage.setText("晚安~不要惊讶为什么这么准时的发，因为发送者不是DAVID大人，是个软件啊O(∩_∩)O哈哈哈~");

        setTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar currentTime=Calendar.getInstance();
                new TimePickerDialog(MainActivity.this,0,
                        new TimePickerDialog.OnTimeSetListener()
                        {
                            @Override
                            public void onTimeSet(TimePicker tp,int hourOfDay,int minute)
                            {
                                Intent intent=new Intent(MainActivity.this,AlarmActivity.class);
                                /*PendingIntent pi=PendingIntent.getActivity(MainActivity.this,0,intent,0);
                                Calendar c=Calendar.getInstance();
                                c.setTimeInMillis(System.currentTimeMillis());
                                c.set(Calendar.HOUR, hourOfDay);
                                c.set(Calendar.MINUTE,minute);
                                AlarmManager aManager=(AlarmManager)getSystemService(ALARM_SERVICE);
                                aManager.set(AlarmManager.RTC_WAKEUP,c.getTimeInMillis(),pi);
                                Toast.makeText(MainActivity.this,"设置成功辣~~"+c.getTimeInMillis()+" ",Toast.LENGTH_SHORT).show();*/
                                startActivity(intent);
                            }
                        }
                        ,currentTime.get(Calendar.HOUR_OF_DAY),currentTime.get(Calendar.MINUTE),false).show();


            }
        });

    }

}
