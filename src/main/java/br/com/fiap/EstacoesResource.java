package br.com.fiap;
import br.com.fiap.beans.Estacao;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/estacoes")
public class EstacoesResource {

    Estacao estacao1 = new Estacao("Luz","Integração com as linhas 1-Azul e 7-Rubi. Fica no centro histórico e próximo à Pinacoteca e à Estação da Luz.","https://mobilidade.grupoccr.com.br/content/Site-Mobilidade/pt/viaquatro/linha-4---amarela/luz/_jcr_content/root/container/v1_copy_copy_copy/block_pageheader/atomImage.coreimg.png/1734717253684/image--12-.png",1);
    Estacao estacao2 = new Estacao("República","Conecta com a linha 3-Vermelha. Região movimentada, com comércio e acesso à Avenida Ipiranga e à Praça da República.","https://mobilidade.grupoccr.com.br/content/Site-Mobilidade/pt/viaquatro/linha-4---amarela/republica/_jcr_content/root/container/v1_copy_copy_copy/block_pageheader/atomImage.coreimg.png/1734717233916/image--11-.png",2);
    Estacao estacao3 = new Estacao("Hifienópolis-Mackenzie","Próxima à Universidade Presbiteriana Mackenzie e ao bairro de Higienópolis, conhecido por ser residencial e de classe média-alta.","https://s2-g1.glbimg.com/QQLIf3QJq6PNc3ijr_3eKae_fis=/1200x/smart/filters:cover():strip_icc()/s04.video.glbimg.com/x720/6441519.jpg",3);
    Estacao estacao4 = new Estacao("Paulista","Integra com a linha 2-Verde (Consolação). Fica na famosa Avenida Paulista, centro financeiro e cultural da cidade.","https://s2-g1.glbimg.com/xQVy51oXosiXJ_ALLfjW423ohps=/0x0:2768x1556/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2023/5/Y/5NOO8YTKGWN8OnfzFNow/dsc08873.jpg",4);
    Estacao estacao5 = new Estacao("Oscar Freire","Sofisticada, luxuosa, charmosa, elegante, fashion, gourmet, arborizada, cara, exclusiva, moderna.","https://www.metrocptm.com.br/wp-content/uploads/2018/04/oscarfreire-fg-02.jpg",5);
    Estacao estacao6 = new Estacao("Fradique Coutinho","Integra com a linha 9-Esmeralda (CPTM). Próxima ao terminal de ônibus e ao Largo da Batata, com bastante fluxo de pessoas.","https://mobilidade.grupoccr.com.br/content/Site-Mobilidade/pt/viaquatro/linha-4---amarela/fradique-coutinho/_jcr_content/root/container/v1_copy_copy_copy/block_pageheader/atomImage.coreimg.png/1734716798893/image--8-.png",6);
    Estacao estacao7 = new Estacao("Faria Lima","Região comercial e de escritórios. Próxima à Avenida Brigadeiro Faria Lima, um dos polos financeiros de São Paulo.","https://mobilidade.grupoccr.com.br/content/Site-Mobilidade/pt/viaquatro/linha-4---amarela/faria-lima/_jcr_content/root/container/v1_copy_copy_copy/block_pageheader/atomImage.coreimg.png/1734736474170/image--13-.png",7);
    Estacao estacao8 = new Estacao("Pinheiros","Integra com a linha 9-Esmeralda (CPTM). Próxima ao terminal de ônibus e ao Largo da Batata, com bastante fluxo de pessoas.","https://upload.wikimedia.org/wikipedia/commons/3/37/Esta%C3%A7%C3%A3o_Pinheiros_-_L4.jpg",8);
    Estacao estacao9 = new Estacao("Butantã","Próxima à USP e ao Instituto Butantan. Tem terminal de ônibus que conecta com várias regiões da zona oeste.","https://vault.pulsarimagens.com.br/file/preview/24RC562.jpg",9);
    Estacao estacao10 = new Estacao("Sao Paulo-Morumbi","Atende a região do estádio do Morumbi e da Cidade Universitária. Fica em uma área residencial com centros comerciais próximos.","https://b3577058.smushcdn.com/3577058/wp-content/uploads/2022/12/Estacao-Morumbi-metro-sp-Viviane-Giacometti-1-720x511.jpg?lossy=1&strip=0&webp=1",10);
    Estacao estacao11 = new Estacao("Vila Sônia"," Estação terminal da linha (por enquanto). Atende a zona oeste com ligação a bairros residenciais e terminais de ônibus urbanos.","https://www.quintoandar.com.br/guias/wp-content/uploads/2024/06/Estacao-Vila-Sonia.webp",11);





    Estacao[] estacoes = {estacao1, estacao2, estacao3, estacao4, estacao5, estacao6, estacao7, estacao8, estacao9, estacao10, estacao11};

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Estacao[] estacoes(){
        return estacoes;
    }
}
