package com.example.csc325_firebase_webview_auth.model;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.IOException;

/**
 *
 * @author MoaathAlrajab
 */
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FirestoreContext {

    private static final Logger logger = Logger.getLogger(FirestoreContext.class.getName());

    public Firestore firebase() {
        try {
            // Load the key.json file as an input stream
            InputStream serviceAccount = getClass().getResourceAsStream("/files/key.json");
            if (serviceAccount == null) {
                throw new IOException("Failed to load resource: /files/key.json");
            }

            // Initialize Firebase options
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();

            // Initialize Firebase app
            FirebaseApp.initializeApp(options);
            logger.log(Level.INFO, "Firebase is initialized");
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Error initializing Firebase", ex);
        }
        return FirestoreClient.getFirestore();
    }
}


