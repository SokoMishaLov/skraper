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
package ru.sokomishalov.skraper.model

/**
 * Represents a provider some user/community/channel/topic/trend/hashtag page information
 * @property nick some nickname
 * @property name name
 * @property description page additional text info
 * @property statistics page stats
 * @property avatar avatar image
 * @property cover cover image
 */
data class PageInfo(
    val nick: String? = null,
    val name: String? = nick,
    val description: String? = null,
    val statistics: PageStatistics? = null,
    val avatar: Image? = null,
    val cover: Image? = null,
)


/**
 * Represents page statistics
 * @property posts posts count
 * @property followers followers count
 * @property following following count
 */
data class PageStatistics(
    val posts: Int? = null,
    val followers: Int? = null,
    val following: Int? = null,
)