public class TestaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Untitled Red Tower 2023 Release", "desconhecido", "Entangled: Red Tower Books", 2023);
        Livro livro2 = new Livro("Iron Flame (The Empyrean, 2)", "Rebecca Yarros", "Entangled: Red Tower Books", 2023);
        Livro livro3 = new Livro("Going Infinite: The Rise and Fall of a New Tycoon", "Michael Lewis", "W. W. Norton & Company", 2023);

        System.out.println("Livro 1:\n" + livro1.toString() + "\n");
        System.out.println("Livro 2:\n" + livro2.toString() + "\n");
        System.out.println("Livro 3:\n" + livro3.toString());
    }
}