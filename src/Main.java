public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Véspera","Carla Madeira",2018);
        System.out.println("Título: " + l1.getTitulo());
        System.out.println("Autor: " + l1.getAutor());
        System.out.println("Ano de publicção: " + l1.getAnoDePublicacao());
    }
}