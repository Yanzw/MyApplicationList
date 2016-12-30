package com.yanzhiwei.myapplicationlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_hot_movies = (Button) findViewById(R.id.btn_hot_movies);
        Button btn_stock_eagle = (Button) findViewById(R.id.btn_stock_eagle);
        Button btn_xyz_reader = (Button) findViewById(R.id.btn_xyz_reader);
        Button btn_news_app = (Button) findViewById(R.id.btn_news_app);
        Button btn_graduate_design = (Button) findViewById(R.id.btn_graduate_design);

        btn_hot_movies.setOnClickListener(btnOnClickListener);
        btn_stock_eagle.setOnClickListener(btnOnClickListener);
        btn_xyz_reader.setOnClickListener(btnOnClickListener);
        btn_news_app.setOnClickListener(btnOnClickListener);
        btn_graduate_design.setOnClickListener(btnOnClickListener);

    }

    /**
     * 按键监听器
     */
    private View.OnClickListener btnOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.btn_hot_movies:
                    showToastShort(R.string.hot_movies);
                    break;

                case R.id.btn_stock_eagle:
                    showToastShort(R.string.stock_eagle);
                    break;

                case R.id.btn_xyz_reader:
                    showToastShort(R.string.xyz_reader);
                    break;

                case R.id.btn_news_app:
                    showToastShort(R.string.news_app);
                    break;

                case R.id.btn_graduate_design:
                    showToastShort(R.string.graduate_design);
                    break;
            }
        }
    };

    /**
     * 显示提示文字
     *
     * @param stringId
     */
    private void showToastShort(int stringId) {
        Toast.makeText(this, getString(stringId), Toast.LENGTH_SHORT).show();
    }


}
