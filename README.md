# ResOf

[![](https://jitpack.io/v/dev-weiqi/ResOf.svg)](https://jitpack.io/#dev-weiqi/ResOf)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ResOf-yellow.svg?style=flat)](https://android-arsenal.com/details/1/8230)

ResOf is an android resource wrapper library.

## Install

project/build.gradle

```groovy
allprojects {
  repositories {
   ...
   maven { url 'https://jitpack.io' }
  }
}
```

or

project/settings.gradle

```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
  			...
        maven { url 'https://jitpack.io' }
    }
}
```

app/build.gradle

```groovy
dependencies {
    implementation 'com.github.dev-weiqi:ResOf:$latestVersion'
}
```

## Usage

Just use it! You don't need to do any initialization!

xml

```xml
<resources>
    <string name="app_name">ResOf</string>
</resources>
```

1. Function

```kotlin
val appName = stringOf(R.string.app_name)
Log.v(TAG,"Hello World: $appName!")
--------------------
V/TAG: Hello World: ResOf!
```

2. Extension

```kotlin
val appName = R.string.app_name.resOf.string()
Log.v(TAG,"Hello World: $appName!")
--------------------
V/TAG: Hello World: ResOf!
```

## Supported Resources

| Resource Type  | AAPT class     | Function         | Kotlin Extension     | Return Type       |
| :------------- | :------------- | :--------------- | :---------------     | :---------------- |
| Animation      | R.anim         | animOf           | resOf.anim           | Animation         |
| Boolean        | R.bool         | boolOf           | resOf.bool           | Boolean           |
| Color          | R.color        | colorIntOf       | resOf.colorInt       | Int               |
| ColorStateList | R.color        | colorStateListOf | resOf.colorStateList | ColorStateList    |
| Dimension      | R.dimen        | dimenOf          | resOf.dimen          | Float             |
| Dimen          | R.dimen        | dimenOffsetOf    | resOf.dimenOffset    | Int               |
| Dimen          | R.dimen        | dimenSizeOf      | resOf.dimenSize      | Int               |
| Drawable       | R.drawable     | drawableOf       | resOf.drawable       | Drawable          |
| Font           | R.font         | fontOf           | resOf.font           | Typeface          |
| Fraction       | R.fraction     | fractionOf       | resOf.fraction       | Float             |
| IntArray       | R.array        | intArrayOf       | resOf.intArray       | IntArray          |
| Integer        | R.integer      | integerOf        | resOf.integer        | Int               |
| Interpolator   | R.interpolator | interpolatorOf   | resOf.interpolator   | Interpolator      |
| Layout         | R.layout       | layoutOf         | resOf.layout         | XmlResourceParser |
| Plurals        | R.plurals      | pluralsOf        | resOf.plurals        | String            |
| Raw            | R.raw          | rawOf            | resOf.raw            | InputStream       |
| String         | R.string       | stringOf         | resOf.string         | String            |
| StringArray    | R.array        | stringArrayOf    | resOf.stringArray    | Array<out String> |
| TypedArray     | R.array        | typedArrayOf     | resOf.typedArray     | TypedArray        |
| Xml            | R.xml          | xmlOf            | resOf.xml            | XmlResourceParser |

## **Contribution**

Contributions are always welcome. If you have any ideas or suggestions, you can create a Github issue. I will get to you as soon as possible.

## **License**

```
Copyright 2021 Wei-Qi Wang

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
