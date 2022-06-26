/*
 * Copyright (c) 2014-2022 Stream.io Inc. All rights reserved.
 *
 * Licensed under the Stream License;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://github.com/GetStream/stream-chat-android/blob/main/LICENSE
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.getstream.chat.ui.sample.application

import io.getstream.chat.ui.sample.data.user.SampleUser

object AppConfig {
    const val apiKey: String = "cw99ghcw6ce5"
    const val apiKey2: String = "qx5us2v6xvmh"
    const val apiUrl: String = "chat-us-east-staging.stream-io-api.com"
    const val apiTimeout: Int = 6000
    const val cndTimeout: Int = 30000

    val availableUsers: List<SampleUser> = listOf(
        SampleUser(
            apiKey = apiKey,
            id = "lampham",
            name = "Lam Pham",
            image = "https://i.pinimg.com/originals/74/3e/49/743e49fadcab838cddb1e5e152367c4f.png",
            token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoibGFtcGhhbSJ9.nYv-1P2pVk-kCn5hgrmz3BjjooKdTfH6as0hslE5ksc"
        ),
        SampleUser(
            apiKey = apiKey,
            id = "tkien",
            name = "Trung Kien",
            image = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/e97a620e-d4a3-4e98-9e62-2b4a19b92e97/dbp7d3o-13407102-3240-4139-911b-4c7cb161b34b.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2U5N2E2MjBlLWQ0YTMtNGU5OC05ZTYyLTJiNGExOWI5MmU5N1wvZGJwN2Qzby0xMzQwNzEwMi0zMjQwLTQxMzktOTExYi00YzdjYjE2MWIzNGIucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.9Tq3Ni8Snb2HhQW0CRyOXHfQDiNZrx-Usk5gMEgs31w",
            token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoidGtpZW4ifQ.G3I7h9VfMUEZZSFLJqINn6qD4fg54wziKB2dbWa68WA"
        ),
        SampleUser(
            apiKey = apiKey,
            id = "minhboi",
            name = "Minh Nguyen",
            image = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/e97a620e-d4a3-4e98-9e62-2b4a19b92e97/dbp7d3o-13407102-3240-4139-911b-4c7cb161b34b.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2U5N2E2MjBlLWQ0YTMtNGU5OC05ZTYyLTJiNGExOWI5MmU5N1wvZGJwN2Qzby0xMzQwNzEwMi0zMjQwLTQxMzktOTExYi00YzdjYjE2MWIzNGIucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.9Tq3Ni8Snb2HhQW0CRyOXHfQDiNZrx-Usk5gMEgs31w",
            token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoibWluaGJvaSJ9.INlW6Gxbl7ZiWxMb3y5axhtuzo8T5BgtW1PAijXCWHk"
        ),
        SampleUser(
            apiKey = apiKey,
            id = "truccute",
            name = "Thanh Truc",
            image = "https://scontent.fhan14-1.fna.fbcdn.net/v/t39.30808-1/282624888_1174208366755579_9130817381715712466_n.jpg?stp=c4.0.320.320a_dst-jpg_p320x320&_nc_cat=101&ccb=1-7&_nc_sid=7206a8&_nc_ohc=uCEudmMaB1kAX-_rnwq&tn=iTi3PNQ4jEFFARIq&_nc_ht=scontent.fhan14-1.fna&oh=00_AT_hIG_f9voNSsbygWw9SOJl9cF_vIVMZpBPvuky4o4YJw&oe=629168B1",
            token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoidHJ1Y2N1dGUifQ.vnI3JuZUrtZ2NDjNGsUaNcmHQSWn2Zp3P2PGLnNfTwQ"
        ),
        SampleUser(
            apiKey = apiKey,
            id = "thlinh",
            name = "Thuy Linh",
            image = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/e97a620e-d4a3-4e98-9e62-2b4a19b92e97/dbp7d3o-13407102-3240-4139-911b-4c7cb161b34b.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2U5N2E2MjBlLWQ0YTMtNGU5OC05ZTYyLTJiNGExOWI5MmU5N1wvZGJwN2Qzby0xMzQwNzEwMi0zMjQwLTQxMzktOTExYi00YzdjYjE2MWIzNGIucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.9Tq3Ni8Snb2HhQW0CRyOXHfQDiNZrx-Usk5gMEgs31w",
            token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoidGhsaW5oIn0.Ed4La_Gv1LDaJqq3_rJjyqT3chC747ahyWqRaUNQSMc"
        ),
    )
}
