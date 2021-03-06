package org.jall.reactnative.googleapiavailability;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import org.jall.reactnative.googleapiavailability.GoogleApiAvailabilityModule;

import java.util.ArrayList;
import java.util.List;

public class GoogleApiAvailabilityPackage implements ReactPackage {

    @Override
    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new GoogleApiAvailabilityModule(reactContext));
        return modules;
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return new ArrayList<>();
    }
}
