# KTextview
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)


KTextview formate the number like thousand and above to K,M,T for instance 1000 will be shown as 1K and 1200 as 1.2k etc...


## Setup
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

dependencies {
   implementation 'com.github.Venkat19292:KTextview:1.0'
}
```

## Usage


```xml
         <master.mumbai.com.ktextviewlibrary.KTextview
            android:id="@+id/txt_custom"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"/>

```
To set value to textview
```kotlin
     txt_custom.setFormattedValue(1300);

```

OUTPUT:
```xml
      1.3K
```


License
--------


    Copyright 2019 Venkatesh Pillai

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


