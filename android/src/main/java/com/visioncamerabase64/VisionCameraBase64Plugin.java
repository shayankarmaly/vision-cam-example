package com.visioncamerabase64;

import androidx.camera.core.ImageProxy;
import com.mrousavy.camera.frameprocessor.FrameProcessorPlugin;

public class VisionCameraBase64Plugin extends FrameProcessorPlugin {

  @Override
  public Object callback(ImageProxy image, Object[] params) {
    // code goes here
    return null;
  }

  VisionCameraBase64Plugin() {
    super("frameToBase64");
  }
}
