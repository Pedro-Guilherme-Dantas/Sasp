package audios;


import java.util.Random;
import java.util.ArrayList;

public class SonsF {

    private ArrayList<String> arr = new ArrayList();
    private String palavra = "Acuar.wav";

    private int f = 0;

    private ArrayList<String> vf;
    private ArrayList<String> vm;
    private ArrayList<String> vd;
    
    private ArrayList<String> sF;
    private ArrayList<String> sM;
    private ArrayList<String> sD;
    
    
    public SonsF() {
        vf = new ArrayList<>();
        String v[] = {"Acuar.wav", "Apocotar.wav", "Absurdo.wav", "Alfândega.wav", "Suscitar.wav", "Insolente.wav", "Excesso.wav", "Implícito.wav",
            "Obsoleto.wav", "Óbvio.wav", "Minucioso.wav", "Exceder.wav", "Cloroplasto.wav", "Colmeia.wav", "Guarda-Chuva.wav", "Vassalo.wav",
            "Versículo.wav", "Lêmure.wav", "Discussão.wav", "Coeficiente.wav", "Comichão.wav", "Bússola.wav", "Harmonioso.wav",
            "Glóbulo.wav", "paraquedas.wav", "Vitória-Régia.wav", "Hífen.wav", "Flexível.wav", "Depressão.wav", "Algoritmo.wav"};
        for (String s : v) {
            vf.add(s);
        }
        
        vm = new ArrayList<>();
        String v1[] = {"Beatificação.wav","Bonançoso.wav","Concussão.wav","Dislexia.wav","Elucubrações.wav"
                    ,"Empedernido.wav","Esbaforiadamente.wav","Filaucioso.wav","Frugífero.wav","Graçolar.wav",
                    "Iconoclasta.wav","Ignóbil.wav","Melissorafia.wav","Pernóstico.wav","Prognóstico.wav",
                    "Secesso.wav","Suscitar.wav","Tergiversar.wav","Zoomórfico.wav"};
        for (String s : v1) {
            vm.add(s);
        }
        
         vd = new ArrayList<>();
        String v2[] = {"Cóccix.wav","Desconstitucionalização.wav","Desoxigenação.wav","Idiossincrasia.wav"
                ,"Occipital.wav","Ornitorrinco.wav","Otorrinolaringologista.wav","Perspicácia.wav",
                "Vicissitude.wav","anticonstitucionalissimamente.wav"};
        for (String s : v2) {
            vd.add(s);
        }
//------------------------------------------------------------------------------------------------------------------------        
    sF = new ArrayList<>();    
    String[] significadosF = {"Dobrar as pernas e encolher o corpo próximo do chão.",
    "Truncar o final de uma palavra por supressão de sílaba ou letra.",
    "Que não se enquadra em regras e condições estabelecidas.",
    "Administração pública que fiscaliza as mercadorias que entram ou saem do país.",
    "Fazer surgir, encorajar, provocar.",
    "Desaforado, desagradável.",
    "Falta de moderação.",
    "Escondido, não expresso, omisso.",
    "Que caiu em desuso.",
    "Claro.",
    "Detalhista.",
    "Ir além de.",
    "Plastídio que contém clorofila e é sede da fotossíntese e da formação de amido; cloroleucito.",
    "Cortiço ou outra instalação de abelhas preparada naturalmente por elas, ou artificialmente para criá-las.",
    "Objeto portátil, de armação de tecido impermeável, que protege da chuva ou do sol quando aberto.",
    "Algo ou alguém que se submete às ordens de outrem.",
    "Subdivisão de artigo / parágrafo.",
    "Mamífero primata, de hábitos noturnos, braços relativamente curtos, dedos livres e cauda longa e peluda.",
    "Conversa polêmica em que cada pessoa é responsável por defender seu ponto de vista",
    "Número que indica quantas vezes se deve multiplicar por outro.",
    "Sensação de ligeiras picadas.",
    "Aparelho composto de um mostrador, onde se indicam os pontos cardeais.",
    "Que se apresenta de maneira proporcional ou coerente.",
    "Pequeno corpo esférico.",
    "Artefato usado para amortecer a queda pelo ar de pessoas e cargas.",
    "Planta aquática, pertencente à família das ninfeáceas.",
    "Traço horizontal que indica a separação de um nome composto.",
    "Que se consegue curvar ou dobrar facilmente.",
    "Ação ou efeito de deprimir, de se abater física ou moralmente.",
    "Matemática Sequência de raciocínios ou operações que oferece a solução de certos problemas."};
    
    for(String s: significadosF){
        sF.add(s);
    }
    
    sM = new ArrayList<>();
    String [] significadosM = {"Cerimônia pela qual o Papa declara digna de veneração alguma pessoa falecida.",
    "Tranquilo; sereno; propício.",
    "Abalo, choque violento, pancada.",
    "Distúrbio genético e neurobiológico.",
    "Sinônimo de conjectura, consideração e especulação.",
    "Aquele que não se deixa persuadir ou não se comove.",
    "Ofegante.",
    "Presunçoso.",
    "Frutífero.",
    "Dizer brincadeiras.",
    "Aquele que contesta venerar símbolos religiosos.",
    "Sem caráter, vergonhoso.",
    "Descrição dos costumes das abelhas.",
    "Pretensioso, esnobe.",
    "Que indica previsão.",
    "Apartamento, retiro.",
    "Fazer surgir, encorajar, provocar.",
    "Fugir do principal assunto, enrolar.",
    "Que apresenta forma de animal."};
    
    for(String s: significadosM){
        sM.add(s);
    }
    
    sD = new ArrayList<>();
    String[] significadosD = {"Osso da parte inferior da coluna vertebral.",
    "Retirar da constituição.",
    "Ação de retirar o O2 de uma mistura.",
    "Sinônimo de característica e particularidade.",
    "Osso posterior do crânio.",
    "Mamífero semiaquático natural da Austrália.",
    "Parte da Medicina que se ocupa do estudo e do tratamento das doenças dos ouvidos, do nariz e da garganta.",
    "Sagacidade.",
    "Sequência de mudanças ou transformações.",
    "De modo muito contra a constituição."};
    
    for(String s: significadosD){
        sD.add(s);
    }
    
    }

    public String[] sorteioF() {
        Random r = new Random();
        int n  = r.nextInt(vf.size());
        String palavra = vf.get(n);
        String significado = sF.get(n);
        vf.remove(n);
        sF.remove(n);
        String[] x = {palavra,significado};
        return x;
    }
    
    public String[] sorteioM() {
        Random r = new Random();
        int n  = r.nextInt(vm.size());
        String palavra = vm.get(n);
        String significado = sM.get(n);
        vm.remove(n);
        sM.remove(n);
        String[] x = {palavra,significado};
        return x;
    }
    
    public String[] sorteioD() {
        Random r = new Random();
        int n  = r.nextInt(vd.size());
        String palavra = vd.get(n);
        String significado = sD.get(n);
        vd.remove(n);
        sD.remove(n);
        String[] x = {palavra,significado};
        return x;
    }
    

    
}
