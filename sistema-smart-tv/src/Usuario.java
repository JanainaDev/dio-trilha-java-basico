public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        smartTv.diminuirVolume();

        System.out.println("Canal Atual: " +smartTv.canal); // antes de mudar
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " +smartTv.canal); // depois de mudar

        System.out.println("TV ligada ? " +smartTv.ligada);     // antes de ligar
        smartTv.ligar ();                                      // chamando o método de ligar 
        System.out.println("Novo status -> Tv ligada ? " + smartTv.ligada); // depois de ligar

        System.out.println("Volume atual: " +smartTv.volume); 
    }
}
