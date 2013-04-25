Placar de Judô
======

O projeto consiste em criar um placar para competições de Judô.

[Download](https://www.dropbox.com/s/ye30hasvblir0l2/placar.jar)
============


Resumo do projeto
---------------------
O projeto consiste em criar um placar para competições de Judô. O placar deve apresentar, além do tempo decorrido, as pontuações obtidas por cada participante no decorrer da luta e tempo de osaekomi (tempo que um competidor consegue imobilizar o outro no solo), quando necessário. As pontuações em uma competição de judô podem ser waza-aris e yukos, podendo haver também um ippon, porém, quando um ippon é atingido, significa que o término da luta foi alcançado e o competidor que conseguiu essa pontuação é o vencedor. São necessárias também que se apresentem as penalidades. No judô existem dois tipo de penalidade, uma delas é o shido. Um shido serve apenas para chamar a atenção do competidor, o segundo shido equivale a um waza-ari e o terceiro shido equivale a um yuko  e devem ser descontados das pontuações adquiridas do competidor penalizado. A outra penalização é o hansoku make  que significa a desclassificação do competidor e que também pode ser adquirido pelo acúmulo de quatro shidos. Quando a pontuação ou o tempo total da luta for atingido deve ser avisado no placar que a luta terminou e quem foi o vencedor. Textos podem ser adicionados a esse placar, como exemplo: categoria da luta e informações do campeonato.

Objetivo do projeto
---------------------
Objetivo desse projeto é criar um placar para competições de Judô. Esse placar deve apresentar as informações necessárias para que torne-se fácil o entendimento dos acontecimentos da competição para quem está assistindo e para os árbitros. Esse projeto será de código-aberto e livre, podendo ser utilizado, modificado e distribuído por qualquer um que tenha interesse sendo disponibilizado no gitHub. 
No placar, devem aparecer, obrigatoriamente, as pontuações e penalidades, tempo decorrido da luta e tempo de osaekomi. Porém, poderão ser adicionadas informações adicionais. 

Como funciona 
---------------------
A partir de comandos do teclado você pode manipular um teclador de judô. Adicionando pontuações e penalizações, e ainda inicializando o tempo de osaekomi.

Comandos
---------------------

<pre><code>

-1 &lt;Inicia a contagem de tempo da luta&gt;
Comandos do Competidor 1:

-q &lt;Adiciona um Yuko&gt;
-w &lt;Adiciona um Wazari&gt;
-e &lt;Adiciona um Ippon&gt;
-r &lt;Adiciona um Shido&gt;
-q &lt;Inicia o osaekomi&gt;

Comandos do Competidor 2:

-a &lt;Adiciona um Yuko&gt;
-s &lt;Adiciona um Wazari&gt;
-d &lt;Adiciona um Ippon&gt;
-f &lt;Adiciona um Shido&gt;
-g &lt;Inicia o osaekomi&gt;

</code></pre>



