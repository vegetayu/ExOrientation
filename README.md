# 屏幕旋转对Activity的影响

首先要明白的概念：
- 在Manifest.xml中，Activity的`android:configChanges`属性是用于捕获与手机设置相关的事件，如果捕获到，
则调用该Activity的`onConfigurationChanged`方法，如果事件发生了却没有被捕获），则系统会销毁该Activity并重建。

在不捕获任何事件的情况下，转横屏、转竖屏晨Activity各被重建一次（Sony Xperia XZ亲测，可能不同手机会有差别）。
只要事件被捕获到，就会调用`onConfigurationChanged`方法，而不会重建Activity。
（在捕获到事件的情况下，首次切横屏，`onConfigurationChanged`要被调用两次，此后每次切换都只被调用一次，估计手机的原因）
