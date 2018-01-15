import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

public class Main {

    public static void main(String[] args) throws  Exception{

        DataSource dataSource =  new ComboPooledDataSource("helloc3p0");
        System.out.println(dataSource.getConnection());
        ComboPooledDataSource comboPooledDataSource =
                (ComboPooledDataSource)dataSource;
        System.out.println(comboPooledDataSource.getMaxStatements());
        /*ComboPooledDataSource cpds = new ComboPooledDataSource();
        cpds.setDriverClass("com.mysql.jdbc.Driver");
        cpds.setJdbcUrl("jdbc:mysql:///peixun");
        cpds.setUser("root");
        cpds.setPassword("");
        System.out.println(cpds.getConnection());*/
    }
}
