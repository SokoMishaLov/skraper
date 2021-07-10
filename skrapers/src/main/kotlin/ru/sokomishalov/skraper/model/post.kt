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

import java.time.Instant

/**
 * Represents a provider some user/community/channel/topic/trend post.
 * @property id provider's internal post id
 * @property text title and/or description
 * @property author post author
 * @property publishedAt publish timestamp
 * @property statistics page stats
 * @property media post media items
 */
data class Post(
    val id: String,
    val text: String? = "",
    val author: PageInfo? = null,
    val publishedAt: Instant? = null,
    val statistics: PostStatistics? = null,
    val media: List<Media> = emptyList(),
)


/**
 * Represents post stats.
 * @property likes likes count
 * @property reposts reposts count
 * @property comments comments count
 * @property views views count
 */
data class PostStatistics(
    val likes: Int? = null,
    val reposts: Int? = null,
    val comments: Int? = null,
    val views: Int? = null,
)