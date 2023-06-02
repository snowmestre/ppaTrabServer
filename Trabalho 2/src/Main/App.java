package Main;
import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class App {
  public static void main(String[] args) throws Exception {
    // http://localhost:8081

    String host = "localhost";
    int port = 8081; // > 1024 (443 HTTPS)
    InetSocketAddress addr = new InetSocketAddress(host, port);
    int backlog = 0;
    HttpServer server = HttpServer.create(addr, backlog);
    HttpHandler listaAlunosHandler = new ListaUsuariosHttpHandler();
    HttpHandler listaCursosHandler = new ListaCursosHttpHandler();
    server.createContext("/usuarios", listaAlunosHandler);
    server.createContext("/cursos", listaCursosHandler);
    System.out.println("Servidor ouvindo em " + host + ":" + port);
    server.start();

  }
}

class ListaUsuariosHttpHandler implements HttpHandler {

  @Override
  public void handle(HttpExchange x) throws IOException {

   // List<Usuario> usuarios = new ArrayList<Usuario>();
  
    String resposta = "<html><head><title>Seus Usuários</title></head><body>Oi Usuários, <strong>Melhora isso pelo Amor, by Márcio</strong></body></html>";

    x.getResponseHeaders().add("Content-Type", "text/html");
    x.getResponseHeaders().add("Curso-IFRS", "TADS");
    x.sendResponseHeaders(200, resposta.length());
    
    x.getResponseBody().write(resposta.getBytes());

  }
}

class ListaCursosHttpHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange x) throws IOException {
    
     // List<Curso> cursos = new ArrayList<Curso>();
      
      String resposta = "<html><head><title>Seus Cursos</title></head><body>Oi Cursos, <strong>Melhora isso pelo Amor, by Márcio</strong></body></html>";

      x.getResponseHeaders().add("Content-Type", "text/html");
      x.getResponseHeaders().add("Curso-IFRS", "TADS");
      x.sendResponseHeaders(200, resposta.length());
        
      x.getResponseBody().write(resposta.getBytes());
    
    }
  }
    



