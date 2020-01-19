package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class QuestionScreen extends AppCompatActivity implements View.OnClickListener {

    TextView score;
    TextView a;
    TextView b;
    TextView c;
    TextView question;

    String[] FQuestion1;
    String[] FQuestion2;
    String[] FQuestion3;
    String[] FQuestion4;

    boolean isCorrectA = false;
    boolean isCorrectB = false;
    boolean isCorrectC = false;

    int i = 1;
    int sc = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_screen);

        score = findViewById(R.id.tvScore);
        question = findViewById(R.id.tvQuestion);
        a = findViewById(R.id.tvChoiceA);
        b = findViewById(R.id.tvChoiceB);
        c = findViewById(R.id.tvChoiceC);
        score.setText("Score:"+sc);

        questions();

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.tvChoiceA:
                if (isCorrectA){
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    i++;
                    System.out.print("i="+i);
                    sc++;
                    score.setText("Score:"+sc);
                    questions();
                }else {Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    i++;
                    questions();
                }
            break;
            case R.id.tvChoiceB:
                if (isCorrectB){
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    i++;
                    System.out.println("i="+i);
                    sc++;
                    score.setText("Score:"+sc);
                    questions();
                }else {
                    Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                    i++; questions();
                }
            break;
            case R.id.tvChoiceC:
                if (isCorrectC){
                    Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
                    i++;
                    System.out.println("i="+i);
                    sc++;
                    score.setText("Score:"+sc);
                    questions();
                }else {Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show();
                i++;
                questions();
                }
            break;
        }
    }
    int[] d = random();
    public void questions(){
        String[] question1 = {"How many points are on a Maple leaf?","12","11","10","11"};

        String[] question2 = {"What is Canada's national sport?","Ice hockey","Lacrosse","Polar-Bear riding","Lacrosse"};

        String[] question3 = {"When was the Canadian Flag made?","1957","1868","1965","1965"};

        String[] question4 = {"When did Canada get independence?","1965","1867","1868","1867"};

        String[] question5 = {"How many time zones are in Canada?","4","6","7","6"};

        String[] question6 = {"How many oceans border Canada?","4","2","3","3"};

        String[] question7 = {"When is Canada Day?","July 1st","July 4th","May 31st","July 1st"};

        String[] question8 = {"What is the National Animal of Canada","Polar Bear","Beaver","Otter","Beaver"};

        List<String[]> list = new ArrayList<>();
        list.add(question1);
        list.add(question2);
        list.add(question3);
        list.add(question4);
        list.add(question5);
        list.add(question6);
        list.add(question7);
        list.add(question8);



        FQuestion1 = list.get(d[0]);
        FQuestion2 = list.get(d[1]);
        FQuestion3 = list.get(d[2]);
        FQuestion4 = list.get(d[3]);

        if(i == 1) {
            question.setText(FQuestion1[0]);
            a.setText(FQuestion1[1]);
            b.setText(FQuestion1[2]);
            c.setText(FQuestion1[3]);

            if (FQuestion1[1].equals(FQuestion1[4])) {
                isCorrectA = true;
            } else if (FQuestion1[2].equals(FQuestion1[4])) {
                isCorrectB = true;
            } else isCorrectC = true;

        }else if(i == 2){
            question.setText(FQuestion2[0]);
            a.setText(FQuestion2[1]);
            b.setText(FQuestion2[2]);
            c.setText(FQuestion2[3]);

            if (FQuestion2[1].equals(FQuestion2[4])){
                isCorrectA = true;
            }else if (FQuestion2[2].equals(FQuestion2[4])){
                isCorrectB = true;
            }else isCorrectC = true;
        } else if (i == 3) {
            question.setText(FQuestion3[0]);
            a.setText(FQuestion3[1]);
            b.setText(FQuestion3[2]);
            c.setText(FQuestion3[3]);

            if (FQuestion3[1].equals(FQuestion3[4])) {
                isCorrectA = true;
            } else if (FQuestion3[2].equals(FQuestion3[4])) {
                isCorrectB = true;
            } else isCorrectC = true;
        } else if (i == 4){
            question.setText(FQuestion4[0]);
            a.setText(FQuestion4[1]);
            b.setText(FQuestion4[2]);
            c.setText(FQuestion4[3]);
            if (FQuestion4[1].equals(FQuestion4[4])){
                isCorrectA = true;
            } else if (FQuestion4[2].equals(FQuestion4[4])){
                isCorrectB = true;
            }else isCorrectC = true;
        } else if (i == 5){
            Intent intent = new Intent(QuestionScreen.this,com.example.quiz.Screen2.class);
            intent.putExtra("SCORE",String.valueOf(sc));
            startActivity(intent);
        }
    }

    public int[] random(){
        Random random1 = new Random();
        int rand1 = random1.nextInt(4);

        Random random2 = new Random();
        int rand2 = random2.nextInt(4);

        while (rand1 == rand2){
            random2 = new Random();
            rand2 = random2.nextInt(4);
        }

        Random random3 = new Random();
        int rand3 = random3.nextInt(4);

        while (rand1 == rand3 || rand2 == rand3){
            random3 = new Random();
            rand3 = random3.nextInt(4);
        }

        Random random4 = new Random();
        int rand4 = random4.nextInt(4);

        while (rand3 == rand4 || rand2 == rand4 || rand1 == rand4){
            random4 = new Random();
            rand4 = random4.nextInt(4);
        }

        System.out.println(rand1);
        System.out.println(rand2);
        System.out.println(rand3);
        System.out.println(rand4);

        int[] randomArray = {rand1,rand2,rand3,rand4};
        return randomArray;
    }
}
