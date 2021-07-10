/*
 * Copyright (c) 2019-present Mikhael Sokolov
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
@file:Suppress("NOTHING_TO_INLINE")

package ru.sokomishalov.skraper.internal.number


/**
 * @author sokomishalov
 */

@PublishedApi
internal inline operator fun Double?.div(other: Double?): Double? = when {
    this != null && other != null -> this / other
    else -> null
}

@PublishedApi
internal inline operator fun Int?.div(other: Int?): Double? = when {
    this != null && other != null -> this.toDouble() / other.toDouble()
    else -> null
}

@PublishedApi
internal inline operator fun Double?.minus(other: Double?): Double? = when {
    this != null && other != null -> this - other
    else -> null
}

@PublishedApi
internal inline operator fun Int?.minus(other: Int?): Int? = when {
    this != null && other != null -> this - other
    else -> null
}