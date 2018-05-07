package com.ridk.unityextension;

import android.bluetooth.le.ScanResult;

import java.util.List;

/**
 * Created by Ridk on 2018/1/25.
 */

public interface IScanCallback {
    public abstract void	onBatchScanResults(List<ScanResult> results);
    public abstract void	onScanFailed(int errorCode);
    public abstract void	onScanResult(int callbackType, ScanResult result);
}
