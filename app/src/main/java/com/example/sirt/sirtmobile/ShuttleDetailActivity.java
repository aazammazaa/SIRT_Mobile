package com.example.sirt.sirtmobile;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Vini Mishra on 17-May-17.
 */

public class ShuttleDetailActivity extends ShuttlesActivity {
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuttle_details);

        Intent i = getIntent();
        position = i.getExtras().getInt("position");
        final ArrayList<MainAdapter> words = new ArrayList<MainAdapter>();
        switch (position) {
            case 0:
                words.add(new MainAdapter("7:10 AM", "Nayapura"));
                words.add(new MainAdapter("7:15 AM", "Akbarpur"));
                words.add(new MainAdapter("7:17 AM", "Sagar Homes"));
                words.add(new MainAdapter("7:19 AM", "Danish Kunj"));
                words.add(new MainAdapter("7:20 AM", "Bima Kunj"));
                words.add(new MainAdapter("7:22 AM", "Mahabali Nagar"));
                words.add(new MainAdapter("7:24 AM", "Sainath Nagar"));
                words.add(new MainAdapter("7:29 AM", "Sarvdharm"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 1:
                words.add(new MainAdapter("7:20 AM", "Nahar"));
                words.add(new MainAdapter("7:25 AM", "Chuna Bhatti"));
                words.add(new MainAdapter("7:30 AM", "Chinar Island"));
                words.add(new MainAdapter("7:35 AM", "Ketki Hostel"));
                words.add(new MainAdapter("7:45 AM", "Bittan Market"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 2:
                words.add(new MainAdapter("7:30 AM", "Kamla Nagar Thana"));
                words.add(new MainAdapter("7:35 AM", "Kotra "));
                words.add(new MainAdapter("7:37 AM", "Vaishali Nagar"));
                words.add(new MainAdapter("7:40 AM", "MANIT"));
                words.add(new MainAdapter("7:45 AM", "Rahul Nagar"));
                words.add(new MainAdapter("7:45 AM", "Patrakar Colony"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 3:
                words.add(new MainAdapter("9:10 AM", "Bharat Nagar"));
                words.add(new MainAdapter("9:15 AM", "Nizamuddin"));
                words.add(new MainAdapter("7:45 AM", "V-Mart"));
                words.add(new MainAdapter("7:55 AM", "Kalpana Nagar"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 4:
                words.add(new MainAdapter("7:40 AM", "Chetak Bridge-I"));
                words.add(new MainAdapter("7:45 AM", "Chetak Bridge-II"));
                words.add(new MainAdapter("7:55 AM", "Anna Nagar"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 5:
                words.add(new MainAdapter("7:35 AM", "Railway Colony"));
                words.add(new MainAdapter("7:40 AM", "Shakti Nagar"));
                words.add(new MainAdapter("7:43 AM", "Panchvati"));
                words.add(new MainAdapter("7:45 AM", "Barkheda"));
                words.add(new MainAdapter("7:50 AM", "Rishipuram"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 6:
                words.add(new MainAdapter("7:40 AM", "Jyoti Talkies"));
                words.add(new MainAdapter("7:10 AM", "SIRT"));
                break;
            case 7:
                words.add(new MainAdapter("7:30 AM", "P & T Square"));
                words.add(new MainAdapter("7:32 AM", "Ambedkar Nagar"));
                words.add(new MainAdapter("7:34 AM", "Mata Mandir"));
                words.add(new MainAdapter("7:36 AM", "Jain Mandir"));
                words.add(new MainAdapter("7:40 AM", "2nd Stop"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 8:
                words.add(new MainAdapter("7:40 AM", "Minal"));
                words.add(new MainAdapter("7:43 AM", "J.K. Road"));
                words.add(new MainAdapter("7:45 AM", "1 No. Gate"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 9:
                words.add(new MainAdapter("6:56 AM", "Mandideep"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 10:
                words.add(new MainAdapter("7:10 AM", "Shahajahanabad Tanki"));
                words.add(new MainAdapter("7:13 AM", "Pari Bajar"));
                words.add(new MainAdapter("7:16 AM", "Koh-E-Fiza"));
                words.add(new MainAdapter("7:20 AM", "Gufa Mandir"));
                words.add(new MainAdapter("7:30 AM", "Militri Area"));
                words.add(new MainAdapter("7:35 AM", "Nariyalkheda"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 11:
                words.add(new MainAdapter("7:20 AM", "Polytechnic Chauraha"));
                words.add(new MainAdapter("7:22 AM", "Kamala Park"));
                words.add(new MainAdapter("7:23 AM", "Peergate"));
                words.add(new MainAdapter("7:30 AM", "Budhwara"));
                words.add(new MainAdapter("7:32 AM", "Lady Hospital"));
                words.add(new MainAdapter("7:35 AM", "Bharat Takies Square"));
                words.add(new MainAdapter("7:40 AM", "Barkhedi Fatak"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 12:
                words.add(new MainAdapter("7:20 AM", "Ayushman"));
                words.add(new MainAdapter("7:25 AM", "Campion Tiraha"));
                words.add(new MainAdapter("7:27 AM", "Hotel Management"));
                words.add(new MainAdapter("7:30 AM", "1100 Quarters"));
                words.add(new MainAdapter("7:32 AM", "Hanuman Mandir"));
                words.add(new MainAdapter("7:34 AM", "Indore Bank"));
                words.add(new MainAdapter("7:37 AM", "10 No. Stop"));
                words.add(new MainAdapter("7:40 AM", "Narmada Hospital"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 13:
                words.add(new MainAdapter("7:48 AM", "Vidhya Sagar"));
                words.add(new MainAdapter("7:50 AM", "Kali Badi"));
                words.add(new MainAdapter("7:55 AM", "Piplani Gandhi Market"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 14:
                words.add(new MainAdapter("7:30 AM", "Coach Factory"));
                words.add(new MainAdapter("7:35 AM", "Dwaraka Nagar"));
                words.add(new MainAdapter("7:40 AM", "Railway Station"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 15:
                words.add(new MainAdapter("7:20 AM", "Bharat Talkies"));
                words.add(new MainAdapter("7:22 AM", "Sangam Talkies"));
                words.add(new MainAdapter("7:24 AM", "Alpana Tiraha"));
                words.add(new MainAdapter("7:26 AM", "Bus Stand"));
                words.add(new MainAdapter("7:30 AM", "Dharmkanta"));
                words.add(new MainAdapter("7:32 AM", "Sindhi Colony"));
                words.add(new MainAdapter("7:33 AM", "Super Bazar"));
                words.add(new MainAdapter("7:35 AM", "D.I.G. Bunglow"));
                words.add(new MainAdapter("7:37 AM", "Nariyalkheda"));
                words.add(new MainAdapter("7:40 AM", "Karond Fatak"));
                words.add(new MainAdapter("7:42 AM", "Housing Board"));
                words.add(new MainAdapter("7:45 AM", "People Square"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 16:
                words.add(new MainAdapter("7:20 AM", "Laharpur"));
                words.add(new MainAdapter("7:25 AM", "16 Dukan"));
                words.add(new MainAdapter("7:27 AM", "Raja Bhoj"));
                words.add(new MainAdapter("7:30 AM", "Bagsewania"));
                words.add(new MainAdapter("7:33 AM", "Ahmedpur"));
                words.add(new MainAdapter("7:40 AM", "Surendra Palace"));
                words.add(new MainAdapter("7:42 AM", "Narayan Nagar"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 17:
                words.add(new MainAdapter("7:20 AM", "Lal Ghati"));
                words.add(new MainAdapter("7:25 AM", "Chanchal Square"));
                words.add(new MainAdapter("7:30 AM", "3EME Center"));
                words.add(new MainAdapter("7:35 AM", "Data Colony"));
                words.add(new MainAdapter("7:40 AM", "Asharambapu Square"));
                words.add(new MainAdapter("7:45 AM", "New Jail"));
                words.add(new MainAdapter("8:15 AM", "SIRT"));
                break;
            case 18:
                words.add(new MainAdapter("7:50 AM", "Patel Nagar"));
                words.add(new MainAdapter("7:52 AM", "Raj Express"));
                words.add(new MainAdapter("7:55 AM", "Anand Nagar"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 19:
                words.add(new MainAdapter("7:40 AM", "Gautam Nagar"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 20:
                words.add(new MainAdapter("7:30 AM", "Subhash Fhatak"));
                words.add(new MainAdapter("7:40 AM", "Prabhat Pump"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 21:
                words.add(new MainAdapter("7:20 AM", "Saitan Market"));
                words.add(new MainAdapter("7:23 AM", "Kati Pahadi"));
                words.add(new MainAdapter("7:25 AM", "Trilanga"));
                words.add(new MainAdapter("7:27 AM", "Sevoy Complex"));
                words.add(new MainAdapter("7:30 AM", "Indus Garden"));
                words.add(new MainAdapter("7:35 AM", "South Avenue"));
                words.add(new MainAdapter("7:40 AM", "Ishwar Nagar"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 22:
                words.add(new MainAdapter("7:20 AM", "Nehru Nagar"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 23:
                words.add(new MainAdapter("7:30 AM", "Depo Square"));
                words.add(new MainAdapter("7:32 AM", "Unique College"));
                words.add(new MainAdapter("7:34 AM", "Jawahar Chouwk"));
                words.add(new MainAdapter("7:36 AM", "Katju Hospital"));
                words.add(new MainAdapter("7:37 AM", "Rang Mahal"));
                words.add(new MainAdapter("7:40 AM", "New Market"));
                words.add(new MainAdapter("7:42 AM", "Nanake Pump"));
                words.add(new MainAdapter("7:45 AM", "Sanjivini"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 24:
                words.add(new MainAdapter("8:00 AM", "Piplani"));
                words.add(new MainAdapter("8:15 AM", "SIRT"));
                break;
            case 25:
                words.add(new MainAdapter("7:20 AM", "Samarda"));
                words.add(new MainAdapter("7:25 AM", "Krishnapuram"));
                words.add(new MainAdapter("7:27 AM", "Radhapuram"));
                words.add(new MainAdapter("7:29 AM", "11 Mill"));
                words.add(new MainAdapter("7:40 AM", "Danish"));
                words.add(new MainAdapter("7:45 AM", "Ahemadpur Fhatak"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 26:
                words.add(new MainAdapter("7:20 AM", "Dana Pani"));
                words.add(new MainAdapter("7:22 AM", "Iahwar Nagar"));
                words.add(new MainAdapter("7:27 AM", "12 No. Stop"));
                words.add(new MainAdapter("7:30 AM", "Sai Baba Board"));
                words.add(new MainAdapter("7:33 AM", "11 No. Stop"));
                words.add(new MainAdapter("7:35 AM", "Shalimar"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 27:
                words.add(new MainAdapter("7:30 AM", "RRL"));
                words.add(new MainAdapter("7:33 AM", "Sagar Public School"));
                words.add(new MainAdapter("7:35 AM", "Alkapuri"));
                words.add(new MainAdapter("7:40 AM", "Panchwati"));
                words.add(new MainAdapter("7:45 AM", "Awadhpuri / Vivekanand School"));
                words.add(new MainAdapter("7:50 AM", "Kanchan Nagar"));
                words.add(new MainAdapter("7:52 AM", "Gopal Nagar / SOS"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 28:
                words.add(new MainAdapter("7:30 AM", "Lilli Talkies Square"));
                words.add(new MainAdapter("7:32 AM", "Raj Takies Square"));
                words.add(new MainAdapter("7:35 AM", "Jinsi Square"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 29:
                words.add(new MainAdapter("7:35 AM", "Karond"));
                words.add(new MainAdapter("7:37 AM", "Bhopal Hospital"));
                words.add(new MainAdapter("7:40 AM", "Peoples Hospital"));
                words.add(new MainAdapter("7:45 AM", "Bhanpur Bridge"));
                words.add(new MainAdapter("7:50 AM", "Damkheda"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 30:
                words.add(new MainAdapter("7:40 AM", "Ayodhya Ashish Pump"));
                words.add(new MainAdapter("7:45 AM", "Rajiv Nagar"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 31:
                words.add(new MainAdapter("7:45 AM", "Tanatan Dhaba"));
                words.add(new MainAdapter("7:47 AM", "Narela"));
                words.add(new MainAdapter("7:50 AM", "Sagar Avenue"));
                words.add(new MainAdapter("7:55 AM", "Ayodhya Andar"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 32:
                words.add(new MainAdapter("7:50 AM", "Ashoka Garden Pani Tanki"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 33:
                words.add(new MainAdapter("6:20 AM", "Sehore"));
                words.add(new MainAdapter("7:30 AM", "Bairagarh Police Thana"));
                words.add(new MainAdapter("7:40 AM", "Jain Nagar"));
                words.add(new MainAdapter("7:42 AM", "Panchwati"));
                words.add(new MainAdapter("8:15 AM", "SIRT"));
                break;
            case 34:
                words.add(new MainAdapter("6:20 AM", "Vidisha"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 35:
                words.add(new MainAdapter("7:25 AM", "Bajaria Thana"));
                words.add(new MainAdapter("7:27 AM", "Bada Hamidia School"));
                words.add(new MainAdapter("7:30 AM", "Mahamai Bagh"));
                words.add(new MainAdapter("7:45 AM", "Ashoka Garden Thana"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 36:
                words.add(new MainAdapter("7:50 AM", "Ashoka Garden Mandi"));
                words.add(new MainAdapter("7:55 AM", "Manpreet Hotel"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
            case 37:
                words.add(new MainAdapter("7:45 AM", "Bogdha Pul"));
                words.add(new MainAdapter("7:50 AM", "Capital"));
                words.add(new MainAdapter("8:10 AM", "SIRT"));
                break;
        }
        ShuttleDetailsAdapter adapter = new ShuttleDetailsAdapter(this, words);
        final ListView listView = (ListView) findViewById(R.id.shuttle_details);
        listView.setAdapter(adapter);
    }
}
