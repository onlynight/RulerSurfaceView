RulerSurfaceView
================

#Preview

![Preview](./images/rulerview.gif)

#build.gradle
In your project root path ```build.gradle``` file, add this:

```groovy
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

And in your module path ```build.gradle``` file, add this:

```groovy
dependencies {
        compile 'com.github.onlynight:RulerSurfaceView:0.0.1'
}
```

#use

```xml
<com.github.onlynight.rulersurfaceview.library.RulerSurfaceView
    android:id="@+id/rulerView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:dash_line_blank="3dp"
    app:line_color="#ff0000"
    app:line_height="1dp"
    app:line_type="dash_line"
    app:measure_icon_size="25dp"
    app:measure_ruler_scale_width="5dp"
    app:measure_ruler_width="20dp"
    app:measure_text_color="@color/colorAccent"
    app:measure_text_size="18sp"
    app:ruler_color="#ff0000"
    app:ruler_line_height="2dp" />
```