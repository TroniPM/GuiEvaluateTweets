/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guievaluatetweets;

/**
 *
 * @author Mateus
 */
public class Tweet {

    public String id = null;
    public String data = null;
    public String usuario = null;
    public String localizacao = null;
    public String idioma = null;
    public String tweet = null;
    public String rotulo = null;

    public void print() {
        System.out.println("id: " + id);
        System.out.println("data: " + data);
        System.out.println("usuario: " + usuario);
        System.out.println("localizacao: " + localizacao);
        System.out.println("idioma: " + idioma);
        System.out.println("tweet: " + tweet);
        System.out.println("rotulo: " + rotulo);
    }

    public String export() {
        String sep = (JFramePrincipal.separadorExport == 0) ? ";" : ",";
        //data;tweet_id;usuario;localizacao;idioma;tweet;rotulo
        return data.replace("/", "") + sep + id + sep + usuario + sep
                + localizacao + sep + idioma + sep + tweet + sep + rotulo + "\n";
    }
}
