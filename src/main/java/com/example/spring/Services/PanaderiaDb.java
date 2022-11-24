package com.example.spring.Services;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.spring.Models.Panes;

public class PanaderiaDb {
    Connection _cn;

    public PanaderiaDb() {
        _cn = new Conexion().openDb();
      }
    
      public List<Panes> ObtenerPanes() {
        try {
          Statement stmt = _cn.createStatement();
          String query = "SELECT * FROM panes";
    
          List<Panes> panes = new ArrayList<>();
          ResultSet result = stmt.executeQuery(query);
          while (result.next()) {
            String name = result.getString("nombre");
            Panes pan = new Panes(
                result.getString("nombre"),
                result.getString("fotoUrl"),
                result.getString("descripcion")
                );
            panes.add(pan);
          }
          result.close();
          stmt.close();
          return panes;
    
        } catch (Exception e) {
          int x = 1;
        }
        return null;
      }
    
}
