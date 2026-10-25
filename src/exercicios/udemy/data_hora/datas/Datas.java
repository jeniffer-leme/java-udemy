package exercicios.udemy.data_hora.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Datas {
    public static void main(String[] args) throws ParseException {
        
        // Criação de formatadores de data (SimpleDateFormat)
        
        // sdf1: Formata apenas a data (Dia/Mês/Ano)
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        
        // sdf2: Formata data e hora usando o fuso horário LOCAL do seu computador
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        // sdf3: Formata data e hora, mas será ajustado para o padrão global (GMT)
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        // Configura o sdf3 para forçar o fuso horário para GMT (Greenwich Mean Time / UTC)
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        // --- INSTANCIAÇÃO DE DATAS (com base no milissegundo desde 01/01/1970 - Epoch) ---
        
        // x1: Pega a data e hora exata do sistema neste exato milissegundo (agora)
        Date x1 = new Date();
        // x2: Faz exatamente a mesma coisa que o x1, obtendo o horário atual em milissegundos
        Date x2 = new Date(System.currentTimeMillis());
        // x3: Cria a data "zero" do sistema (01/01/1970 às 00:00:00 GMT)
        Date x3 = new Date(0L);
        // x4: Adiciona 5 horas em milissegundos a partir da data zero (1000ms * 60s * 60m * 5h)
        Date x4 = new Date(1000L * 60L * 60L * 5L);
        
        // --- LEITURA DE TEXTOS PARA O FORMATO DATE (Parsing) ---
        
        // y1: Converte uma String de data simples em um objeto Date (a hora fica 00:00:00)
        Date y1 = sdf1.parse("25/06/2018");
        // y2: Converte uma String com data e hora usando o fuso horário local
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        // y3: Cria um Date a partir de um Instant no formato ISO 8601 (já no padrão Zulu/GMT)
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        
        // --- BLOCO 1: IMPRESSÃO PADRÃO (toString) ---
        // O método toString() do Date imprime a data utilizando o fuso horário do seu computador (ex: America/Sao_Paulo)
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3); // Vai aparecer 3h da manhã (se você estiver no Brasil GMT-3)
        System.out.println("x4: " + x4); // Vai aparecer 05:00:00 (baseado na data zero + 5h)
        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3); // O Instant imprime direto em formato ISO 8601 (com o 'Z' no final)
        
        System.out.println("-------------");
        
        // --- BLOCO 2: IMPRESSÃO FORMATADA (Com sdf2 - Fuso Local) ---
        // Aqui usamos o sdf2 para exibir as datas legíveis, mas ainda aplicando o fuso horário local do PC
        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf2.format(y3)); // Converte o Instant (GMT) para a hora local do seu PC
        
        System.out.println("-------------");
        
        // --- BLOCO 3: IMPRESSÃO GLOBAL (Com sdf3 - Fuso GMT) ---
        // Aqui usamos o sdf3 configurado com TimeZone("GMT"). 
        // Ele pega o valor em milissegundos guardado no objeto Date e o exibe no horário de Londres (GMT/UTC), sem o deslocamento do seu país.
        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3)); // Aqui vai mostrar exatamente 01/01/1970 00:00:00 (sem as 3h de diferença do Brasil)
        System.out.println("x4: " + sdf3.format(x4)); // Vai mostrar 05:00:00 exatas
        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println("y3: " + sdf3.format(y3));
    }
}