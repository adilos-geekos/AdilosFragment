package com.elmansouriadil.adilosfragment.adilosfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by yeah on 4/21/2016.
 */
public class fragmentOne extends Fragment {
    public fragmentOne(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle sauvgarde){
            return inflater.inflate(R.layout.fragment_one,container,false);
    }
}
