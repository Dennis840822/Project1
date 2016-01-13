package com.example.dennis.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.*;//import log除錯函數進來

public class Project1 extends AppCompatActivity {

    private Button button1;//私領域宣告Button的ID為button1
    private EditText number1,number2;//私領域宣告EditText的ID為number1和number2
    private TextView result;//私領域宣告TextView的ID為result

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project1);
        button1 = (Button)findViewById(R.id.button1);//Button找到的ID確認是不是為(等於)button1
        number1 = (EditText)findViewById(R.id.number1);//EditText找到的ID確認是不是為(等於)number1
        number2 = (EditText)findViewById(R.id.number2);//EditText找到的ID確認是不是為(等於)number2
        result = (TextView)findViewById(R.id.result);//TextView找到的ID確認是不是為(等於)result

        button1.setOnClickListener(new View.OnClickListener() {//當button按下去後所執行的觸發事件
            @Override
            public void onClick(View view) {//觸發事件裡的事件
                String Sum= number1.getText().toString();//拿到輸入的資料在轉型成String
                int iAge = Integer.parseInt(number2.getText().toString());//拿到輸入的資料再轉型成String再強制轉換整數

                String strSug = "結果:";//宣告strSug為字串，上顯示"結果："
                if (Sum.equals("男")){//判斷(Sum.equals)Sum所取得到的字串，是否和括弧裡的字串一樣
                    if (iAge < 28){//如果iAge小於28
                        strSug = strSug + "不急";//strSug上顯示"結果:"加上"不急"
                        Log.d("Marrisug","man, don`t hurry");//除錯的分類標籤，(標籤裡)的訊息
                    }
                    else if (iAge > 33){
                        strSug += getString(R.string.married);
                        Log.d("Marrisug", "man, start to find girlfriend!");
                    }
                    //else
                    //strSug += getString(R.string.find);
                }
                    else if(Sum.equals("女")){
                    strSug += "開始找對象";
                    Log.d("Marrisug","woman,don`t hurry!");
                    if (iAge < 25)
                        strSug += "不急";
                    Log.d("Marrisug","woman, hurry to get married!");
                    if (iAge > 30)
                        strSug += "開始找對象";
                        Log.d("Marrisug","woman, start to find boyfriend");
                }
                else
                {
                    strSug += "重新輸入";
                }

                result.setText(strSug);//在TextView的ID:result上(設定)顯示strSug的文字
            }
        });
    }
}
