package com.elmansouriadil.adilosfragment.adilosfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yeah on 4/21/2016.
 */
public class fragmentTwo extends Fragment {
    public fragmentTwo(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup viewGroup,Bundle bundle){
        return inflater.inflate(R.layout.fragment_two,viewGroup,false);
    }
}
