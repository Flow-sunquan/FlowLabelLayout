package com.example.sunquan.flowlabel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sunquan.View.FlowLabelLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private FlowLabelLayout center_flowlayout;
    private FlowLabelLayout left_flowlayout;

    private List<String> centerlabelList = new ArrayList<String>();

    private List<String> leftlabelList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
        setViewData();
    }

    private void initView() {
        setContentView(R.layout.activity_main);
        center_flowlayout = (FlowLabelLayout) this.findViewById(R.id.center_flowlayout);
        left_flowlayout = (FlowLabelLayout) this.findViewById(R.id.left_flowlayout);
    }

    private void initData() {
        centerlabelList.add("爱笑的她");

        centerlabelList.add("如此美妙");

        centerlabelList.add("她的眼睛 闪亮如灯火");
        centerlabelList.add("女孩别走 你落下了我");
        centerlabelList.add("岁月 你别催");
        centerlabelList.add("该来的我不推");

        centerlabelList.add("该还的我还");
        centerlabelList.add("不觉被迷惑");

        centerlabelList.add("她看着我");
        centerlabelList.add("像在说什么");
        centerlabelList.add("难道她也注意到我");


        leftlabelList.add("停了的钟");

        leftlabelList.add("他不懂");

        leftlabelList.add("裂缝中的阳光");
        leftlabelList.add("心底的影子");
        leftlabelList.add("愿你的故事细水长流");
        leftlabelList.add("古风醉故人 故人非良人");

        leftlabelList.add("放任潇洒");
        leftlabelList.add("终成无畏");

        leftlabelList.add("唱歌的人不许掉眼泪");
        leftlabelList.add("在人间");
        leftlabelList.add("一个人孩子的心愿");

    }

    private void setViewData() {
        ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.leftMargin = 10;
        lp.rightMargin = 10;
        lp.topMargin = 15;
        lp.bottomMargin = 15;

        for (int i = 0; i < centerlabelList.size(); i++) {
            TextView view = new TextView(this);
            String lable_str = centerlabelList.get(i);
            view.setText(lable_str);

            view.setBackgroundDrawable(getResources().getDrawable(R.drawable.lable_textview_bg));
            view.setTextColor(getResources().getColor(R.color.ffffff_color));

            center_flowlayout.addView(view, lp);

            center_flowlayout.requestLayout();
        }

        for (int i = 0; i < leftlabelList.size(); i++) {
            TextView view = new TextView(this);
            String lable_str = leftlabelList.get(i);
            view.setText(lable_str);

            view.setBackgroundDrawable(getResources().getDrawable(R.drawable.lable_textview_bg));
            view.setTextColor(getResources().getColor(R.color.ffffff_color));

            left_flowlayout.addView(view, lp);

            left_flowlayout.requestLayout();
        }


    }
}
