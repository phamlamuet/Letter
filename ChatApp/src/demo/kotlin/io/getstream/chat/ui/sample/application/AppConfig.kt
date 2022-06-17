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
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "jc",
    //         name = "Jc Miñarro",
    //         image = "https://ca.slack-edge.com/T02RM6X6B-U011KEXDPB2-891dbb8df64f-128",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiamMifQ.2_5Hae3LKjVSfA0gQxXlZn54Bq6xDlhjPx2J7azUNB4"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "amit",
    //         name = "Amit Kumar",
    //         image = "https://ca.slack-edge.com/T02RM6X6B-U027L4AMGQ3-9ca65ea80b60-128",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiYW1pdCJ9.MNfrDsGkFINEZ3kCQ9hAqI38lZ6S-miHINAuH3kQy2o"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "belal",
    //         name = "Belal Khan",
    //         image = "https://ca.slack-edge.com/T02RM6X6B-U02DAP0G2AV-2072330222dc-128",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiYmVsYWwifQ.a0DwMMb0V1Lona_1dIB7a4GtNl4oQ_WCp-W-UP3_CUQ"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "dmitrii",
    //         name = "Dmitrii Bychkov",
    //         image = "https://ca.slack-edge.com/T02RM6X6B-U01CDPY6YE8-b74b0739493e-128",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiZG1pdHJpaSJ9._j7pM2kqj46ztls0tG1DiUMl45l54VOLvl8jp5VCmZU"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "filip",
    //         name = "Filip Babić",
    //         image = "https://ca.slack-edge.com/T02RM6X6B-U022AFX9D2S-f7bcb3d56180-128",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiZmlsaXAifQ.WKqTjU6fHHjtFej-sUqS2ml3Rvdqn4Ptrf7jfKqzFgU"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "jaewoong",
    //         name = "Jaewoong Eum",
    //         image = "https://ca.slack-edge.com/T02RM6X6B-U02HU1XR9LM-626fb91c334e-128",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiamFld29vbmcifQ.d-7AREGaSirn7TjxwLyAUvOU-nz2_LL5oMTycZvcnQc"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "leandro",
    //         name = "Leandro Borges Ferreira",
    //         image = "https://ca.slack-edge.com/T02RM6X6B-U01AQ67NJ9Z-2f28d711cae9-128",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoibGVhbmRybyJ9.CjlYUr79r4GopAhXIbqLBighl3meLsT4dQKzdKX7L3g"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "marton",
    //         name = "Márton Braun",
    //         image = "https://ca.slack-edge.com/T02RM6X6B-U018YPHEW7L-26ab96fd1ed3-128",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoibWFydG9uIn0.22wjzwYCNdaG5FLVeTD49NqVA11UJpEwrNRjZxZrcK8"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "oleg",
    //         name = "Oleg Kuzmin",
    //         image = "https://ca.slack-edge.com/T02RM6X6B-U019BEATNCD-bad2dcf654ef-128",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoib2xlZyJ9.ZucjlxjiNewCORdCLwpKwZw2nNtRC_Bv17TjHlitdLU"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "rafal",
    //         name = "Rafal Adasiewicz",
    //         image = "https://ca.slack-edge.com/T02RM6X6B-U0177N46AFN-a4e664d1960d-128",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoicmFmYWwifQ.7Y4QCvc42Km8ETLdCQT5ynjiKVbZZbuN0XTiGxJNU6k"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "samuel",
    //         name = "Samuel Urbanowicz",
    //         image = "https://ca.slack-edge.com/T02RM6X6B-U011KEXD396-6d3169b36889-128",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoic2FtdWVsIn0.SusttZNc2Y0sc-JPEOPCmTa5FuKDHRcWGO_7kYrC1C0"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "thierry",
    //         name = "Thierry Schellenbach",
    //         image = "https://ca.slack-edge.com/T02RM6X6B-U02RM6X6D-g28a1278a98e-128",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoidGhpZXJyeSJ9.hZi4pBPt2v2HSoS-7Yn7Ll2a1twhs763MlRGFAday2c"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "tommaso",
    //         name = "Tommaso Barbugli",
    //         image = "https://ca.slack-edge.com/T02RM6X6B-U02U7SJP4-0f65a5997877-128",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoidG9tbWFzbyJ9.lNaWC2Opyq6gmV50a2BGxK-5gm5mwCpefnUA30_k9YA"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "qatest1",
    //         name = "QA Test 1",
    //         image = "https://getstream.imgix.net/images/random_svg/QT.png",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoicWF0ZXN0MSJ9.H1nlYibjgp1HfaOd0sA_T4038tjsN61mJWxvUjmRQI0"
    //     ),
    //     SampleUser(
    //         apiKey = apiKey2,
    //         id = "qatest2",
    //         name = "QA Test 2",
    //         image = "https://getstream.imgix.net/images/random_svg/QT.png",
    //         token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoicWF0ZXN0MiJ9.GYp9ikLtU2eG9Mq7tmHThzbV7C8W82j18sExuO7-ogc"
    // ))
    )
}
