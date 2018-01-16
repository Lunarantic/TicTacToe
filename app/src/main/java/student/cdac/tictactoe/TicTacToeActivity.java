package student.cdac.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 150840521023 on 21-11-2015.
 */
public class TicTacToeActivity extends AppCompatActivity
{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,newGameButton;
    TextView textView;
    String player1 = "X", player2 = "O";
    int cur,turn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        cur = 1;
        turn = 1;

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        newGameButton = (Button) findViewById(R.id.newgamebutton);

        textView = (TextView) findViewById(R.id.textView);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(cur)
                {
                    case 1 :
                    {
                        b1.setText(player1);
                        cur = 2;
                        break;
                    }
                    case 2 :
                    {
                        b1.setText(player2);
                        cur = 1;
                        break;
                    }
                }

                turn++;
                verify();
                b1.setEnabled(false);
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(cur)
                {
                    case 1 :
                    {
                        b2.setText(player1);
                        cur = 2;
                        break;
                    }
                    case 2 :
                    {
                        b2.setText(player2);
                        cur = 1;
                        break;
                    }
                }

                turn++;
                verify();
                b2.setEnabled(false);
            }
        });

        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(cur)
                {
                    case 1 :
                    {
                        b3.setText(player1);
                        cur = 2;
                        break;
                    }
                    case 2 :
                    {
                        b3.setText(player2);
                        cur = 1;
                        break;
                    }
                }

                turn++;
                verify();
                b3.setEnabled(false);
            }
        });

        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(cur)
                {
                    case 1 :
                    {
                        b4.setText(player1);
                        cur = 2;
                        break;
                    }
                    case 2 :
                    {
                        b4.setText(player2);
                        cur = 1;
                        break;
                    }
                }

                turn++;
                verify();
                b4.setEnabled(false);
            }
        });

        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(cur)
                {
                    case 1 :
                    {
                        b5.setText(player1);
                        cur = 2;
                        break;
                    }
                    case 2 :
                    {
                        b5.setText(player2);
                        cur = 1;
                        break;
                    }
                }

                turn++;
                verify();
                b5.setEnabled(false);
            }
        });

        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(cur)
                {
                    case 1 :
                    {
                        b6.setText(player1);
                        cur = 2;
                        break;
                    }
                    case 2 :
                    {
                        b6.setText(player2);
                        cur = 1;
                        break;
                    }
                }


                turn++;
                verify();
                b6.setEnabled(false);
            }
        });

        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(cur)
                {
                    case 1 :
                    {
                        b7.setText(player1);
                        cur = 2;
                        break;
                    }
                    case 2 :
                    {
                        b7.setText(player2);
                        cur = 1;
                        break;
                    }
                }

                turn++;
                verify();
                b7.setEnabled(false);
            }
        });

        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(cur)
                {
                    case 1 :
                    {
                        b8.setText(player1);
                        cur = 2;
                        break;
                    }
                    case 2 :
                    {
                        b8.setText(player2);
                        cur = 1;
                        break;
                    }
                }

                turn++;
                verify();
                b8.setEnabled(false);

            }
        });

        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(cur)
                {
                    case 1 :
                    {
                        b9.setText(player1);
                        cur = 2;
                        break;
                    }
                    case 2 :
                    {
                        b9.setText(player2);
                        cur = 1;
                        break;
                    }
                }

                turn++;
                verify();
                b9.setEnabled(false);
            }
        });

        newGameButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                buttonClear();
                buttonSwitch(true);
            }
        });
    }

    public void verify()
    {
        Log.d("Checkup", "verify() returned: " + turn);
        String b[] = {b1.getText().toString(),b2.getText().toString(),b3.getText().toString(),b4.getText().toString(),b5.getText().toString(),b6.getText().toString(),b7.getText().toString(),b8.getText().toString(),b9.getText().toString()};

        if (b[0].equals(b[1]) && b[1].equals(b[2]))
        {
            textView.setText((b[0].equals(player1)) ? "Player 1 wins" : (b[0].equals(player2)) ? "Player 2 wins" : "");
            if (!b[0].equals(""))
            buttonSwitch(false);
        }
        else if (b[3].equals(b[4]) && b[4].equals(b[5]))
        {
            textView.setText((b[3].equals(player1)) ? "Player 1 wins" : (b[3].equals(player2)) ? "Player 2 wins" : "");
            if (!b[3].equals(""))
            buttonSwitch(false);
        }
        else if (b[6].equals(b[7]) && b[7].equals(b[8]))
        {
            textView.setText((b[6].equals(player1)) ? "Player 1 wins" : (b[6].equals(player2)) ? "Player 2 wins" : "");
            if (!b[6].equals(""))
            buttonSwitch(false);
        }
        else if (b[0].equals(b[3]) && b[3].equals(b[6]))
        {
            textView.setText((b[0].equals(player1)) ? "Player 1 wins" : (b[0].equals(player2)) ? "Player 2 wins" : "");
            if (!b[0].equals(""))
            buttonSwitch(false);
        }
        else if (b[1].equals(b[4]) && b[4].equals(b[7]))
        {
            textView.setText((b[1].equals(player1)) ? "Player 1 wins" : (b[1].equals(player2)) ? "Player 2 wins" : "");
            if (!b[1].equals(""))
            buttonSwitch(false);
        }
        else if (b[2].equals(b[5]) && b[5].equals(b[8]))
        {
            textView.setText((b[2].equals(player1)) ? "Player 1 wins" : (b[2].equals(player2)) ? "Player 2 wins" : "");
            if (!b[2].equals(""))
            buttonSwitch(false);
        }
        else if (b[0].equals(b[4]) && b[4].equals(b[8]))
        {
            textView.setText((b[0].equals(player1)) ? "Player 1 wins" : (b[0].equals(player2)) ? "Player 2 wins" : "");
            if (!b[0].equals(""))
            buttonSwitch(false);
        }
        else if (b[2].equals(b[4]) && b[4].equals(b[6]))
        {
            textView.setText((b[2].equals(player1)) ? "Player 1 wins" : (b[2].equals(player2)) ? "Player 2 wins" : "");
            if (!b[2].equals(""))
            buttonSwitch(false);
        }
        else if(turn==10)
        {
            textView.setText("Draw");
        }
    }

    public void buttonSwitch(boolean status)
    {
        b1.setEnabled(status);
        b2.setEnabled(status);
        b3.setEnabled(status);
        b4.setEnabled(status);
        b5.setEnabled(status);
        b6.setEnabled(status);
        b7.setEnabled(status);
        b8.setEnabled(status);
        b9.setEnabled(status);
    }

    public void buttonClear()
    {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        textView.setText("");
        cur =1;
        turn=1;
    }
}
