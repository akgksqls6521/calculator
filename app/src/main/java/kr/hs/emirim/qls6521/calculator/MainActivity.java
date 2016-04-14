package kr.hs.emirim.qls6521.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Button bntPlus,bntMinus,bntDivide,bntMultiply;
    EditText editNum1, editNum2;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //액티비티 메인에 만들어놓은 것들 중 요소이름을 가진 애들이 클래스로 존재한다
        //메모리에 올려줌 .. 인플레이션 , 참조값을 반환, 메모리에 저장된 참조값을 반환...
        bntPlus=(Button)findViewById(R.id.bnt_plus);
        bntMinus=(Button)findViewById(R.id.bnt_minus);
        bntDivide=(Button)findViewById(R.id.bnt_devide);
        bntMultiply=(Button)findViewById(R.id.bnt_multiply);
        editNum1=(EditText)findViewById(R.id.editText1);
        editNum2=(EditText)findViewById(R.id.editText2);
        textResult=(TextView)findViewById(R.id.text_result);
        bntPlus.setOnClickListener(this);
        bntMinus.setOnClickListener(this);
        bntDivide.setOnClickListener(this);
        bntMultiply.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {//추상메소드 onclick 안에 onclicklister가 있기때문에 onClick을 구현해줘야함
        //2개의 EditText에 입력된 값을 반환받는다
        String num1Str=editNum1.getText().toString(); //text를 반환받음, String으로 강제형변환해도 된다
        String num2Str=editNum2.getText().toString();
        int num1=Integer.parseInt(num1Str);
        int num2=Integer.parseInt(num2Str);
        double result=0;
        switch(v.getId()){
            case R.id.bnt_plus:
                result=num1+num2;
                break;
            case R.id.bnt_minus:
                result=num1-num2;
                break;
            case R.id.bnt_devide:
                result=(double)num1/num2;
                break;
            case R.id.bnt_multiply:
                result=num1*num2;
                break;
        }
        textResult.setText("* 계산 결과 : "+result);

    }
}
