package com.example.cau1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtTenKhach,txtSoCu,txtSoMoi;
    Button btnTinhTien,btnXoa,btnDong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();

        btnTinhTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tenkhach=txtTenKhach.getText().toString();
                int soCu=Integer.parseInt(txtSoCu.getText().toString());
                int soMoi=Integer.parseInt(txtSoMoi.getText().toString());

                int ketQua=soMoi - soCu;
                if(tenkhach.equals("")){
                    Toast.makeText(MainActivity.this, "Không được để trống", Toast.LENGTH_SHORT).show();
                }else{
                    if(soMoi<soCu){
                        Toast.makeText(MainActivity.this, "Nhập số mới lớn hơn số cũ", Toast.LENGTH_SHORT).show();
                    }else{
                        if(ketQua<=50){
                            Toast.makeText(MainActivity.this, "Giá tiền 1.484 đồng", Toast.LENGTH_SHORT).show();
                        }else if(ketQua<=100&&ketQua>50){
                            Toast.makeText(MainActivity.this, "Giá tiền 1.786 đồng", Toast.LENGTH_SHORT).show();
                        }else if(ketQua>100&&ketQua<=200){
                            Toast.makeText(MainActivity.this, "Giá tiền 1.533 đồng", Toast.LENGTH_SHORT).show();
                        }else if(ketQua>200){
                            Toast.makeText(MainActivity.this, "Giá tiền 2.242 đồng", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSoMoi.setText("");
                txtSoCu.setText("");
            }
        });
    }

    public void AnhXa(){
        txtTenKhach=(EditText) findViewById(R.id.txtTenKhach);
        txtSoCu=(EditText) findViewById(R.id.txtSoCu);
        txtSoMoi=(EditText) findViewById(R.id.txtSoMoi);
        btnTinhTien=(Button) findViewById(R.id.btnTinhTien);
        btnXoa=(Button) findViewById(R.id.btnXoa);
        btnDong=(Button) findViewById(R.id.btnDong);
    }
}