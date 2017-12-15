# 屏幕旋转对Activity的影响

首先要明白的概念：
- 在Manifest.xml中，Activity的'android:configChanges'属性是用于捕获与手机设置相关的事件，如果捕获到，
则调用该Activity的'onConfigurationChanged'方法，如果事件发生了却没有被捕获），则系统会销毁该Activity并重建。

