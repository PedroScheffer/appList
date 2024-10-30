package devandroid.pedroscheffer.applist.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.pedroscheffer.applist.R;
import devandroid.pedroscheffer.applist.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa segundaPessoa;

    String dadosPessoa;
    String dadosSegundaPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Pedro");
        pessoa.setSobreNome("SG");
        pessoa.setCursoDesejado("ADS");
        pessoa.setTelefoneContato("51 99999-9999");

        segundaPessoa = new Pessoa();
        segundaPessoa.setPrimeiroNome("Estéfany");
        segundaPessoa.setSobreNome("SG");
        segundaPessoa.setCursoDesejado("Nutrição");
        segundaPessoa.setTelefoneContato("48 99999-9999");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosSegundaPessoa = "Primeiro nome: ";
        dadosSegundaPessoa += segundaPessoa.getPrimeiroNome();
        dadosSegundaPessoa += " Sobrenome: ";
        dadosSegundaPessoa += segundaPessoa.getSobreNome();
        dadosSegundaPessoa += " Curso Desejado: ";
        dadosSegundaPessoa += segundaPessoa.getCursoDesejado();
        dadosSegundaPessoa += " Telefone de Contato: ";
        dadosSegundaPessoa += segundaPessoa.getTelefoneContato();

        int parada = 0;

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }
}