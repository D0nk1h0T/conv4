package com.denis.converter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class BlankFragment extends Fragment implements View.OnClickListener {

    EditText edit1;
    Button btnUsdtoUah;
    Button btnEurtoUsd;
    Button btnEurtoUah;
    Button btnUahtoEur;
    Button btnUahtoUsd;
    Button btnUsdtoEur;
    TextView tvRes;
    Random r = new Random();

    double UsdtoUah;
    final double EurtoUsd =1.19;
    final double EurtoUah =33.54;
    final double UahtoEur =0.03;
    final double UahtoUsd =0.035;
    final double UsdtoEur =0.84;


    public BlankFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        edit1 = (EditText) view.findViewById(R.id.edit1);
        btnUsdtoUah = (Button) view.findViewById(R.id.btnUsdtoUah);
        btnEurtoUsd = (Button) view.findViewById(R.id.btnEurtoUsd);
        btnEurtoUah = (Button) view.findViewById(R.id.btnEurtoUah);
        btnUahtoEur = (Button) view.findViewById(R.id.btnUahtoEur);
        btnUahtoUsd = (Button) view.findViewById(R.id.btnUahtoUsd);
        btnUsdtoEur = (Button) view.findViewById(R.id.btnUsdtoEur);
        tvRes = (TextView) view.findViewById(R.id.tvRes);
        btnUsdtoUah.setOnClickListener(this);
        btnEurtoUsd.setOnClickListener(this);
        btnEurtoUah.setOnClickListener(this);
        btnUahtoEur.setOnClickListener(this);
        btnUahtoUsd.setOnClickListener(this);
        btnUsdtoEur.setOnClickListener(this);
    UsdtoUah=25.0 + Math.random()*5.0;
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnUsdtoUah: {
                try {
                    String s1 = edit1.getText().toString();
                    double res = Double.parseDouble(s1) * UsdtoUah;
                    String s3 = String.format(s1 + " USD to UAH = %.3f", res);
                    tvRes.setText(s3);
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
                break;
            }
            case R.id.btnEurtoUsd: {
                try {
                    String s1 = edit1.getText().toString();
                    double res = Double.parseDouble(s1) * EurtoUsd;
                    String s3 = String.format(s1 + " EUR to USD = %.3f", res);
                    tvRes.setText(s3);
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
                break;
            }
            case R.id.btnEurtoUah: {
                try {
                    String s1 = edit1.getText().toString();
                    double res = Double.parseDouble(s1) * EurtoUah;
                    String s3 = String.format(s1 + " EUR to UAN = %.3f", res);
                    tvRes.setText(s3);
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
                break;
            }
            case R.id.btnUahtoEur: {
                try {
                    String s1 = edit1.getText().toString();
                    double res = Double.parseDouble(s1) * UahtoEur;
                    String s3 = String.format(s1 + " UAH to EUR = %.3f", res);
                    tvRes.setText(s3);
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
                break;
            }
            case R.id.btnUahtoUsd: {
                try {
                    String s1 = edit1.getText().toString();
                    double res = Double.parseDouble(s1) * UahtoUsd;
                    String s3 = String.format(s1 + " UAH to USD = %.3f", res);
                    tvRes.setText(s3);
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
                break;
            }
            case R.id.btnUsdtoEur: {
                try {
                    String s1 = edit1.getText().toString();

                    double res = Double.parseDouble(s1) * UsdtoEur;
                    String s3 = String.format(s1 + " USD to EUR = %.3f", res);
                    tvRes.setText(s3);
                } catch (Exception e) {
                    Toast.makeText(getContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
                break;
            }

        }
    }
}