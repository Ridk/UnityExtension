package com.ridk.unityextension;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;

/**
 * Created by Ridk on 2018/1/25.
 */

public interface IRidkActivity {


    public abstract void onCreate(Bundle savedInstanceState);


    public abstract void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults);


    public abstract void onActivityResult(int requestCode, int resultCode, Intent data);
}
