# EasyZoomImageViewer

EasyZoomImageViewer is as simple as image viewer which helps to zoom image on pinch.


# Installation

EasyZoomImageViewer is installed by adding the following dependency to your build.gradle file:

```
dependencies {
    implementation 'com.chiranjit.ui:easyzoom:1.0.1'
}
```

Note that EasyZoomImageViewer depends on Android Support Library 27.1.1 so you will need to use compileSdkVersion 27 or higher. This change should be safe as compileSdkVersion does not change app behavior.

# Usage

To begin using EasyZoomImageViewer, have your Activity (or Fragment):

## Image Resources

* **Drawable Image**
* **Network Image**
* **Bitmap Image**

```
public class MainActivity extends AppCompatActivity {

    EasyZoomImageViewer image;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imgFullScreen);

        image.with(R.drawable.demo);
    }
}
```

Layout file:

```
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent" >

    <com.easyzoom.EasyZoomImageViewer
        android:id="@+id/imgFullScreen"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_centerInParent="true"
        android:contentDescription="@null" />

</RelativeLayout>
```

### Glide Version

Below is the Glide version for this library. This information may helpful if found any conflict

```
com.github.bumptech.glide:glide:4.7.1
```

## LICENSE

```
Copyright 2017 Google

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

```
