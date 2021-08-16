package com.example.itsstorytime;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class StoryActivity extends AppCompatActivity {

    TextView story_text;
    ImageView play, stop, img_story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story_activity);

        story_text = findViewById(R.id.story_text);
        play = findViewById(R.id.startButton);
        stop = findViewById(R.id.stopButton);
        img_story = findViewById(R.id.story_img);

        final MediaPlayer[] mediaPlayer = {null};

        String title_story = getIntent().getStringExtra("story_title");
        String text_story = getIntent().getStringExtra("story");

        story_text.setText(text_story);

        if(title_story.equals("The Monkey and the Crocodile")) {
            img_story.setImageResource(R.drawable.the_monkey_and_the_crocodile);
        }
        else if(title_story.equals("The Stork and the Crab")) {
            img_story.setImageResource(R.drawable.the_stork_and_the_crab);
        }

        else if(title_story.equals("The Elephants and the Mice")) {
            img_story.setImageResource(R.drawable.the_elephants_and_the_mice);
        }

        else if(title_story.equals("The Loyal Mongoose")) {
            img_story.setImageResource(R.drawable.the_loyal_mongoose);
        }

        else if(title_story.equals("The Tortoise and the Geese")) {
            img_story.setImageResource(R.drawable.the_tortoise_and_the_geese);
        }

        else if(title_story.equals("A Tale of Three Fish")) {
            img_story.setImageResource(R.drawable.the_tale_of_three_fish);
        }

        else if(title_story.equals("The Foolish Lion and the Clever Rabbit")) {
            img_story.setImageResource(R.drawable.the_foolish_lion_and_the_clever_rabbit);
        }

        else if(title_story.equals("The Jackal and the Drum")) {
            img_story.setImageResource(R.drawable.the_jackal_and_the_drum);
        }

        else if(title_story.equals("The Elephant and the Sparrows")) {
            img_story.setImageResource(R.drawable.the_elephant_and_the_sparrows);
        }

        else if(title_story.equals("The Wise Minister’s Advice")) {
            img_story.setImageResource(R.drawable.the_wise_ministers_advice);
        }

        else if(title_story.equals("Four Friends And A Hunter")) {
            img_story.setImageResource(R.drawable.the_four_friends_and_the_hunter);
        }

        else if(title_story.equals("The Talkative Tortoise")) {
            img_story.setImageResource(R.drawable.the_talkative_tortoise);
        }

        else if(title_story.equals("The King And The Foolish Monkey")) {
            img_story.setImageResource(R.drawable.the_king_and_the_foolish_monkey);
        }

        else if(title_story.equals("The Crane And The Crab")) {
            img_story.setImageResource(R.drawable.the_crane_and_the_crab);
        }

        else if(title_story.equals("The Brahmin’s Dream")) {
            img_story.setImageResource(R.drawable.the_brahmins_dream);
        }

        else if(title_story.equals("The Wolf And The Crane")) {
            img_story.setImageResource(R.drawable.the_wolf_and_the_crane);
        }

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(title_story.equals("The Monkey and the Crocodile")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.monkey);
                    mediaPlayer.start();
                }

                else if(title_story.equals("The Stork and the Crab")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.stork_and_crab);
                    mediaPlayer.start();
                }

                else if(title_story.equals("The Elephants and the Mice")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.the_elephants_and_the_mice);
                    mediaPlayer.start();
                }

                else if(title_story.equals("The Loyal Mongoose")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.the_loyal_mongoose);
                    mediaPlayer.start();
                }

                else if(title_story.equals("The Tortoise and the Geese")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.the_tortoise_and_the_geese);
                    mediaPlayer.start();
                }

                else if(title_story.equals("A Tale of Three Fish")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.a_tale_of_three_fish);
                    mediaPlayer.start();
                }

                else if(title_story.equals("The Foolish Lion and the Clever Rabbit")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.the_foolish_lion_and_the_clever_rabbit);
                    mediaPlayer.start();
                }

                else if(title_story.equals("The Jackal and the Drum")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.the_jackal_and_the_drum);
                    mediaPlayer.start();
                }

                else if(title_story.equals("The Elephant and the Sparrows")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.the_elephant_and_the_sparrows);
                    mediaPlayer.start();
                }

                else if(title_story.equals("The Wise Minister’s Advice")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.the_wise_ministers_advice);
                    mediaPlayer.start();
                }

                else if(title_story.equals("Four Friends And A Hunter")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.four_friends);
                    mediaPlayer.start();
                }

                else if(title_story.equals("The Talkative Tortoise")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.the_talkative_tortoise);
                    mediaPlayer.start();
                }

                else if(title_story.equals("The King And The Foolish Monkey")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.the_king_and_the_foolish_monkey);
                    mediaPlayer.start();
                }

                else if(title_story.equals("The Crane And The Crab")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.the_crane_and_the_crab);
                    mediaPlayer.start();
                }

                else if(title_story.equals("The Brahmin’s Dream")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.the_brahmins_dream);
                    mediaPlayer.start();
                }

                else if(title_story.equals("The Wolf And The Crane")) {
                    final MediaPlayer mediaPlayer = MediaPlayer.create(StoryActivity.this, R.raw.the_wolf_and_the_crane);
                    mediaPlayer.start();
                }
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(StoryActivity.this, "Sorry for inconvenience. This feature will be available soon!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
