package com.ridk.unityextension;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import com.unity3d.player.UnityPlayerActivity;

public class RidkActivity extends UnityPlayerActivity {
    private IRidkActivity IRidkA;
    public void AddUnityCallBack(IRidkActivity imrra)
    {
        if(imrra!=null)
        {
            IRidkA =imrra;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (IRidkA !=null)
        {
            IRidkA.onCreate(savedInstanceState);
        }
        else
        {
            Log.w("Ridk", "onCreate is null for Unity. ");
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (IRidkA !=null)
        {
            IRidkA.onRequestPermissionsResult(requestCode,permissions,grantResults);
        }
        else
        {
            Log.w("Ridk", "onRequestPermissionsResult is null for Unity. ");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (IRidkA !=null)
        {
            IRidkA.onActivityResult(requestCode,resultCode,data);
        }
        else
        {
            Log.w("Ridk", "onActivityResult is null for Unity. ");
        }
    }
}
