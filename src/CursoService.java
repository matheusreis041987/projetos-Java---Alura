import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CursoService {

    ConnectionFactory connection;

    public CursoService () {
        this.connection = new ConnectionFactory();
    }


    public void criarCurso (Curso curso) {


        String sql = "insert into curso (id, nome, categoria_id) values (?, ?,?)";

        Connection conn = connection.recuperarConexao();

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(2, curso.nome);
            preparedStatement.setInt(3,curso.categoriaId);
            preparedStatement.setInt(1, curso.id);
            preparedStatement.execute();
            preparedStatement.close();
            conn.close();


        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }

    public Set<Curso> listarCursos(){
        Connection conn = connection.recuperarConexao();
        Set<Curso> cursos = new HashSet<>();
        String sql = "select * from curso";

        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()){

                Integer id = resultSet.getInt(1);
                String nome = resultSet.getString(2);
                Integer categoriaId = resultSet.getInt(3);
                Curso curso = new Curso();
                curso.id = id;
                curso.nome = nome;
                curso.categoriaId = categoriaId;

                cursos.add(curso);


            }

            resultSet.close();
            ps.close();
            conn.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return cursos;
    }


    public List<Curso> listarCursos2(){
        Connection conn = connection.recuperarConexao();
        List<Curso> cursos = new ArrayList<>();
        String sql = "select * from curso";

        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()){

                Integer id = resultSet.getInt(1);
                String nome = resultSet.getString(2);
                Integer categoriaId = resultSet.getInt(3);
                Curso curso = new Curso();
                curso.id = id;
                curso.nome = nome;
                curso.categoriaId = categoriaId;

                cursos.add(curso);


            }
            resultSet.close();
            ps.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return cursos;
    }

    public Curso listarPorId(Integer id){
        Connection conn = connection.recuperarConexao();
        String sql = "select * from curso where id = ?";
        PreparedStatement ps;
        ResultSet resultSet;
        Curso curso = null;

        try{
            ps =conn.prepareStatement(sql);
            ps.setInt(1,id);
            resultSet = ps.executeQuery();

            while (resultSet.next()){
                Integer idBase = resultSet.getInt(1);
                String nome = resultSet.getString(2);
                Integer categoriaId = resultSet.getInt(3);
                curso = new Curso();
                curso.id = idBase;
                curso.nome = nome;
                curso.categoriaId = categoriaId;
            }
            resultSet.close();
            ps.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return curso;

    }

    public List<Curso> listarPorCurso(String nomeCurso){
        List<Curso> cursos = new ArrayList<>();
        Connection conn = connection.recuperarConexao();
        String sql = "select * from curso where nome like ? or nome like ? or nome like ?";
        PreparedStatement ps;
        ResultSet resultSet;
        Curso curso = null;

        try{
            ps =conn.prepareStatement(sql);
            ps.setString(1,nomeCurso);
            ps.setString(2,'%' + nomeCurso);
           ps.setString(3,'%' + nomeCurso + '%');
            resultSet = ps.executeQuery();

            while (resultSet.next()){
                Integer idBase = resultSet.getInt(1);
                String nome = resultSet.getString(2);
                Integer categoriaId = resultSet.getInt(3);
                curso = new Curso();
                curso.id = idBase;
                curso.nome = nome;
                curso.categoriaId = categoriaId;
                cursos.add(curso);
            }
            resultSet.close();
            ps.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cursos;

    }



    public List<Curso> listarCompletaPorCurso(String nomeCurso){
        List<Curso> cursos = new ArrayList<>();
        Connection conn = connection.recuperarConexao();
        String sql = "select " +
                "cu.id, cu.nome, ca.nome as categoria from curso as cu  " +
                "left join categoria as ca on (cu.categoria_id = ca.id) " +
                "where cu.nome like ? or cu.nome like ? or cu.nome like ?";
        PreparedStatement ps;
        ResultSet resultSet;
        Curso curso = null;

        try{
            ps =conn.prepareStatement(sql);
            ps.setString(1,nomeCurso);
            ps.setString(2,'%' + nomeCurso);
            ps.setString(3,'%' + nomeCurso + '%');
            resultSet = ps.executeQuery();

            while (resultSet.next()){
                Integer idBase = resultSet.getInt(1);
                String nome = resultSet.getString(2);
                String categoria = resultSet.getString(3);
                curso = new Curso();
                curso.id = idBase;
                curso.nome = nome;
                curso.categoria = categoria;
                cursos.add(curso);
            }
            resultSet.close();
            ps.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cursos;

    }


}
