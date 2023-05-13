package fr.ucaolan.xmen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.os.Bundle;
import android.view.View;

import java.util.List;

import fr.ucaolan.xmen.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding ui;
    List<XMen> liste;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        XMenApplication application = (XMenApplication) getApplication();
        liste = application.getListe();

        XMenAdapter adapter = new XMenAdapter(liste);
//        adapter.setOnItemClickListener(this::onItemClick);

        ui.recycler.setAdapter(adapter);

        ui.recycler.hasFixedSize();

//        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
//        ui.recycler.setLayoutManager(lm);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(
                this, DividerItemDecoration.VERTICAL
        );
        ui.recycler.addItemDecoration(dividerItemDecoration);


    }

//    private void onItemClick(position)
//    {
//        XMen xmen = liste.get(position)
//    }
}