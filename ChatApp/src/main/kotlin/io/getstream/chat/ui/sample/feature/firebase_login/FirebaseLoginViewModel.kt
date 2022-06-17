package io.getstream.chat.ui.sample.feature.firebase_login

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import io.getstream.chat.android.client.ChatClient
import io.getstream.chat.android.client.models.User
import io.getstream.chat.ui.sample.R
import io.getstream.chat.ui.sample.application.App
import io.getstream.chat.ui.sample.common.navigateSafely
import io.getstream.chat.ui.sample.data.user.SampleUser
import io.getstream.chat.ui.sample.feature.custom_login.LoginCredentials

class FirebaseLoginViewModel : ViewModel() {

    fun loginButtonClicked(credentials: LoginCredentials2) {
            initChatSdk(credentials)
            initChatUser(credentials)
    }

    /**
     * You would normally initialize the Chat SDK only once in the Application class,
     * but since we allow changing API keys at runtime in this demo app, we have to
     * reinitialize the Chat SDK here with the new API key.
     */
    private fun initChatSdk(credentials: LoginCredentials2) {
        App.instance.chatInitializer.init(credentials.apiKey)
    }

    private fun initChatUser(loginCredentials: LoginCredentials2) {
        val chatUser = User().apply {
            id = loginCredentials.userId
            name = loginCredentials.userName
        }

        ChatClient.instance().connectUser(chatUser, loginCredentials.userToken)
            .enqueue { result ->
                if (result.isSuccess) {
                    App.instance.userRepository.setUser(
                        SampleUser(
                            apiKey = loginCredentials.apiKey,
                            id = loginCredentials.userId,
                            name = loginCredentials.userName,
                            token = loginCredentials.userToken,
                            image = "https://getstream.io/random_png?id=${loginCredentials.userId}&name=${loginCredentials.userName}&size=200"
                        )
                    )

                } else {
                    Log.v("fail","loginfail")
                }
            }
    }
}


data class LoginCredentials2(
    val apiKey: String,
    val userId: String,
    val userToken: String,
    val userName: String,
)
