package com.saurabh.pussgrc.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.saurabh.pussgrc.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_about, container, false);

        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_computer,"Computer Science","Computer Science & Engineering department aims at producing technically competent professionals who can excel in today's age of technology and fulfill demands of trained IT professionals in the industry. The curriculum is designed in such a manner that the students are able to sail through the intense competition smoothly."));
        list.add(new BranchModel(R.drawable.ic_mech,"Mechanical Engineering","This discipline of engineering in SSGPURC has the most lively and highly energized group of engineers. Students have left their mark in several premier institutes all over India including ITTs. Main difference lies in the approach of both the students and the faculty which knows exactly WHAT to achieve and HOW to achieve."));
        list.add(new BranchModel(R.drawable.ic_it,"Information Technology","Information Technology is the study, design, development, application, implementation, support or management of computer-based information systems. In the era where there is demand for trained IT professionals this department provides the students with a good infrastructure and highly qualified faculty to produce skilled professionals."));
        list.add(new BranchModel(R.drawable.ic_ece,"Electronics & Communications","Department of Electronics & Communication is one of the most sought after department of SSGPURC and boasts of excellent infrastructure. The students are motivated to take up challenging projects and enhance their practical skills in electronics. The department is well equipped in all aspects and has the following labs."));

        adapter = new BranchAdapter(getContext(),list);

        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.college_image);

        Picasso.get()
                .load("https://firebasestorage.googleapis.com/v0/b/pussgrc-24a1a.appspot.com/o/Gallery%2F%5BB%405d0c1e9jpg?alt=media&token=0b9f277a-5a0c-4fb4-ac93-d95bf456ed71")
                .into(imageView);


        return view;
    }
}