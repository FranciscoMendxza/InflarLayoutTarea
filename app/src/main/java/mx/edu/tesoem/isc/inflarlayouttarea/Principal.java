package mx.edu.tesoem.isc.inflarlayouttarea;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class Principal extends AppCompatActivity {

    //uno https://upload.wikimedia.org/wikipedia/commons/6/63/Icon_Bird_512x512.png
    //dos https://mystickermania.com/cdn/stickers/among-us/among-us-smooth-512x512.png
    //tres https://banner2.cleanpng.com/20181015/pav/kisspng-real-madrid-c-f-uefa-champions-league-2-1718-l-logo-512x512-dream-league-soccer-imagui-5bc4dfdb36c874.6996143015396290192244.jpg
    //cuatro https://brandlogos.net/wp-content/uploads/2015/03/mercedes-benz-logo-512x512.png
    //cinco https://w7.pngwing.com/pngs/266/473/png-transparent-volkswagen-group-car-volkswagen-jetta-wolfsburg-volkswagen-emblem-trademark-logo-thumbnail.png
    Button btn1, btn2, btn3, btn4, btn5;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Principal.this.PersonalizaToast1();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Principal.this.PersonalizaToast2();}
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Principal.this.PersonalizaToast3();}
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Principal.this.PersonalizaToast4();}
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Principal.this.PersonalizaToast5();}
        });
    }

    private void PersonalizaToast1(){
        LayoutInflater l = this.getLayoutInflater();
        View vi = l.inflate(R.layout.plantilla, (ViewGroup) this.findViewById(R.id.grupo_temp));

        ImageView imagen = vi.findViewById(R.id.imageView);
        Glide.with(Principal.this).load("https://w7.pngwing.com/pngs/266/473/png-transparent-volkswagen-group-car-volkswagen-jetta-wolfsburg-volkswagen-emblem-trademark-logo-thumbnail.png").into(imagen);

        
        //para leer elementos dentro del layaout debemos invocar la variable de view y despues los elementos
        //n1 = vi.findViewById(R.id.n1);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.TOP, 5,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(vi);
        toast.show();
    }

    private void PersonalizaToast2(){
        LayoutInflater l = this.getLayoutInflater();
        View ve = l.inflate(R.layout.plantilla, (ViewGroup) this.findViewById(R.id.grupo_temp));

        TextView t1 = ve.findViewById(R.id.textView);
        t1.setText("Toast 2");

        ImageView imagen = ve.findViewById(R.id.imageView);
        Glide.with(Principal.this).load("https://upload.wikimedia.org/wikipedia/commons/6/63/Icon_Bird_512x512.png").into(imagen);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.TOP, 5,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(ve);
        toast.show();
    }

    private void PersonalizaToast3(){
        LayoutInflater l = this.getLayoutInflater();
        View ve = l.inflate(R.layout.plantilla, (ViewGroup) this.findViewById(R.id.grupo_temp));

        TextView t1 = ve.findViewById(R.id.textView);
        t1.setText("Toast 3");

        ImageView imagen = ve.findViewById(R.id.imageView);
        Glide.with(Principal.this).load("https://mystickermania.com/cdn/stickers/among-us/among-us-smooth-512x512.png").into(imagen);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.TOP, 5,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(ve);
        toast.show();
    }

    private void PersonalizaToast4(){
        LayoutInflater l = this.getLayoutInflater();
        View ve = l.inflate(R.layout.plantilla, (ViewGroup) this.findViewById(R.id.grupo_temp));

        TextView t1 = ve.findViewById(R.id.textView);
        t1.setText("Toast 4");

        ImageView imagen = ve.findViewById(R.id.imageView);
        Glide.with(Principal.this).load("https://banner2.cleanpng.com/20181015/pav/kisspng-real-madrid-c-f-uefa-champions-league-2-1718-l-logo-512x512-dream-league-soccer-imagui-5bc4dfdb36c874.6996143015396290192244.jpg").into(imagen);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.TOP, 5,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(ve);
        toast.show();
    }

    private void PersonalizaToast5(){
        LayoutInflater l = this.getLayoutInflater();
        View ve = l.inflate(R.layout.plantilla, (ViewGroup) this.findViewById(R.id.grupo_temp));

        TextView t1 = ve.findViewById(R.id.textView);
        t1.setText("Toast 5");

        ImageView imagen = ve.findViewById(R.id.imageView);
        Glide.with(Principal.this).load("https://brandlogos.net/wp-content/uploads/2015/03/mercedes-benz-logo-512x512.png").into(imagen);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.TOP, 5,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(ve);
        toast.show();
    }
}