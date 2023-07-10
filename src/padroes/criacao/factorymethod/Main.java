package padroes.criacao.factorymethod;

public class Main {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
        //Obtém o nome da imagem (para mudar, alterar o parâmetro abaixo)
        String image = "image.gif";

        //Obtém a extensão do arquivo (.jpg, gif, etc)
        String format = image.substring(image.indexOf('.') + 1, (image.length()));
        if (format.equals("gif")) {
            reader = new GifReader(image);
        }
        if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }
        assert reader!= null; //leitor não pode ser null (assert é usado para 'evitar' try...catch)
        decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }
}
