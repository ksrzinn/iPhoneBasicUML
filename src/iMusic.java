public class iMusic implements iPhone{
    private String[] musicas = {"Musica1", "Musica2", "Musica3"};

    public void tocarMusica(int escolha){
        System.out.println("Tocando " + musicas[escolha]);
    }

    public void proximaMusica(){
        System.out.println("Proxima música");
    }

    public void pausarMusica(){
        System.out.println("Pausando música");
    }
}
