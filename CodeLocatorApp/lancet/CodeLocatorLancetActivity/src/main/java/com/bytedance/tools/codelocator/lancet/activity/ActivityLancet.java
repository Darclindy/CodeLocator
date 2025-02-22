package com.bytedance.tools.codelocator.lancet.activity;

import android.content.Intent;
import android.os.Bundle;

import com.bytedance.tools.codelocator.CodeLocator;

import androidx.annotation.Nullable;
import me.ele.lancet.base.Origin;
import me.ele.lancet.base.Scope;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class ActivityLancet {

    @TargetClass(value = "android.content.Context", scope = Scope.ALL)
    @Proxy("startActivity")
    public void startActivity(Intent intent) {
        CodeLocator.notifyCallStartActivity(intent, Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.content.Context", scope = Scope.ALL)
    @Proxy("startActivity")
    public void startActivity(Intent intent, @Nullable Bundle options) {
        CodeLocator.notifyCallStartActivity(intent, Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.content.Context", scope = Scope.SELF)
    @Proxy("startActivity")
    public void startActivitySelf(Intent intent) {
        CodeLocator.notifyCallStartActivity(intent, Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.content.Context", scope = Scope.SELF)
    @Proxy("startActivity")
    public void startActivitySelf(Intent intent, @Nullable Bundle options) {
        CodeLocator.notifyCallStartActivity(intent, Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.app.Activity", scope = Scope.ALL)
    @Proxy("startActivityForResult")
    public void startActivityForResult(Intent intent, int requestCode) {
        CodeLocator.notifyCallStartActivity(intent, Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

    @TargetClass(value = "android.app.Activity", scope = Scope.ALL)
    @Proxy("startActivityForResult")
    public void startActivityForResult(Intent intent, int requestCode, @Nullable Bundle options) {
        CodeLocator.notifyCallStartActivity(intent, Thread.currentThread().getStackTrace());
        Origin.callVoid();
    }

}
