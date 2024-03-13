package com.example.edapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Toast;

import com.example.edapp.databinding.ActivityMainBinding;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.encryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.cForm.setText("");
                if(binding.key.getText().toString().length()>0 && binding.value.getText().length()>0)
                {
                    binding.cForm.setVisibility(View.VISIBLE);
                    try {
                        binding.cForm.setText(EncryptDecrypt.encrypt(binding.value.getText().toString(),binding.key.getText().toString()));
                    } catch (NoSuchPaddingException e) {
                        binding.cForm.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "please write the correct key", Toast.LENGTH_SHORT).show();
                    } catch (NoSuchAlgorithmException e) {
                        binding.cForm.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "please write the correct key", Toast.LENGTH_SHORT).show();
                    } catch (InvalidAlgorithmParameterException e) {
                        binding.cForm.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "please write the correct key", Toast.LENGTH_SHORT).show();
                    } catch (InvalidKeyException e) {
                        binding.cForm.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "please write the correct key", Toast.LENGTH_SHORT).show();
                    } catch (BadPaddingException e) {
                        binding.cForm.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "please write the correct key", Toast.LENGTH_SHORT).show();
                    } catch (IllegalBlockSizeException e) {
                        binding.cForm.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "please write the correct key", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    binding.cForm.setVisibility(View.GONE);

                }
            }
        });
        binding.decryptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.cForm.setText("");
                if(binding.key.getText().toString().length()>0 && binding.value.getText().length()>0)
                {
                    binding.cForm.setVisibility(View.VISIBLE);
                    try {
                        binding.cForm.setText(EncryptDecrypt.decrypt(binding.value.getText().toString(),binding.key.getText().toString()));
                    } catch (NoSuchPaddingException e) {
                        binding.cForm.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "please write the correct key", Toast.LENGTH_SHORT).show();
                    } catch (NoSuchAlgorithmException e) {
                        binding.cForm.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "please write the correct key", Toast.LENGTH_SHORT).show();
                    } catch (InvalidAlgorithmParameterException e) {
                        binding.cForm.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "please write the correct key", Toast.LENGTH_SHORT).show();
                    } catch (InvalidKeyException e) {
                        binding.cForm.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "please write the correct key", Toast.LENGTH_SHORT).show();
                    } catch (BadPaddingException e) {
                        binding.cForm.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "please write the correct key", Toast.LENGTH_SHORT).show();
                    } catch (IllegalBlockSizeException e) {
                        binding.cForm.setVisibility(View.GONE);
                        Toast.makeText(MainActivity.this, "please write the correct key", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    binding.cForm.setVisibility(View.GONE);

                }
            }
        });
    }

}