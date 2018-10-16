# 屏幕旋转对Activity的影响

### 1.首先要明白的概念：
- **android:configChanges**

在Manifest.xml中，Activity的`android:configChanges`属性是用于捕获与手机设置相关的事件，如果捕获到，
则调用该Activity的`onConfigurationChanged()`方法，如果没有捕获，则系统会销毁该Activity并重建。

### 2.举个栗子
- **在不捕获转屏事件的情况下**

转横屏、转竖屏时，Activity各被重建一次（Sony Xperia XZ亲测，可能不同手机会有差别）。

- **设置`android:configChanges="orientation"`时**

转横屏、转竖屏时，会调用Activity的`onConfigurationChanged()`方法，而不会重建Activity。


