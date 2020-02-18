/**
 * Copyright 2019-2020 the original author or authors.
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
package ru.sokomishalov.skraper.provider.tumblr

import org.junit.Test
import ru.sokomishalov.skraper.provider.SkraperTck

class TumblrSkraperTest : SkraperTck() {
    override val skraper: TumblrSkraper = TumblrSkraper(client = client)
    override val path: String = "/dashboard/blog/memegeeks"
    private val username: String = "memegeeks"

    @Test
    fun `Check user posts`() {
        assertPosts { skraper.getUserPosts(username = username) }
    }

    @Test
    fun `Check user logo`() {
        assertLogo { skraper.getUserLogoUrl(username = username) }
    }
}