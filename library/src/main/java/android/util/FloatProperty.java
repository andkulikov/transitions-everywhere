/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.util;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Dummy class. Permits to extend same hidden class from android framework.
 * Actually in runtime will be used class from android framework and ObjectAnimator
 * optimizations for FloatProperty will be applied.
 *
 * Created by Andrey Kulikov on 18.08.15.
 */
public abstract class FloatProperty<T> extends Property<T, Float> {

    public FloatProperty(@Nullable String name) {
        super(Float.class, name);
    }

    public abstract void setValue(@NonNull T object, float value);

    @SuppressLint("NewApi")
    @Override
    final public void set(@NonNull T object, @NonNull Float value) {
        setValue(object, value);
    }

    @Override
    @NonNull
    public abstract Float get(@NonNull T object);

}
