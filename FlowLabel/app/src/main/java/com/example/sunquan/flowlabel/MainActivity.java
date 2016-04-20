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

    private List<String> labelList = new ArrayList<String>();

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
        labelList.add("爱笑的她");
        labelList.add("理想一个归期");

        labelList.add("茶底世界");
        labelList.add("睡了吗");
        labelList.add("如此美妙");

        labelList.add("她的眼睛 闪亮如灯火");
        labelList.add("女孩别走 你落下了我");
        labelList.add("岁月 你别催");
        labelList.add("该来的我不推");

        labelList.add("该还的我还");
        labelList.add("不觉被迷惑");

        labelList.add("她看着我");
        labelList.add("像在说什么");
        labelList.add("难道她也注意到我");
    }

    private void setViewData() {
        ViewGroup.MarginLayoutParams lp = new ViewGroup.MarginLayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.leftMargin = 10;
        lp.rightMargin = 10;
        lp.topMargin = 15;
        lp.bottomMargin = 15;

        for (int i = 0; i < labelList.size(); i++) {
            TextView view = new TextView(this);
            String lable_str = labelList.get(i);
            view.setText(lable_str);

            view.setBackgroundDrawable(getResources().getDrawable(R.drawable.lable_textview_bg));
            view.setTextColor(getResources().getColor(R.color.ffffff_color));

            center_flowlayout.addView(view, lp);

            center_flowlayout.requestLayout();
        }

        for (int i = 0; i < labelList.size(); i++) {
            TextView view = new TextView(this);
            String lable_str = labelList.get(i);
            view.setText(lable_str);

            view.setBackgroundDrawable(getResources().getDrawable(R.drawable.lable_textview_bg));
            view.setTextColor(getResources().getColor(R.color.ffffff_color));

            left_flowlayout.addView(view, lp);

            left_flowlayout.requestLayout();
        }


    }
}
