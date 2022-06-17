package io.getstream.chat.ui.sample;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.List;

import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.logger.ChatLogLevel;
import io.getstream.chat.android.client.models.User;
import io.getstream.chat.android.offline.model.message.attachments.UploadAttachmentsNetworkType;
import io.getstream.chat.android.offline.plugin.configuration.Config;
import io.getstream.chat.android.offline.plugin.factory.StreamOfflinePluginFactory;
import io.getstream.chat.ui.sample.application.AppConfig;
import io.getstream.chat.ui.sample.databinding.FragmentLoginFirebaseBinding;
import io.getstream.chat.ui.sample.feature.firebase_login.FirebaseLoginViewModel;
import io.getstream.chat.ui.sample.feature.firebase_login.LoginCredentials2;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Login_Firebase#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Login_Firebase extends Fragment {

    FirebaseLoginViewModel firebaseLoginViewModel = new FirebaseLoginViewModel();
    FragmentLoginFirebaseBinding binding;
    TextInputEditText etLoginEmail;
    TextInputEditText etLoginPassword;
    TextView tvRegisterHere;
    Button btnLogin;
    FirebaseAuth mAuth;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Login_Firebase() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Login_Firebase.
     */
    // TODO: Rename and change types and number of parameters
    public static Login_Firebase newInstance(String param1, String param2) {
        Login_Firebase fragment = new Login_Firebase();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View loginView = inflater.inflate(R.layout.fragment_login__firebase, container, false);
        binding = FragmentLoginFirebaseBinding.inflate(inflater, container, false);

        etLoginEmail = loginView.findViewById(R.id.etLoginEmail);
        etLoginPassword = loginView.findViewById(R.id.etLoginPass);
        tvRegisterHere = loginView.findViewById(R.id.tvRegisterHere);
        btnLogin = loginView.findViewById(R.id.btnLogin);
        mAuth = FirebaseAuth.getInstance();
        btnLogin.setOnClickListener(view -> {
            loginUser();  //log in with firebase
//            FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
//            if (firebaseUser != null) {
//                StreamOfflinePluginFactory streamOfflinePluginFactory = new StreamOfflinePluginFactory(
//                        new Config(
//                                true,
//                                true,
//                                true,
//                                UploadAttachmentsNetworkType.NOT_ROAMING
//                        ),
//                        getActivity().getApplicationContext()
//                );
//                ChatClient client = ChatClient.instance();
//
//                User user = new User();
//                user.setId(firebaseUser.getUid());
//                String userEmail = firebaseUser.getEmail();
//                String username = userEmail.substring(0, userEmail.indexOf("@"));
//                user.setName(username);
//                String token = client.devToken(user.getId());
//                LoginCredentials2 loginCredentials = new LoginCredentials2(AppConfig.apiKey, user.getId(), token, user.getName());
//                firebaseLoginViewModel.loginButtonClicked(loginCredentials);
//                Navigation.findNavController(loginView).navigate(R.id.action_login_Firebase_to_homeFragment);
//            }
//            else {
//                Log.v("login","null here");
//            }
        });


        tvRegisterHere.setOnClickListener(view -> {
            // startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            Navigation.findNavController(loginView).navigate(R.id.action_login_Firebase_to_register_Firebase);
        });
        return loginView;
    }

    private void loginUser() {
        String email = etLoginEmail.getText().toString();
        String password = etLoginPassword.getText().toString();
        if (TextUtils.isEmpty(email)) {
            etLoginEmail.setError("Email cannot be empty");
            etLoginEmail.requestFocus();
        } else if (TextUtils.isEmpty(password)) {
            etLoginPassword.setError("Password cannot be empty");
            etLoginPassword.requestFocus();
        } else {
            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        //Toast.makeText(LoginActivity.this, "User logged in successfully", Toast.LENGTH_SHORT).show();
                        Toast.makeText(getActivity(), "User logged in successfully", Toast.LENGTH_SHORT).show();
                        //Navigation.findNavController(getView()).navigate(R.id.action_login_Firebase_to_homeFragment);
                        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
                        if (firebaseUser != null) {
                            StreamOfflinePluginFactory streamOfflinePluginFactory = new StreamOfflinePluginFactory(
                                    new Config(
                                            true,
                                            true,
                                            true,
                                            UploadAttachmentsNetworkType.NOT_ROAMING
                                    ),
                                    getActivity().getApplicationContext()
                            );
                            ChatClient client = ChatClient.instance();

                            User user = new User();
                            user.setId(firebaseUser.getUid());
                            String userEmail = firebaseUser.getEmail();
                            String username = userEmail.substring(0, userEmail.indexOf("@"));
                            user.setName(username);
                            String token = client.devToken(user.getId());
                            LoginCredentials2 loginCredentials = new LoginCredentials2(AppConfig.apiKey, user.getId(), token, user.getName());
                            firebaseLoginViewModel.loginButtonClicked(loginCredentials);
                            Navigation.findNavController(getView()).navigate(R.id.action_login_Firebase_to_homeFragment);
                        }
                        else {
                            Log.v("login","null here");
                        }
                    } else {
                        //Toast.makeText(LoginActivity.this, "Log in Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        Toast.makeText(getActivity(), "Log in Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void redirectToChannelsScreen() {
        Navigation.findNavController(getView()).navigate(R.id.action_login_Firebase_to_homeFragment);
    }
}