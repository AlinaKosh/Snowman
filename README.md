# Chess
public class Main extends Canvas{

    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("64 квадрата в квадрате в квадрате по квадрату");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setBounds(dim.width/2-width/2,dim.height/2-height/2, width,height+30);
        Main m=new Main();
        frame.add(m);
        frame.setVisible(true);

    }

        static int width = 300, height=300;//размеры окна

        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g; //преобразуем Graphics в Graphics2D (для сглаживания)
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON); //сглаживание
            g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            try {
                URLConnection openConnection = new URL("https://schach-seminare.eu/components/com_jshopping/files/img_products/thumb_BE.png").openConnection();
                openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
                BufferedImage image = ImageIO.read(openConnection.getInputStream());
                int imageWidth = image.getWidth(), imageHeight=image.getHeight();
                int y = 50, x = y, d=y;
                while (true) {//двигаемся по квадрату, с очисткой области через паузу
                    if (x<width-d-imageWidth && y==d)
                        x++;
                    if (x==width-d-imageWidth && y<height-d-imageHeight)
                        y++;
                    if (x>d && y==height-d-imageHeight)
                        x--;
                    if (x==d && y>d)
                        y--;
                    g2.drawImage(image, x, y, this);
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch(InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }
                    g2.clearRect(x, y, imageWidth, imageHeight);

                }
            } catch (IOException e) {
                g.drawString("Ошибка", 10,10);
            }
        }


}
