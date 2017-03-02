package uk.co.virunee.rounderscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0.0);
        displayForTeamAOut(0);
    }

    double team_a_score = 0;
    int team_a_outs = 0;

    public void addOneRounderA(View view) {
        team_a_score = team_a_score + 1;
        displayForTeamA(team_a_score);
    }

    public void addHalfRounderA(View view) {
        team_a_score = team_a_score + 0.5;
        displayForTeamA(team_a_score);
    }

    public void addOneOutA(View view) {
        team_a_outs = team_a_outs + 1;
        displayForTeamAOut(team_a_outs);
    }


    //Displays the given score for Team A.

    public void displayForTeamA(double team_a_score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(team_a_score));
    }

    public void displayForTeamAOut(int team_a_outs) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_outs);
        scoreView.setText(String.valueOf(team_a_outs));
    }

    // OVERFLOW MENU STUFF //



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }
}
