package com.ctrip.flutter_ctrip;

import com.example.plugin.asr.AsrPlugin;
import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends FlutterActivity {
  private void registerSelfPlugin() {
    AsrPlugin.registerWith(registrarFor("com.example.plugin.asr.AsrPlugin"));
  }
}
