package com.instabug.instabugflutterexample;

import io.flutter.app.FlutterApplication;
import com.instabug.instabugflutter.InstabugFlutterPlugin;

import java.util.ArrayList;

public class CustomFlutterApplication extends FlutterApplication {
  @Override
  public void onCreate() {
    super.onCreate();
    ArrayList<String> invocation_events = new ArrayList<>();
    invocation_events.add(InstabugFlutterPlugin.INVOCATION_EVENT_FLOATING_BUTTON);
    InstabugFlutterPlugin instabug = new InstabugFlutterPlugin();
    instabug.start(CustomFlutterApplication.this, "3cc65af4ae01a17a2e8edb09b32537cd", invocation_events);
    instabug.setWelcomeMessageMode("WelcomeMessageMode.disabled");
  }
}