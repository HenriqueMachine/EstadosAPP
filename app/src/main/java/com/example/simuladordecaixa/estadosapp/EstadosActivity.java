package com.example.simuladordecaixa.estadosapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EstadosActivity extends AppCompatActivity {


    private ListView listOfStates;
    private String [] states = {

            "São Paulo","Rio de Janeiro","Distrito Federal","Bahia","Minas Gerais",
            "Amazonas","Paraná","Santa Catarina","Rio Grande do Sul","Pará","Pernambuco",
            "Espírito Santo","Ceará","Mato Grosso","Mato Grosso do Sul","Rio Grande do Norte","Paraíba",
            "Alagoas","Sergipe","Tocantins","Piauí","Rondônia","Acre","Roraima","Amapá"

    };

    private String [] describeStates = {
                    "A história de São Paulo, estado que nasceu desbravando o país e hoje abriga um mundo\n" +
                    "\n" +
                    "São Paulo possui uma história tão rica que conta a vida de uma nação, uma nação que abriga em seu território, sem exagero, características de todos os cantos do mundo. Essa história começou com um povo desbravador, bandeirante, que subiu serras e abriu florestas para marcar seu território em uma localização topográfica que, do ponto de vista da segurança, era perfeita. Atualmente a região está consolidada como uma das maiores potências econômicas e políticas do mundo, segue em pleno desenvolvimento e abriga pessoas do mundo todo.\n" +
                    "\n" +
                    "No início, São Paulo vivia da agricultura de subsistência, da tentativa de implantação em escala da lavoura de cana-de-açúcar e com o sonho da descoberta do ouro e dos metais preciosos. Começaram as viagens ao interior do país, as “bandeiras”, expedições organizadas para aprisionar índios e procurar pedras e metais preciosos nos sertões distantes.\n" +
                    "\n" +
                    "Ao longo de todo o século XVIII, São Paulo ainda era o quartel-general de onde não cessavam de partir as “bandeiras” e permanecia a pobreza em razão da carência de uma atividade econômica lucrativa. A virada na economia aconteceu na passagem do século XVIII para o XIX, quando as plantações de café substituíram as de cana-de-açúcar para ocupar o primeiro plano na economia nacional, especialmente depois que Dom Pedro declarou a Independência do Brasil, em 7 de setembro de 1822.\n" +
                    "\n" +
                    "São Paulo destacou-se no cenário nacional. A expansão da cultura do café exigiu a multiplicação das estradas de ferro. Foi um período de grandes transformações, marcado pela crise do sistema escravocrata, que levaria à Abolição em 1888 e que daria lugar, entre outros fatos, à chegada em massa de imigrantes, principal solução para a mão-de-obra na lavoura.\n" +
                    "\n" +
                    "O Estado prosperou e a capital da província passou por uma revolução urbanística e cultural. A chegada de milhares de imigrantes permitiu a ocupação do interior. Criaram-se as condições para pequenas fábricas darem início à industrialização, com o interior integrado ao crescimento da província. Novas estradas foram construídas e a prosperidade foi  sacramentada com a República.\n" +
                    "\n" +
                    "O fim do Império estava selado com a Abolição da Escravidão em 1888 e Dom Pedro II foi deposto no ano seguinte. O primeiro período republicano no Brasil, até 1930, foi controlado por São Paulo, Minas Gerais e Rio de Janeiro. A importância econômica do café de São Paulo e do gado de Minas Gerais sustentou a “política do café-com-leite”, com paulistas e mineiros se alternando na presidência da República. A ferrovia puxou a expansão da cafeicultura, atraiu imigrantes e permitiu a colonização de novas áreas.\n" +
                    "\n" +
                    "A industrialização avançava, criava novos contornos urbanos e abria espaço para novas classes sociais, o operariado e a classe média. Mais próspero do que nunca, e agora como Estado dentro da Federação, São Paulo via surgir a cada dia uma novidade diferente: a eletricidade, os primeiros carros; o crescimento das linhas de bondes elétricos e de grandes obras urbanas. Tudo se multiplicava e diversas vilas passaram a conviver com o apito das fábricas e com uma nova classe operária.\n" +
                    "\n" +
                    "A industrialização revelou o problema da geração de energia, solucionado em 1900 com a inauguração da Light. A capacidade de geração de energia foi decisiva para o desenvolvimento industrial entre 1930 e 1940. Nesse período, a aristocracia cafeeira viveu o seu apogeu. Mas a Revolução de 1930 colocou fim à liderança paulista, trazendo para o primeiro plano os Estados menores da Federação, sob a liderança do Rio Grande do Sul de Getúlio Vargas. As oligarquias paulistas promoveram a Revolução Constitucionalista em 1932, mas foram derrotadas, apesar da força econômica demonstrada.\n" +
                    "\n" +
                    "Nesta época os trilhos das ferrovias paulistas chegavam às proximidades do rio Paraná, e a colonização ocupava mais de um terço do Estado. As cidades se multiplicavam. Socialmente, o Estado, com seus mais de um milhão de imigrantes, tornou-se uma torre de Babel, profundamente marcado pelas diferentes culturas trazidas de mais de 60 países.\n" +
                    "\n" +
                    "Na última década da República Velha o modelo econômico e político mostrava seu esgotamento. Após a Revolução de 1930, o país viveu um período de instabilidade e veio a ditadura de Getúlio Vargas, que terminou com a Segunda Guerra Mundial e abriu um período de redemocratização e a instalação da chamada Segunda República.\n" +
                    "\n" +
                    "No plano econômico, o café superou a crise do início da década de 1930, favorecendo a recuperação de São Paulo. A indústria despontou e outro grande salto foi dado, com a chegada da indústria automobilística em São Paulo, carro-chefe da economia nacional a partir da década de 1950. O Estado paulista se transformou no maior parque industrial do país, posição que continuou a manter, apesar das transformações econômicas e políticas vividas pelo Brasil.","A cidade é mencionada oficialmente pela primeira vez quando a segunda expedição exploratória portuguesa, comandada por Gaspar lemos, chegou em Janeiro de 1502, à baía, que o navegador supôs, compreensivelmente, ser a foz de um rio, por conseguinte, dando o nome à região do Rio de Janeiro.\n" +
            "\n" +
            "\n" +
            "Porém só em 1530 a corte portuguesa mandou uma expedição para colonizar a área, em vez de continuar usando-a simplesmente como uma parada em suas aventuras marítimas. Os franceses, por outro lado, tinham estado no Rio de Janeiro e arredores desde o começo do século e estavam dispostos a lutar pelo domínio da região. Em 1560, depois de uma série de escaramuças, os portuguese expulsaram os franceses.\n" +
            "\n" +
            " \n" +
            "\n" +
            "O começo da cidade como tal foi no Morro de São Januário, mais tarde conhecido como Morro do Castelo, e depois na Praça Quinze até hoje centro vital do Rio.\n" +
            "\n" +
            " \n" +
            "\n" +
            "O Rio de Janeiro desenvolveu-se graças à sua vocação natural como porto. Na mesma época em que ouro foi descoberto no Estado de Minas Gerais, no final do século XVII, o Governador do Brasil foi feito Vice-rei. Salvador era capital da colônia, mas a importância crescente do porto do Rio garantiu a transferência da sede do poder para o sul, para a cidade que se tornaria, e ainda é, o centro intelectual e cultural do país.\n" +
            "\n" +
            " \n" +
            "\n" +
            "Em 1808 a família real portuguesa veio para o Rio de Janeiro, refúgio escolhido diante da ameaça de invasão napoleônica. Quando a família real voltou para Portugal e a independência do Brasil foi declarada em 1822, as minas de ouro já haviam sido exauridas e dado lugar a uma outra riqueza: o café.\n" +
            "\n" +
            " \n" +
            "\n" +
            "O crescimento continuou durante quase todo o século XIX, inicialmente na direção norte, para São Cristóvão e Tijuca, e depois na direção da zona sul, passando pela Glória, pelo Flamengo e por Botafogo. Em 1889, a capital do Império assistiu à queda da monarquia. As mudanças políticas seguiram as diretrizes capitalistas. A transição da Monarquia para a República começa em 1889 e só acaba, efetivamente, em 1930. A cidade, com a Proclamação da República, torna-se a capital federal.\n" +
            "\n" +
            "No começo do século XX surgiram as ruas largas e construções imponentes, a maioria no estilo francês fin-de-siècle. O Rio de Janeiro manteve sua posição até a inauguração de Brasília como capital da república em 1960. Capital do Estado do Rio de Janeiro, a cidade continua sendo o centro social e cultural do país.\n" +
            "\n" +
            "\n","O Distrito Federal localiza-se na Região Centro-Oeste do território brasileiro, cuja capital, Brasília, abriga a sede do Executivo federal, a Câmara dos Deputados, o Superior Tribunal de Justiça e o Supremo Tribunal Federal.\n" +
            "\n" +
            "O Distrito Federal não é um Estado e nem possui municípios, é um território autônomo composto por 30 Regiões administrativas (cidades-satélites); exceto Brasília, a capital federal e sede do governo do Distrito Federal.\n" +
            "\n" +
            "A construção da capital federal no Centro-Oeste brasileiro objetivou a ocupação do oeste do território nacional, pois, garantiria a ocupação de terras quase despovoadas e proporcionaria novas possibilidades de desenvolvimento econômico na região, além de ser menos vulnerável a ataques externos. O Distrito Federal está localizado numa porção de área que pertencia ao Estado de Goiás.\n" +
            "\n" +
            "Realmente o objetivo foi atingido, pois o contingente populacional da região teve um aumento significativo, entre as décadas de 1960 e 1970 a população do Distrito Federal quase quadruplicou, recebendo um fluxo migratório de mais de 30.000 pessoas anualmente. A construção de Brasília, além da continuidade de políticas públicas que visavam à ocupação e o desenvolvimento econômico da região, intensificou o fluxo migratório para o território.\n" +
            "\n" +
            "Seu projeto urbanístico foi desenvolvido por Lúcio Costa, e o projeto arquitetônico por Oscar Niemeyer. Aproximadamente 30 mil operários construíram Brasília em 41 meses, durante o governo do presidente Juscelino Kubitschek. A nova capital federal foi inaugurada no dia 21 de abril de 1960, data escolhida para homenagear Tiradentes.\n" +
            "\n" +
            "Brasília é a principal atração do Distrito Federal e em 1987 foi declarada pela Organização das Nações Unidas para a Educação, a Ciência e a Cultura (UNESCO) patrimônio cultural da humanidade, por seu valor arquitetônico e por ter sido a primeira cidade construída no século XX para ser uma capital.","4","5",
    };

    private String [] urlYouTube = {"EKQFxVNmCeQ","eUK-Fs1-IRg","rzorC6jdKPg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estados);

        listOfStates = findViewById(R.id.lvEstados);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_2,
                android.R.id.text2,
                states

        );

        listOfStates.setAdapter(adapter);

        listOfStates.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int codePosition = position;

                String auxToPutExtraTitle = states[codePosition];
                String auxToPutExtra = describeStates[codePosition];
                String auxToPutExtraVideo = urlYouTube[codePosition];

                Intent nextIntent = new Intent(EstadosActivity.this, DescreveEstadoActivity.class);
                finish();
                nextIntent.putExtra("Desc", auxToPutExtra);
                nextIntent.putExtra("title", auxToPutExtraTitle);
                nextIntent.putExtra("Url", auxToPutExtraVideo);
                startActivity(nextIntent);

            }
        });



    }

}
